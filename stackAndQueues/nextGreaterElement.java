package practice.stackAndQueues;

import java.util.*;

public class nextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        find(arr,n);


    }

    public static void find(int [] arr, int n){
        int [] res = new int[n];
        Stack<Integer> st = new Stack<>();

        res[n-1] = -1;
        st.push(arr[n-1]);

        for(int i = res.length-2;i>=0;i--){
            while(st.size()>0 && arr[i]>=st.peek()){
                st.pop();
            }
            if(st.size() == 0){
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }

            st.push(arr[i]);

        }

        for(int i = 0; i<arr.length;i++){
            System.out.println(res[i]);
        }
    }


}


