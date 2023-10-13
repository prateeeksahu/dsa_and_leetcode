package practice.methods;
import java.util.*;

public class digitFrequency {

    public static int feq(int x, int c){
        int ct = 0;
        int n=x;

        while(n!=0){
            int v=n%10;
            if(v==c){
                ct++;
            }
            n/=10;
        }
        return ct;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ch = sc.nextInt();

        System.out.println(feq(num,ch));
    }
}
