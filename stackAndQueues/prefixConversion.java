package practice.stackAndQueues;
import java.util.*;

public class prefixConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();

        convert(st);
    }

    public static void convert(String st){
        Stack<String> post = new Stack<>();
        Stack<String> infx = new Stack<>();
        Stack<Integer> val = new Stack<>();

        for(int i=st.length()-1;i>=0;i--){
            char ch = st.charAt(i);

            if((ch>='0' && ch<='9')){
                post.push(ch + "");
                infx.push(ch + "");
                val.push(ch - '0');
            } else if((ch == '+') || (ch=='-') || (ch=='*') || (ch=='/')) {
                String x2 = post.pop();
                String x1 = post.pop();
                post.push(x1+x2+ch);

                x2 = infx.pop();
                x1 = infx.pop();
                infx.push('('+x1+ch+x2+')');

                int a = val.pop();
                int b = val.pop();
                val.push(opren(a,b,ch));
            } else{

            }

        }

        System.out.println(val.pop());
        System.out.println(post.pop());
        System.out.println(infx.pop());
    }

    public static int opren(int a, int b, char ch){
        if(ch == '+'){
            return a+b;
        } else if (ch == '-') {
            return a-b;
        } else if (ch == '*') {
            return a*b;
        } else{
            return a/b;
        }
    }
}
