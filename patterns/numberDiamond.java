package practice.patterns;
import java.util.*;
public class numberDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sp = n/2;
        int st = 1;
        int x=1;

        for(int i=1;i<=n;++i){

            for(int j=1;j<=sp;++j){
                System.out.print("\t");
            }

            int cx=x;
            for(int j=1;j<=st;++j){
                System.out.print(cx+"\t");
                if(j<=st/2){
                    cx++;
                }else{
                    cx--;
                }
            }

            if(i<=n/2){
                st+=2;
                sp--;
                x++;
            }else{
                st-=2;
                sp++;
                x--;
            }
            System.out.println();
        }

    }
}
