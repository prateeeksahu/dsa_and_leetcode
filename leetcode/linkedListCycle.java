// https://leetcode.com/problems/linked-list-cycle/description/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

 public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();

        while (head != null) {
            if (!set.add(head)) return true; 
            head = head.next;
        }

        return false; 
    }
}


// public class Solution {
//     public boolean hasCycle(ListNode head) {
        
//         List <Integer> l = new ArrayList<>();
        
//         while(head!=null){

//             if(l.contains(head.val)) return false;
//             l.add(head.val);
//             head = head.next;

            
//         }

//         return true;
        
//     }
// }

