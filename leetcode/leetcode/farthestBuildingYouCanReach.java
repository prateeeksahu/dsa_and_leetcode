// https://leetcode.com/problems/furthest-building-you-can-reach/?envType=daily-question&envId=2024-02-17

import java.util.PriorityQueue;

public class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int n = heights.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < n - 1; i++) {
            int req = heights[i + 1] - heights[i];
            if (req > 0) {
                if (req <= bricks) {
                    pq.add(req);
                    bricks -= req;
                } else if (ladders > 0) {
                    if (!pq.isEmpty() && pq.peek() > req) {
                        int highest = pq.poll();
                        bricks += highest - req;
                        pq.add(req);
                    }
                    ladders--;
                } else {
                    return i;
                }
            }
        }
        return n - 1;
    }
}




// **************************** fails at testcase 62 ****************************

// class Solution {
//     public int furthestBuilding(int[] heights, int bricks, int ladders) {

//         int i = 0;

//         while(i<heights.length){

//             if(i == heights.length-1) return i;

//             if(heights[i] >= heights[i + 1]){
//                 i++;
//             } else {

//                 if(bricks >= heights[i+1] - heights[i]){
//                     bricks -= heights[i+1] - heights[i];
//                     i++;
//                 } else if ( ladders > 0){
//                     ladders -= 1;
//                     i++;
//                 } else {
//                     return i;
//                 }
//             }

//         }

//         return i;
        
//     }
// }
