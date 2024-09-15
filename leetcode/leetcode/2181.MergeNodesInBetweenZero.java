//https://leetcode.com/problems/merge-nodes-in-between-zeros/?envType=daily-question&envId=2024-07-04


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
    public ListNode mergeNodes(ListNode head) {

        if(head==null || head.next==null) return head;

        ListNode ans = new ListNode();
        ListNode res = ans;
        head = head.next;
        // ListNode temp = head.next;
        int sum = 0;

        while(head != null){
            sum += head.val;

            if(head.val == 0){
                res.next = new ListNode(sum);
                res = res.next;
                sum = 0;
            }

            head = head.next;
        }

        return ans.next;
    }
}
