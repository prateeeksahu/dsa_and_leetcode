class Solution {
    public int countSubstrings(String s) {

        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i ; j <s.length(); j++) {
                
                if(pali(s, i, j)) c++;
            }
        }

        return c;
        
    }

    public static boolean pali(String s, int l, int r){
        while(l<r){
            if(s.charAt(l++) != s.charAt(r--)) return false;
        }

        return true;
    }
}

// class Solution {
//     public int countSubstrings(String s) {

//         ArrayList <String> al = new ArrayList<>(); 

//         for (int i = 0; i < s.length(); i++) {
//             for (int j = i + 1; j <= s.length(); j++) {
//                 String st = s.substring(i, j);

//                 String rev = new StringBuilder(st).reverse().toString();
//                 if(st.equals(rev)) al.add(st);
//             }
//         }

//         return al.size();
        
//     }
// }
