//https://leetcode.com/problems/add-two-numbers/description/

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode node = new ListNode(0);
        ListNode ans = node;

        int c = 0;

        while(l1 != null || l2 != null){  

            int dl1 = (l1 == null) ? 0 : l1.val;
            int dl2 = (l2 == null) ? 0 : l2.val;

            int s = dl1 + dl2 + c;
            c = s / 10;
            ans.next = new ListNode(s % 10);
            ans = ans.next;

            if(l1 != null) l1 = l1.next;  
            if(l2 != null) l2 = l2.next;  
            if(c > 0) ans.next = new ListNode(c);
        }

        return node.next;
    }
}


// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

//         ListNode node = new ListNode();
//         ListNode ans = node;

//         int c = 0;

//         while(l1 != null && l2 != null){

//             int dl1 = (l1 == null) ? 0 : l1.val;
//             int dl2 = (l2 == null) ? 0 : l2.val;

//             int s = dl1 + dl2 + c;
//             ans.val = s % 10;
//             c = s / 10;
//             ans.next = new ListNode();
//             ans = ans.next;
//             l1 = l1.next;
//             l2 = l2.next;

//         }

//         return node;
            
//     }
// }



