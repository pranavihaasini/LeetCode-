class Solution {
    public ListNode middleNode(ListNode head) {
    int count=0;
    ListNode current=head;
    while(current!=null){
        count++;
    current=current.next;
    }
    int middle=count/2;
    for(int i=0;i<middle;i++){
        current=current.next;
    }
  return current;
    }
}
