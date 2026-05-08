/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> temp = new HashMap<>();
		Node mirrored = head;

		while (mirrored != null) {
			temp.put(mirrored, new Node(mirrored.val));
			mirrored = mirrored.next;
		}
		mirrored = head;

		while (mirrored != null) {
			Node node = temp.get(mirrored);
			node.next = temp.get(mirrored.next);
			node.random = temp.get(mirrored.random);
			mirrored = mirrored.next;
		}
		return temp.get(head);
    }
}
