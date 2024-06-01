package practice.stackAndQueues;
import java.util.*;
import java.io.*;

public class mergeOverlappingIntervals {
    public static void main(String[] args) throws Exception {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][2];

            for (int j = 0; j < n; j++) {
                String line = br.readLine();
                arr[j][0] = Integer.parseInt(line.split(" ")[0]);
                arr[j][1] = Integer.parseInt(line.split(" ")[1]);
            }

        interval(arr);
    }

    public static void interval(int [][] arr){
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0],b[0]));

        Stack<Integer> stst = new Stack<>();
        Stack<Integer> stet = new Stack();

        stst.push(arr[0][0]);
        stet.push(arr[0][1]);

        for(int i = 1;i<arr.length;i++){
            if(stet.peek()>=arr[i][0]){
                int x = Math.max(stet.peek(),arr[i][1]);
                stet.pop();
                stet.push(x);
            } else{
                stst.push(arr[i][0]);
                stet.push(arr[i][1]);
            }
        }

        while(stst.size()>0){
            System.out.println(stst.pop() + " " + stet.pop());
        }
    }


}
