package practice.recursionAndBacktracking;
import java.util.*;

public class printStairPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        print(n,"");
    }

    public static void print(int n, String path){
        if(n<0){
            return;
        }
    if(n==0){
        System.out.println(path);
        return;
    }

        print(n-1, path+1);
        print(n-2, path+2);
        print(n-3, path+3);
    }
}
