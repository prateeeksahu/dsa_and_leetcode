package practice.recursionAndBacktracking;
import java.util.*;
public class printMazePathsWithJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        print(1,1,n,m,"");
    }

    public static void print(int sr, int sc, int dr, int dc, String psf){
        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }

        for(int i = 1;i<=dc-sc;i++){
            print(sr,sc+i,dr,dc,psf+"h"+i);
        }

        for(int i = 1;i<=dr-sr;i++){
            print(sr+i,sc,dr,dc,psf+"v"+i);
        }

        for(int i = 1;i<=dc-sc && i<=dr-dc;i++){
            print(sr+i,sc+i,dr,dc,psf+"d"+i);
        }
    }
}
