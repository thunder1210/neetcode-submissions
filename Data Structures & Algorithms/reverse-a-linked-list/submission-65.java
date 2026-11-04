
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode dummy = head;

        while (dummy != null) {
            ListNode tmp = dummy.next;
            dummy.next = prev;
            prev = dummy;
            dummy = tmp;
        }

        return prev;
    }
}
