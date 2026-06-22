class Solution {
    private ListNode reverse(ListNode cur, ListNode end) {
        ListNode prev = null, nxt;
        while (cur != end) {
            nxt = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nxt;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) return null;
        ListNode tail = head;
        for (int i = 0; i < k; i++) {
            if (tail == null)
                return head;
            tail = tail.next;
        }
        ListNode newHead = reverse(head, tail);
        head.next = reverseKGroup(tail, k);
        return newHead;
    }
}
