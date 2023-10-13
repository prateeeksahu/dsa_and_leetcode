package practice.patterns;
import java.util.*;
public class primeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int div = 2; div * div <= n; ++div){
            while(n%div==0){
                n/=div;
                System.out.println(div);
            }
        }
        if(n!=0){
            System.out.println(n);
        }

    }
}
