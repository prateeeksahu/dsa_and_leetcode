// https://leetcode.com/problems/middle-of-the-linked-list/description/

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
    public ListNode middleNode(ListNode head) {

        ListNode f = head;
        ListNode s = head;

        while(f != null && f.next!=null){s = s.next; f = f.next.next;}

        return s;

        // int s = 0;
        // ListNode node = head;
        // while(node != null) {s++; node = node.next;}

        // if(s%2 == 1){
        //     s/=2;
        //     while(s-- > 0){
        //         head = head.next;
        //     }

        //     return head;
        // } else {
        //     s/=2;
        //     while(s-- > 0){
        //         head = head.next;
        //     }

        //     return head;
        // }

        //return head;
        
    }
}
