package practice.stringsAndArraylists;
import java.util.*;

public class stringWithASCIIDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(diff(str));
    }
    public static String diff(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        for(int i = 1; i<str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            int diff = curr-prev;

            sb.append(curr);
            sb.append(diff);
        }


        return sb.toString();
    }
}
