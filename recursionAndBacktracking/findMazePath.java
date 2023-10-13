package practice.recursionAndBacktracking;
import java.util.*;

public class findMazePath {
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

        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();

        if(sc<dc){
            hpaths = maze(sr, sc+1, dr, dc);
        }

        if(sr<dr){
            vpaths = maze(sr+1, sc, dr, dc);
        }

        ArrayList<String> paths = new ArrayList<>();

        for(String hpath : hpaths){
            paths.add("h" + hpath);
        }

        for(String vpath : vpaths){
            paths.add("v" + vpath);
        }

        return paths;

    }
}
