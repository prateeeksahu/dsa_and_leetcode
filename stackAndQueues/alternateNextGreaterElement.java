package practice.stackAndQueues;

import java.util.*;

public class alternateNextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        find(arr, n);
    }

    public static void find(int [] arr, int n){

        int [] res = new int[n];
        Stack<Integer>st = new Stack<>();

        st.push(0);
        for(int i = 1; i<n;i++){
            while(st.size()>0 && arr[i]>arr[st.peek()]){
                int pos = st.peek();
                res[pos] = arr[i];
                st.pop();
            }

            st.push(i);
        }

        while(st.size()>0){
            int pos = st.peek();
            res[pos] = -1;

        }

        for(int i = 0; i<n; i++){
            System.out.println(res[i]);
        }


    }
}
