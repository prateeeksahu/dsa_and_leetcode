// https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/description/?envType=daily-question&envId=2024-03-05

class Solution {
    public int minimumLength(String s) {

        int i = 0;
        int j = s.length()-1;

        if(s.charAt(i) != s.charAt(j)) return s.length();

        String str = "";

        while(i<j && s.charAt(i) == s.charAt(j)){

            char c = s.charAt(i);
            
            // while(s.charAt(i) == s.charAt(j)){
            //     if(s.charAt(i+1) == s.charAt(j)) i++;
            //     if(s.charAt(i) == s.charAt(j-1)) j--;
            // }

            while(i<=j && s.charAt(i) == c){
                i++;
            }

            while(i<=j && s.charAt(j) == c){
                j--;
            }
        }

        str = s.substring(i, j+1);
        return str.length();
        
    }
}
