package practice.recursionAndBacktracking;
import java.util.*;

public class findJumpMazePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> paths = maze(1, 1, n, m);
        System.out.println(paths);

    }

    public static ArrayList<String> maze(int sr, int sc, int dr, int dc){

        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> paths = new ArrayList<>();

        // horizontal
        for(int i = 1; i<= dc-sc;i++){
            ArrayList<String> hpaths = maze(sr, sc+i,dr, dc);
            for(String hpath : hpaths){
                paths.add("h"+i+hpath);
            }
        }

        // vertical
        for(int i = 1; i<= dr-sr;i++){
            ArrayList<String> vpaths = maze(sr+i, sc,dr, dc);
            for(String vpath : vpaths){
                paths.add("v"+i+vpath);
            }
        }


        // diagonal
        for(int i = 1; i<= dc-sc && i<= dr-sr;i++){
            ArrayList<String> dpaths = maze(sr+i, sc+i,dr, dc);
            for(String dpath : dpaths){
                paths.add("d"+i+dpath);
            }
        }


    return paths;
    }
}
