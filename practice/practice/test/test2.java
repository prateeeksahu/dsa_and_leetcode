//package practice.test;
//import java.util.*;
//
//public class test2 {
//
//    public static void main(String[] args) {
//
////        Scanner sc = new Scanner(System.in);
////        int[] com = new int[sc.nextInt()];
////        for(int i = 0; i< com.length; i++) com[i] = sc.nextInt();
////
////        int [][] o = new int[sc.nextInt()][2];
////        for(int i = 0; i< o.length; i++){
////            o[0] = sc.nextInt();
////            o[1] = sc.nextInt();
////        }
//        int[] com = {4,-1,3};
//        int[][] o = {};
//
//        System.out.println(robotSim(com,o));
//    }
//
//    public static int robotSim(int[] c, int[][] o) {
//
//        int[] res = new int[2];
//        int[][] dir = {{0,1}, {1, 0}, {0, -1}, {-1,0}};
//        int[][] obs = new int[10000][10000];
//        res[0] = 0;
//        res[1] = 0;
//
//        for(int i = 0; i< o.length; i++) obs[o[i][0]][o[i][1]] = 1;
//
//        int cd = 0;
//        for(int i = 0; i < c.length; i++){
//            int d = c[i];
//            if(d < 0){
//                if(d == -2) cd++;
//                else cd--;
//                if(cd == -1) cd = 3;
//                continue;
//            }
//            System.out.println(cd);
//
//            for(int j = 0; j < d; j++){
//                res[0]+= dir[cd][0];
//                res[1]+= dir[cd][1];
//                if(obs[res[0]][res[1]] == 1)continue;
//            }
//            System.out.println(res[0] + " " + res[1]);
//
//        }
//
//        return (res[0] * res[0]) + (res[1] * res[1]);
//
//    }
//}
//


package practice.test;
import java.util.*;

public class test2 {

    public static void main(String[] args) {

        int[] com = {4,-1,4,-2,4};
        int[][] o = {{2,4}};

        System.out.println(robotSim(com,o));
    }

    public static int robotSim(int[] c, int[][] o) {

        int[] res = new int[2];
        int[][] dir = {{0,1}, {1, 0}, {0, -1}, {-1,0}};
        Set<String> obs = new HashSet<>();
        res[0] = 0;
        res[1] = 0;

        for(int i = 0; i< o.length; i++) obs.add(o[i][0] + " " + o[i][1]);

        int cd = 0;
        for(int i = 0; i < c.length; i++){
            int d = c[i];
            if(d < 0){
                if(d == -2) cd = (cd + 3) % 4;
                else cd = (cd + 1) % 4;
                continue;
            }

            for(int j = 0; j < d; j++){
                int nx = res[0] + dir[cd][0];
                int ny = res[1] + dir[cd][1];
                if(obs.contains(nx + " " + ny)) break;
                res[0] = nx;
                res[1] = ny;
            }
        }

        return (res[0] * res[0]) + (res[1] * res[1]);

    }

    private void hell0(){

    }
}
