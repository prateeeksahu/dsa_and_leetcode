package practice.stackAndQueues;
import java.util.*;
import java.io.*;

public class test {
    public static void main(String[] args)throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }


        Arrays.sort(arr, (a, b) -> Integer.compare(a[0],b[0]));

        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "][0] = " + arr[i][0] + ", arr[" + i + "][1] = " + arr[i][1]);
        }
    }






}
