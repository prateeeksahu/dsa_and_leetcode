package practice.recursionAndBacktracking;
import java.util.*;

public class printSubSequenceOptimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printss(str, "");
    }

    public static void printss(String ques, String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String ros = ques.substring(1);

        printss(ros, ans+ch);
        printss(ros, ans+"");
    }
}
