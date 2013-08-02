public class Ex_1_1_30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node first = new Node();
		first.item = 1;
		Node temp = first;

		for (int j = 2; j < 6; j++) {
			Node n = new Node();
			n.item = j;
			temp.next = n;
			temp = temp.next;
		}

		Node t = first;
		while (null != t) {
			System.out.println(t.item);
			t = t.next;
		}

		// Node newfirst = reverse(first);
		// Node newfirst = reverseRecu(first);
		// Node newfirst = reverse2(first);
		// Node newfirst = reverse3(first);
		/*
		 * Node t1= newfirst; while(null!=t1){ System.out.println(t1.item);
		 * t1=t1.next; }
		 */

		// printReverse(first);
		Node newfirst = reverseR(first);

		Node t1 = newfirst;
		while (null != t1) {
			System.out.println(t1.item);
			t1 = t1.next;
		}

	}

	public static Node reverseRecu(Node curr) {

		if (curr.next == null) {
			Node n = new Node();
			n.item = curr.item;
			n.next = null;
			return n;
		} else {
			Node n = reverseRecu(curr.next);
			Node m = new Node();
			m.item = curr.item;
			Node tmp = n;
			while (null != tmp.next) {
				tmp = tmp.next;
			}
			tmp.next = m;
			return n;
		}

	}

	public static Node reverse(Node curr) {

		Node first = new Node();
		first.item = curr.item;
		curr = curr.next;
		while (curr != null) {
			Node temp = new Node();
			temp.item = curr.item;
			temp.next = first;
			first = temp;
			curr = curr.next;
		}

		return first;

	}

	public static Node reverse2(Node head) {

		Node curr = head;
		Node prev = null;

		while (curr.next != null) {

			// Make a new node to hold current.next
			Node nextNode = curr.next;
			// Update the current.next as new prev
			curr.next = prev;
			prev = curr;
			curr = nextNode;
		}

		curr.next = prev;
		head = curr;
		return head;

	}

	public static Node reverse3(Node head) {
		if (head == null)
			return head;

		Node current = head;
		Node previous = null;

		while (current != null) {
			Node nextNode = current.next;

			current.next = previous;
			previous = current;
			current = nextNode;
		}

		head = previous;
		return head;
	}

	/*
	 * void reverse(Node*& p) { if (!p) return; Node* rest = p->next; if (!rest)
	 * return; reverse(rest); p->next->next = p; p->next = NULL; p = rest; }
	 */
	public static Node reverseR(Node current) {		
		if (current == null || current.next == null )
			return current ;
		Node nextItem = current.next;
		current.next = null;
		Node reverseRest = reverseR(nextItem);
		nextItem.next = current;
		return reverseRest;
	}

	public static void printReverse(Node head) {
		Node current = head;
		reversePrintRecursive(current);
	}

	private static void reversePrintRecursive(Node current) {
		// if reached the end of the list, just print the tail
		if (null == current.next) {
			System.out.println("End Item is: " + current.item);
			return;
		} else {
			// Store the current element and print next element recursively
			int value = current.item;
			reversePrintRecursive(current.next);
			System.out.println("Item is: " + value);
		}
	}

	static class Node {

		private int item;
		private Node next;
	}

}
