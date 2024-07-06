// https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/

class Solution {
    public String firstPalindrome(String[] words) {

        for(String w : words){
            if(ip(w)) return w;
        } 

        return "";
    }

    public boolean ip(String str){

        if(str.length() == 1) return true;
        
        if(str.length() == 2) {
            if(str.charAt(0) == str.charAt(1)){ return true; } else { return false; } 
        }

        if(str.length() == 3) {
            if(str.charAt(0) == str.charAt(2)){ return true; } else { return false; } 
        }

        int i = 0;
        int j = str.length()-1;

        while(i<j){

            if(str.charAt(i)!=str.charAt(j)) return false;
            i++; 
            j--;
        }

        return true;
    }
}