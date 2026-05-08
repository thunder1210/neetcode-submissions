class LRUCache {

class Node {
	public int key;
	public int value;
	public Node prev;
	public Node next;

	public Node() {
	}

	public Node(int key, int value) {
		this.key = key;
		this.value = value;
	}
}

    	private Node head = new Node();
	private Node last = new Node();
	private final int capacity;
	private Map<Integer, Node> map;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		head.next = last;
		last.prev = head;
		this.map = new HashMap<>();
	}

	public int get(int key) {
		if (map.containsKey(key)) {
			toTheTop(map.get(key));
			return map.get(key).value;
		}
		return -1;
	}

	public void put(int key, int value) {
		if (map.containsKey(key)) {
			Node updateNode = map.get(key);
			updateNode.value = value;
			map.put(key, updateNode);
			toTheTop(updateNode);
			return;
		}
		insert(key, value);
	}

	private void toTheTop(Node node) {
		node.prev.next = node.next;
		node.next.prev = node.prev;
		node.prev = head;
		node.next = head.next;
		head.next.prev = node;
		head.next = node;
	}

	public void insert(int key, int value) {
		Node newNode = new Node(key, value);
		newNode.prev = head;
		newNode.next = head.next;
		head.next.prev = newNode;
		head.next = newNode;
		map.put(key, newNode);
		if (map.size() > capacity) {
			Node finalNode = last.prev;
			finalNode.prev.next = last;
			last.prev = finalNode.prev;
			map.remove(finalNode.key);
		}
	}
}
