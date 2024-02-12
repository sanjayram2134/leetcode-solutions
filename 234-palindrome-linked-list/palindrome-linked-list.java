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
    public boolean isPalindrome(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        int length = 1;
        while(first.next!=null && first.next.next!=null)
        {
            second = second.next;
            first = first.next.next;
            length++;
        }
        System.out.println(length);
        ListNode secondd = reverse(second.next);
        ListNode ptr1 = head;
        ListNode ptr2 = secondd;
        while(ptr1!=null && ptr2!=null)
        {
            if(ptr1.val!=ptr2.val)
            {
                return false;
            }
            ptr1=ptr1.next;
            ptr2 = ptr2.next;
        }
        return true;


    }
        private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
        }

}