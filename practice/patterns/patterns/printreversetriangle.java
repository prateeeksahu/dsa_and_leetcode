package practice.patterns;
import java.util.*;
public class printreversetriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int st = n;
       int sp = 0;

       for(int i = 0; i < n;++i){
           for(int j=0; j<sp;++j){
               System.out.print("\t");
           }

           for(int j=0; j<st;++j){
               System.out.print("\t*");
           }
           System.out.println();
           st--;
           sp++;
        }
    }
}
