package practice.patterns;
import java.util.*;

public class vShapedNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int st=1;
        int sp = 2*n-3;

        for(int i = 1; i<=n; ++i){
            int x = 1;
            for(int j=0;j<st;++j){
                System.out.print(x+"\t");
                x++;
            }

            for(int j = 0;j<sp;++j){
                System.out.print("\t");
            }

            if(i==n){
                st--;
                x--;
            }
            int y = x-1;
            for(int j=0;j<st;++j){
                x--;
                System.out.print(x+"\t");
            }

            st++;
            sp-=2;
            System.out.println();
        }
    }
}
