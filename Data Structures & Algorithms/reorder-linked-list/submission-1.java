/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {

    public static ListNode reverseNode(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		while (curr != null) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

    public void reorderList(ListNode head) {
        ListNode slow = head;
		ListNode fast = head;

		ListNode reverseHead = null;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		reverseHead = reverseNode(slow.next);
		slow.next = null;

		ListNode curr = head;
		while (reverseHead != null) {
			ListNode nextTemp = curr.next;
			ListNode revNextTemp = reverseHead.next;

			curr.next = reverseHead;
			reverseHead.next = nextTemp;

			curr = nextTemp;
			reverseHead = revNextTemp;
		}
    }

}
