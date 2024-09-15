// https://leetcode.com/problems/remove-nth-node-from-end-of-list/?envType=daily-question&envId=2024-03-03

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int s = 0;
        ListNode node = head;
        while(node != null) {s++; node = node.next;}


        if(s == n){
            head = head.next;
            return head;
        }
       
        s = s-n;
        node = head;

        while(s>=0){
            if(s==1){
                node.next = node.next.next;
                break;
            }

            node = node.next;
            s--;
        }
        return head;
    }
}
