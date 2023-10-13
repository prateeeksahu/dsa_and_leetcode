package practice.patterns;
import java.util.*;
public class printingsingledigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

//
//        while(n>0){
//            int r=n%10;
//            System.out.println(r);
//            n=n/10;
//
//        }

int nod=0;
int temp=n;

while(temp!=0){
    temp/=10;
    nod++;
}

int d= (int)Math.pow(10,nod-1);

while(d!=0){
    int q=n/d;
    System.out.println(q);

    n=n%d;
    d=d/10;
        }

    }
}