package practice.patterns;
import java.util.*;
public class printreverseofnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n!=0){
            int q = n%10;
            System.out.println(q);
            n/=10;
        }
    }
}
