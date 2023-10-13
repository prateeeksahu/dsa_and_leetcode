package practice.recursionAndBacktracking;
import java.util.*;

public class printKPC {
    static String [] codes = {",;", "abc", "def", "ghi", "jkl","mno","pqrs", "tu","vw","xyz"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        print(str, "");
    }

    public static void print(String str, String ans){

        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch1 = str.charAt(0);
        String ros = str.substring(1);

        String codeforch = codes[ch1 - '0'];
        for(int i = 0;i<codeforch.length();i++){
            char ch = codeforch.charAt(i);
            print(ros, ans+ch);

        }
    }
}
