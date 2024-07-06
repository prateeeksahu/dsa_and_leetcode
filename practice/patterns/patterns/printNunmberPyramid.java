package practice.patterns;
import java.util.*;
public class printNunmberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ct = 1;

        for(int i = 0; i<n; ++i){
            for(int j = 0; j<i; ++j){
                System.out.print(ct+"\t");
                ct++;
            }
            System.out.println();
        }
    }
}
