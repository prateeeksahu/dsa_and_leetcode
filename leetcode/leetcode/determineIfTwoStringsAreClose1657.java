package java;
// https://leetcode.com/problems/determine-if-two-strings-are-close/description/?envType=daily-question&envId=2024-01-14

class Solution {
    public boolean closeStrings(String word1, String word2) {


        if(word1.length() != word2.length()){
            return false;
        }

        int [] cw1 = new int [26];
        int [] cw2 = new int [26];

        Set<Character> s1 = new HashSet<>();
        Set<Character> s2 = new HashSet<>();


        for (int i = 0; i<word1.length();i++){
    

            cw1[word1.charAt(i) -'a']++;
            s1.add(word1.charAt(i));
            cw2[word2.charAt(i) -'a']++;
            s2.add(word2.charAt(i));

        }

        List<Character> l1 = new ArrayList<>(s1);
        Collections.sort(l1);
        List<Character> l2 = new ArrayList<>(s2);
        Collections.sort(l2);

        

        if(l1.equals(l2) == false){
            return false;
        }

        Arrays.sort(cw1);
        Arrays.sort(cw2);

        for(int i = 0;i<26;i++){
            if(cw1[i] != cw2[i]){
                return false;
            }
        }

        return true;


        //little more optimized

    //     if(word1.length() != word2.length()){
    //         return false;
    //     }

    //     int [] cw1 = new int [26];
    //     int [] cw2 = new int [26];

    //    // Set<Character> s1 = new HashSet<>();
    //    // Set<Character> s2 = new HashSet<>();


    //     for (int i = 0; i<word1.length();i++){
    

    //         cw1[word1.charAt(i) -'a']++;
    //       //  s1.add(word1.charAt(i));
    //         cw2[word2.charAt(i) -'a']++;
    //       //  s2.add(word2.charAt(i));

    //     }

    //     // List<Character> l1 = new ArrayList<>(s1);
    //     // Collections.sort(l1);
    //     // List<Character> l2 = new ArrayList<>(s2);
    //     // Collections.sort(l2);
    //     // if(l1.equals(l2) == false){
    //     //     return false;
    //     // }


    //       for (int i = 0; i < 26; i++) {
    //         if ((cw1[i] == 0 && cw2[i] != 0) || (cw1[i] != 0 && cw2[i] == 0)) {
    //             return false;
    //         }
    //     }

    //     Arrays.sort(cw1);
    //     Arrays.sort(cw2);

    //     for(int i = 0;i<26;i++){
    //         if(cw1[i] != cw2[i]){
    //             return false;
    //         }
    //     }

    //     return true;
        
        
    }
}