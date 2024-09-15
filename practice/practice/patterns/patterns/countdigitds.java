package practice.patterns;
import java.util.*;
public class countdigitds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ct=0;
        int x= sc.nextInt();

        while(x!=0){
            x=x/10;
            ct++;

        }
        System.out.println(ct);


    }
}
