package practice.recursionAndBacktracking;
import java.util.*;
public class printMazePath {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        print(1,1, n,m,"");
    }

    public static void print(int sr, int sc, int dr, int dc, String psf){
        if(sc > dc || sr > dr ){
            return;
        }

        if(sc == dc || sr == dr){
            System.out.println(psf);
            return;
        }

        print(sr+1,sc,dr,dc,psf+"h");
        print(sr,sc+1,dr,dc,psf+"v");
    }
}
