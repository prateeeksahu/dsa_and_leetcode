package java;
// https://leetcode.com/submissions/detail/1145372498/

class Solution {
    public int minSteps(String s, String t) {

        int [] cnt = new int[26];
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();


        for (int i = 0; i < s.length(); i++)
        {
            cnt[schar[i] - 'a']++;
            cnt[tchar[i] - 'a']--;
        }

        int cont = 0;

        for(int x : cnt){
            if(x>0){
                cont+=x;
            }
        }

        return cont;
        
    }
}