package practice.stackAndQueues;

import java.util.*;

public class infixConversion {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        String st = sc.nextLine();

        conver(st);
    }

    public static void conver(String st){
        Stack<String> pre = new Stack<>();
        Stack<Character> optr = new Stack<>();
        Stack<String> post = new Stack<>();

        for(int i=0; i<st.length();i++){
            char ch = st.charAt(i);

            if(ch == '('){
                optr.push(ch);
            } else if ((ch>='0' && ch<='9') || (ch>='a' &&ch<='z') || (ch>='A' && ch<='Z')) {
                pre.push(ch+"");
                post.push(ch+"");
            } else if(ch == ')'){
                while(optr.peek()!='('){
                    char op = optr.pop();
                    String v2 = pre.pop();
                    String v1 = pre.pop();
                    pre.push(op+v1+v2);

                    v2 = post.pop();
                    v1 = post.pop();
                    post.push(v1+v2+op);
                }

                optr.pop();
            }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/' ){
                while(optr.size()>0 && optr.peek()!='(' && prece(ch)<=prece(optr.peek())){
                    char op = optr.pop();
                    String v2 = pre.pop();
                    String v1 = pre.pop();
                    pre.push(op+v1+v2);

                    v2 = post.pop();
                    v1 = post.pop();
                    post.push(v1+v2+op);
                }

                optr.push(ch);
            }
        }

        while(optr.size()>0){
            char op = optr.pop();
            String v2 = pre.pop();
            String v1 = pre.pop();
            pre.push(op+v1+v2);

            v2 = post.pop();
            v1 = post.pop();
            post.push(v1+v2+op);
        }

        System.out.println(pre.pop());
        System.out.println(post.pop());
    }

    public static int prece(char optr){
        if(optr == '+' || optr == '-'){
            return 1;
        } else if (optr == '*' || optr == '/') {
            return 2;
        } else{
            return 0;
        }
    }
}
