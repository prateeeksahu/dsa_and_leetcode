class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> res = new ArrayList<>();

        if (strs == null || strs.length == 0) {
            return res;
        }

        pair [] pairs = new pair [strs.length];

        for(int i = 0; i< strs.length; i++){
            char[] ca = strs[i].toCharArray();
            Arrays.sort(ca);
            String sors = new String(ca);
            pairs[i] = new pair(i, sors);
        }

        Arrays.sort(pairs, (a, b) -> a.str.compareTo(b.str));

        List<String> curs = new ArrayList<>();
        String cursors = pairs[0].str;

        for(pair p : pairs){
            if(p.str.equals(cursors)){
                curs.add(strs[p.idx]);
            } else {
                res.add(curs);
                curs = new ArrayList<>();
                curs.add(strs[p.idx]);
                cursors = p.str;
            }
        }

        res.add(curs);

        return res;

    }

    class pair{
        int idx;
        String str;

        pair(int idx, String str){
            this.idx = idx;
            this.str = str;
        }
    }
}
// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {

//         List <String> strss = new ArrayList<>();

//         for(String s : strs) {
//             strss.add(s);
//         }

//         List<List<String>> res = new ArrayList<>();

//         while(strss.size()>0){
//             List<String> cur = new ArrayList<>();

//             String curstr = strss.get(strss.size()-1);
//             cur.add(strss.remove(strss.size()-1));
//             char [] arr = curstr.toCharArray();
//             Arrays.sort(arr);

//             for(int i = strss.size()-1; i>=0; i--){
//                 String curstr2 = strss.get(i);
//                 char [] arr2 = curstr2.toCharArray();
//                 Arrays.sort(arr2);

//                 if(Arrays.equals(arr2,arr)){
//                     cur.add(strss.remove(i));
//                 }
//             }
//             res.add(cur);
//         }
//         return res;
//     }
// }
