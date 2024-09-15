//https://leetcode.com/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points/description/?envType=daily-question&envId=2024-07-05


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int res[]=new int[]{-1,-1};
        if(head==null||head.next==null||head.next.next==null) return res;

        int i = 2, prev = head.val;
        int firstCP = -1, lastCP = -1, prevCP = -1;
        int minDist = Integer.MAX_VALUE, maxDist = Integer.MIN_VALUE;
        ListNode node = head.next;
        // int[] res = new int[2];

        while (node != null && node.next != null) {
            if ((prev < node.val && node.val > node.next.val) || (prev > node.val && node.val < node.next.val)) {
                if (firstCP == -1) {
                    firstCP = i;
                } else {
                    minDist = Math.min(minDist, i - prevCP);
                    maxDist = i - firstCP;
                }
                prevCP = i;
            }

            prev = node.val;
            i++;
            node = node.next;
        }

        if (minDist == Integer.MAX_VALUE || maxDist == Integer.MIN_VALUE) return res;

        res[0] = minDist;
        res[1] = maxDist;
        return res;
    }
}

