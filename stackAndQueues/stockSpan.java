package practice.stackAndQueues;
import java.util.*;

public class stockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        solve(arr);
    }

    public static void solve(int [] arr){
        int [] res = new int[arr.length];

        Stack<Integer> st = new Stack<>();
        st.push(0);
        res[0] = 0;

        for(int i =0;i<arr.length;i++){
            while(st.size()>0 && arr[i]>arr[st.peek()]){
                st.pop();
            }

            if(st.size() == 0){
                res [i] = i+1;
            } else{
                res[i] = i- st.peek();
            }

            st.push(i);

        }

        for (int i = 0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
