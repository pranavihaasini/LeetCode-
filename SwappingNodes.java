class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr=head;
        int count=0;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
        ListNode forward=head;
        ListNode backward=head;
        for(int i=1;i<k;i++){
            forward=forward.next;
        }
        for(int i=1;i<count-(k-1);i++){
            backward=backward.next;
        }
        int temp=forward.val;
        forward.val=backward.val;
        backward.val=temp;
        return head;
    }
}
