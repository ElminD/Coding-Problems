public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode current = head;

        if(head == null){
            return false;
        }
        
        while(current.next != null){
            
            if(current.val == -9){
                return true;
            }
            current.val = -9;
            current = current.next;
        }
        return false;
    }
}