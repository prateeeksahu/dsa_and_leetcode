package java;
// https://leetcode.com/problems/sum-of-subarray-minimums/?envType=daily-question&envId=2024-01-20

// class Solution {
//     public int sumSubarrayMins(int[] arr) {
        
//         Stack <Integer> st = new Stack<>();

//         for (int i = 0; i < arr.length; i++) {
//             int min = Integer.MAX_VALUE;
//             for (int j = i; j < arr.length; j++) {
//                 if(arr[j]<min){
//                     min = arr[j];
//                 } 
//                 st.push(min);
//             }


//         }

//         long r = 0;
//         int M = 1000000007;

//         while(st.size()>0){
//             int x = st.pop();
//             r = (r+x) % M;

//         }

//         return (int) r;
        
//     }
// }


// **********Memory Limit Exceeded**********



class Solution {
    public int sumSubarrayMins(int[] arr) {
      final int kMod = 1_000_000_007;
      final int n = arr.length;
      long ans = 0;
  
      int[] prevMin = new int[n];
      int[] nextMin = new int[n];
      Deque<Integer> stack = new ArrayDeque<>();
  
      Arrays.fill(prevMin, -1);
      Arrays.fill(nextMin, n);
  
      for (int i = 0; i < arr.length; ++i) {
        while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
          final int index = stack.pop();
          nextMin[index] = i;
        }
        if (!stack.isEmpty())
          prevMin[i] = stack.peek();
        stack.push(i);
      }
  
      for (int i = 0; i < arr.length; ++i) {
        ans += (long) arr[i] * (i - prevMin[i]) * (nextMin[i] - i);
        ans %= kMod;
      }
  
      return (int) ans;
    }
  }