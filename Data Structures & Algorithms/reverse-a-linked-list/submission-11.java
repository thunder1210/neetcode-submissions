class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // 1. 找中點
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. 反轉後半段 - 注意這裡呼叫的名字
        ListNode head2 = reverseList(slow.next); // 改成 reverseList
        slow.next = null; 

        // 3. 合併
        ListNode head1 = head;
        while (head2 != null) {
            ListNode temp1 = head1.next;
            ListNode temp2 = head2.next;

            head1.next = head2;
            head2.next = temp1;

            head1 = temp1;
            head2 = temp2;
        }
    }

    // 這裡定義的名字也要改成 reverseList
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}