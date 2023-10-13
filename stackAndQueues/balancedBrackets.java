package practice.stackAndQueues;

import java.util.*;

public class balancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();

        for(int i = 0;i<str.length();i++){

            char x = str.charAt(i);
            if(x == '(' || x=='{'|| x == '['){
                st.push(x);
            }else {
                if(x == ')'){
                   if(st.size()==0){
                       if(st.peek() == '('){
                           st.pop();
                       } else {
                           System.out.println(false);
                           return;
                       }
                   }
                }

                if(x == '}'){
                    if(st.size()==0) {
                        if (st.peek() == '{') {
                            st.pop();
                        } else {
                            System.out.println(false);
                            return;
                        }
                    }
                }

                if(x == ']'){
                    if(st.size()==0){
                        if (st.peek() == '[' ) {
                            st.pop();
                        } else {
                            System.out.println(false);
                            return;
                        }
                    }
                }
            }
        }

        if(st.size()!=0){
            System.out.println(false);
            return;
        }
        System.out.println(true);


    }


}
