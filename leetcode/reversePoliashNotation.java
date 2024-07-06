// https://leetcode.com/problems/evaluate-reverse-polish-notation/?envType=daily-question&envId=2024-01-30

class Solution {

    public long operation(long a, long b, char opr){
        if(opr == '+') return a+b;
        else if (opr == '-') return a-b;
        else if (opr == '*') return a*b;
        return a/b;
    }
    public int evalRPN(String[] tokens) {

        Stack <Long> st = new Stack<>();

        for(int i = 0; i<tokens.length;i++){
            String tok = tokens[i];

            if(tokens[i].length() == 1 && (tokens[i].charAt(0) == '+' || tokens[i].charAt(0) == '*' || tokens[i].charAt(0) == '/' || tokens[i].charAt(0) == '-')){

                long two = st.pop();
                long one = st.pop();

                long res = operation(one, two, tokens[i].charAt(0)); 

                st.push(res);

            } else {
                st.push(Long.parseLong(tokens[i]));
            }
        }

        return st.pop().intValue();
    }
}