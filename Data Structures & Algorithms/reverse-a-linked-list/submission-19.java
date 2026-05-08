class Solution {
    public ListNode reverseList(ListNode head) { // 1. 改成回傳 ListNode
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) { // 2. 讓最後一根薯條也進來處理
            ListNode temp = curr.next; 
            curr.next = prev;          
            prev = curr;               
            curr = temp;               
        }
        
        return prev; // 3. 回傳最後處理完的那根（新的龍頭）
    }
}