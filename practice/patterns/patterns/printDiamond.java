package practice.patterns;
import java.util.*;

public class printDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int st=1;
        int sp=n/2;

        for(int i = 1; i<=n; ++i){
            for(int j = 0; j <sp; ++j){
                System.out.print("\t");
            }

            for(int j = 0; j <st; ++j){
                System.out.print("*\t");
            }
            if(i<=n/2){
                st+=2;
                sp--;
            }
            else{
                sp++;
                st-=2;
            }
            System.out.println();
        }


    }

}
