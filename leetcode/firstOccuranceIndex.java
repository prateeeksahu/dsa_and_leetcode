package java;
// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

class Solution {
    public int strStr(String haystack, String needle) {

        if(needle.length() == haystack.length()){
            if(needle.equalsIgnoreCase(haystack)){
                return 0;
            } else {
                return -1;
            }
        }

        if(needle.length() == 1){

            for(int i = 0;i<haystack.length();i++){
            String x = haystack.charAt(i) + "";

            if(needle.equalsIgnoreCase(x)){
                return i;
            }

            return -1;
            }

        }

        int n = needle.length();
        int i = 0;
        int j = n;

        while(j!= haystack.length()){
            String hay = haystack.substring(i,j);
            if(needle.equalsIgnoreCase((hay))){
                //System.out.println(i);
                return i;
            }
            i++;
            j++;
        }

        //System.out.println("-1");
        return -1;
    }
        
        
}