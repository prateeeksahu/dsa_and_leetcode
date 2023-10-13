package practice.patterns;
import java.util.*;
public class inverseofdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int inv = 0;
        int og_pos = 1;

        while(num!=0){
            int og_dig = num % 10;
            int inv_dig = og_pos;
            int inv_pla = og_dig;

            inv = inv + inv_dig * (int)Math.pow(10,inv_pla-1);

            num/=10;
            og_pos++;
        }

        System.out.println(inv);
    }
}
