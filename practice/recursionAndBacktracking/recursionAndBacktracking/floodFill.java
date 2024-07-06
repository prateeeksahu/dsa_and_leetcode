package practice.recursionAndBacktracking;
import java.util.*;

public class floodFill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][]arr = new int[n][m];

        for(int i= 0;i<arr.length;i++){
            for(int j = 0; j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        boolean [][] visited = new boolean[n][m];
        maze(arr, n,m,"",visited);
    }
    public static void maze(int[][]arr, int n, int m,String psf, boolean [][] visited){

        if(n<0 || m<0 || n == arr.length || m == arr[0].length || arr[n][m] == 1 || visited[n][m] == true){
            return;
        }

        if(n == arr.length - 1 && m == arr[0].length - 1){
            System.out.println(psf);
            return;
        }


        visited[n][m] = true;
        maze(arr,n-1, m, psf+"t", visited);
        maze(arr,n, m-1, psf+"l", visited);
        maze(arr,n+1, m, psf+"d", visited);
        maze(arr,n, m+1, psf+"r", visited);
        visited[n][m] = false;
    }
}
