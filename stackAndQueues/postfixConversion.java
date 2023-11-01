package practice.stackAndQueues;
import java.util.*;
public class postfixConversion {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        String st = sc.nextLine();

        conver(st);
    }

    public static void conver(String st){
        Stack<Integer> val = new Stack<>();
        Stack<String> infx = new Stack<>();
        Stack<String> prefx = new Stack<>();
        for (int i = 0;i<st.length();i++){
            char ch = st.charAt(i);

            if((ch>='0' && ch<='9')){
                val.push(ch-'0');
                infx.push(ch+"");
                prefx.push(ch+"");
            } else if ((ch == '+') || (ch=='-') || (ch=='*') || (ch=='/')){
                int v2 = val.pop();
                int v1 = val.pop();
                val.push(opr(v1,v2,ch));

                String x2 = infx.pop();
                String x1 = infx.pop();
                infx.push('('+ x1 + ch + x2 + ')');

                x2 = prefx.pop();
                x1 = prefx.pop();
                prefx.push(ch + x1+x2);
            } else {

            }
        }

        System.out.println(val.pop());
        System.out.println(prefx.pop());
        System.out.println(infx.pop());
    }

    public static int opr(int v1, int v2, char ch){
        if (ch == '+') {
            return v1+v2;
        } else if (ch == '-') {
            return v1-v2;
        } else if (ch == '*') {
            return v1*v2;
        } else {
            return v1/v2;
        }
    }
}
