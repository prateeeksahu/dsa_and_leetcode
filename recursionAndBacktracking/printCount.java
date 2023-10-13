package practice.recursionAndBacktracking;
import java.util.*;

public class printCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        count(n);
    }

    public static void count(int n){
        if(n==0){
            return;
        }
        count(n-1);
        System.out.println(n);
    }
}
