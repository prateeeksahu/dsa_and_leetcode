package practice.stackAndQueues;

import java.util.*;

public class infixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();

        infixSum(st);
    }

    public static void infixSum(String st){
        Stack<Character> optr  = new Stack<>();
        Stack<Integer> oprnd = new Stack<>();

        for (int i = 0; i<st.length(); i++){
            char ch = st.charAt(i);

            if (ch == '(') {
                optr.push(ch);
            } else if (Character.isDigit(ch)) {
                oprnd.push(ch-'0');
            } else if (ch == ')') {
                while(optr.peek()!='('){
                    char optrr = optr.pop();
                    int v2 = oprnd.pop();
                    int v1 = oprnd.pop();

                    oprnd.push(oper(v1,v2,optrr));
                }

                optr.pop();
            }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while(optr.size()!=0 && optr.peek() != '(' && prece(ch)<=prece(optr.peek())){
                    char optrr = optr.pop();
                    int v2 = oprnd.pop();
                    int v1 = oprnd.pop();

                    oprnd.push(oper(v1,v2,optrr));
                }



                optr.push(ch);
            }
        }

        while(optr.size()!=0){
            char optrr = optr.pop();
            int v2 = oprnd.pop();
            int v1 = oprnd.pop();

            oprnd.push(oper(v1,v2,optrr));
        }

        System.out.println(oprnd.peek());

    }

    public static int prece(char ch){

        if (ch == '+') {
            return 1;
        } else if (ch == '-') {
            return 1;
        } else if(ch == '*'){
            return 2;
        } else{
            return 2;
        }
    }

    public static int oper(int v1, int v2, char ch){
        if (ch == '+') {
            return v1+v2;
        } else if (ch == '-') {
            return v1-v2;
        } else if(ch == '*'){
            return v1*v2;
        } else{
            return v1/v2;
        }

    }
}
