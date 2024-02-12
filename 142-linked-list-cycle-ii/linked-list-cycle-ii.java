public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        
        // Step 1: Find the intersection point if there's a cycle
        ListNode slow = head;
        ListNode fast = head;
        ListNode intersection = null;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                intersection = slow;
                break;
            }
        }
        
        // Step 2: Return null if there's no cycle
        if (intersection == null) {
            return null;
        }
        
        // Step 3: Find the starting point of the cycle
        ListNode ptr1 = head;
        ListNode ptr2 = intersection;
        
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        
        return ptr1;
    }
}
