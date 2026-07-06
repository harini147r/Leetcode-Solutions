public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
     ListNode a = head;
     ListNode b = head;

     while(a!= null && a.next!= null){
        b = b.next;
        a = a.next.next;
        if(a==b)
            return true;
     }   
     return false;
    }
}


