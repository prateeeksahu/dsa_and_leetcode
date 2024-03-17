class Solution {
    public String longestCommonPrefix(String[] strs) {
        String one = strs[0];
        String res;

        for(String comp : strs){

            int i = 0;

            while(i<one.length() && i< comp.length() && comp.charAt(i) == one.charAt(i)){
                i++;
            }

            one = one.substring(0,i);
        }
        
        return one;
        
    }
}
