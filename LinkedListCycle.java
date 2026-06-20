public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode current=head;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
          return true;
        }
        return false;
    }
}
