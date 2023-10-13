package practice.patterns;
import java.util.*;

public class pythagorasTherom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int s1,s2,h;

        if(a>b && a>c){
            h=a; s1=b; s2=c;
        }else if(b>a && b>c){
            h=b; s1=a; s2=c;
        }else{
            h=c; s1=a; s2=b;
        }



        if((s1*s1) + (s2*s2) == (h*h)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
