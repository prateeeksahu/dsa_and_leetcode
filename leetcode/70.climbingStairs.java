// class Solution {

//     public void chelp(int n, String p, ArrayList<String> jumps) {
//         if (n == 0) {
//             jumps.add(p);
//             return;
//         } else if (n < 0) {
//             return;
//         }

//         chelp(n - 1, p + "1", jumps);
//         chelp(n - 2, p + "2", jumps);
//     }

//     public int climbStairs(int n) {
//         ArrayList<String> jumps = new ArrayList<>();
//         chelp(n, "", jumps);
//         return jumps.size();
//     }
// }

// ******TLE******


public class Solution {
    public int climbStairs(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        
        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        
        return c;
    }
}

