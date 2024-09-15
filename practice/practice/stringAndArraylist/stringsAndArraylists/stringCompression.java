package practice.stringsAndArraylists;
import java.util.*;

public class stringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(compression1(str));
        System.out.println(compression2(str));

    }

    public static String compression1(String str){
        String s = str.charAt(0)+ "";
        for(int i=1 ;i<str.length();i++){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i-1);


            if(ch1!=ch2){
                s+=ch1;
            }

        }
        return s;
    }

    public static String compression2(String str){
        String s = str.charAt(0)+ "";
        int cnt = 1;

        for(int i=1;i<str.length();i++){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i-1);

            if(ch1==ch2){
                cnt++;
            } else {
                if(cnt>1){
                    s+=cnt;
                    cnt = 1;
                }
                s+=ch1;
            }

        }
        if(cnt>1) {
            s += cnt;
            cnt = 1;
        }
        return s;
    }

}
