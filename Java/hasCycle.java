    static boolean hasCycle(SinglyLinkedListNode head) {
        SinglyLinkedListNode current = head;
        
        while(current.next != null){
            
            if(current.data == -9){
                return true;
            }
            current.data = -9;
            current = current.next;
        }
        return false;

    }