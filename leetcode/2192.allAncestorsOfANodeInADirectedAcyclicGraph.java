// https://leetcode.com/problems/all-ancestors-of-a-node-in-a-directed-acyclic-graph/description/?envType=daily-question&envId=2024-06-29

class Solution {

    public void DFS(int ancestor, Map<Integer, List<Integer>> adj, int currNode, List<List<Integer>> result) {
        for (int ngbr : adj.getOrDefault(currNode, new ArrayList<>())) {
            if (result.get(ngbr).isEmpty() || result.get(ngbr).get(result.get(ngbr).size() - 1) != ancestor) { 
                result.get(ngbr).add(ancestor);
                DFS(ancestor, adj, ngbr, result);
            }
        }
    }

    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> result = new ArrayList<>(n);
        Map<Integer, List<Integer>> adj = new HashMap<>();

        for (int i = 0; i < n; i++) {
            result.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v); 
        }

        for (int i = 0; i < n; i++) {
            int ancestor = i;
            DFS(ancestor, adj, i, result);
        }

        return result;
    }
}

// class Solution {
//     public List<List<Integer>> getAncestors(int n, int[][] edges) {

//         HashMap<Integer, HashSet<Integer>> p2c = new HashMap<>();
//         int[] nop = new int[n];

//         for(int[] x : edges){
//             if(!p2c.containsKey(x[0])) p2c.put(x[0], new HashSet<>());
//             p2c.get(x[0]).add(x[1]);
//             nop[x[1]]++;
//         }

//         List<TreeSet<Integer>> c2p = new ArrayList<>();
//         Queue<Integer> q = new LinkedList<>();

//         for(int i = 0; i < n; i++){
//             c2p.add(new TreeSet<>());
//             if(nop[i] == 0) q.offer(i);
//         }

//         while(!q.isEmpty()){
//             int cp = q.remove();    
            
//             for(int cc : p2c.getOrDefault(cp, new HashSet<>())){
//                 c2p.get(cc).add(cp);
//                 c2p.get(cc).addAll(c2p.get(cp));

//                 nop[cc]--;

//                 if(nop[cc] == 0) q.offer(cc);
//             }
//         }

//         List<List<Integer>> r = new ArrayList<>();

//         for(int i = 0; i < n; i++) r.add(new ArrayList<>(c2p.get(i)));

//         return r;
//     }
// }

// class Solution {
//     public List<List<Integer>> getAncestors(int n, int[][] edges) {

//         List<List<Integer>> r = new ArrayList<>();

//         for (int i = 0; i < n; i++) r.add(new ArrayList<>());

//         for(int[] x : edges) r.get(x[1]).add(x[0]);

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < r.get(i).size(); j++) {
//                 int anc = r.get(i).get(j);
//                 for (int k = 0; k < r.get(anc).size(); k++) {
//                     int ana = r.get(anc).get(k);
//                     if (!r.get(i).contains(ana)) r.get(i).add(ana);
//                 }
//             }
//         }

//         for (List<Integer> x : r) Collections.sort(x);
//         return r;  
        
//     }
// }
