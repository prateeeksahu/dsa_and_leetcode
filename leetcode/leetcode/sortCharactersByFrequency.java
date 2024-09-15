// https://leetcode.com/problems/sort-characters-by-frequency/?envType=daily-question&envId=2024-02-07

class Solution {
    public String frequencySort(String s) {
        char [] sarr = s.toCharArray();
        Arrays.sort(sarr);

        char ch = sarr[0];
        int cnt = 0;
        ArrayList<pair> charfreq = new ArrayList<>();
        pair ph = new pair(0, sarr[0]);

        for(char chh : sarr){
            if(chh == ch){
                cnt++;
            } else{
                pair p = new pair(cnt, ch);
                charfreq.add(p);
                ch = chh;
                cnt = 1;
                ph = p;
            }

            
        }
        pair lp = new pair(cnt, ch);
        charfreq.add(lp);

        // charfreq.sort(Comparator.comparing(p -> p.c));
        charfreq.sort((p1, p2) -> Integer.compare(p2.c, p1.c)); 

        String res = "";

        for(int i = 0; i<charfreq.size(); i++){
            pair p = charfreq.get(i);
            char chhh = p.ch;
            int cntt = p.c;

            while(cntt>0){
                res += chhh + "";
                cntt--;
            }


        }

        return res;

    }

    class pair{
        int c;
        char ch;

        pair(int c, char ch){
            this.c = c;
            this.ch = ch;
        }
    }
}
