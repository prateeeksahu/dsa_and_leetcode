package practice.patterns;
import java.util.*;
public class printTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int prod = n;
        int mul = 1;

        for(int i=1;i<=10;++i){
            System.out.println(n+" x "+i+" = "+i*n);
        }
    }
}
