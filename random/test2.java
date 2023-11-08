package practice.random;
import java.util.*;
public class test2 {
    public static void main(String[] args) {
        int n = 5;
        int a=0,b=1;
        int sum=0;

        for(int i=0;i<n;++i){
            for(int j=0;j<i;++j){
                System.out.print( a +"\t");
                sum=a+b;
                a=b; b=sum;
            }
            System.out.println();
        }


    }
}
