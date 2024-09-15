// https://leetcode.com/problems/remove-max-number-of-edges-to-keep-graph-fully-traversable/description/?envType=daily-question&envId=2024-06-30

class dsu{
    private int[] parent;
    private int [] rank;
    private int comp;

    public dsu(int n){
        parent = new int[n+1];
        rank = new int[n+1];
        comp = n;

        for(int i = 1; i <= n; i++) parent[i] = i;
    }

    public int find(int x){
        if (x == parent[x]) return x;

        return parent[x] = find(parent[x]);
    }

    public void union(int x, int y){
        int xP = find(x);
        int yP = find(y);

        if(xP == yP) return;

        if(rank[xP] > rank[yP]) parent[yP] = xP;
        else if(rank[yP] > rank[xP]) parent[xP] = yP;
        else{
            parent[xP] = yP;
            rank[yP]++;
        }

        comp--;
    }

    public boolean isSingle(){
        return comp == 1;
    }


}

class Solution {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        Arrays.sort(edges, (v1, v2) -> v2[0] - v1[0]);
        dsu a = new dsu(n);
        dsu b = new dsu(n);
        int aE = 0;

        for(int[] e : edges){

            if(e[0] == 3){
                boolean aD = false;

                if(a.find(e[1]) != a.find(e[2])){
                    a.union(e[1], e[2]);
                    aD = true;
                }

                if(b.find(e[1]) != b.find(e[2])){
                    b.union(e[1], e[2]);
                    aD = true;
                }

                if(aD) aE++;
            }
            else if (e[0] == 2){
                if(a.find(e[1]) != a.find(e[2])){
                    a.union(e[1], e[2]);
                    aE++;
                }
            }
            else {
                if(b.find(e[1]) != b.find(e[2])){
                    b.union(e[1], e[2]);
                    aE++;
                }
            }
        }

        if(a.isSingle() && b.isSingle()) return edges.length - aE;

        return -1;
    }
}
