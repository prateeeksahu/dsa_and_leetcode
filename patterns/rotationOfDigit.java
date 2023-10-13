package practice.patterns;
import java.util.*;
public class rotationOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int nod=0;

        int temp=n;
        while(temp!=0){
            temp/=10;
            nod++;
        }

        k=k % nod;

        if(k<0){
            k+=nod;
        }

        int mult = 1;
        int div = 1;
        for(int i = 0; i<nod; ++i){
            if(i<k){
                div*=10;
            }else{
                mult*=10;
            }
        }

        int q = n/100;
        int r = n%100;

        int rot = r * mult + q;

        System.out.println(rot);

    }
}
