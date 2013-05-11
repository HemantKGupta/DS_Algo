import java.util.Iterator;
import java.util.NoSuchElementException;


public class Ex_1_3_31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Ex_1_3_31.DoubleLinkedList<String> dll =   new Ex_1_3_31(). new DoubleLinkedList<String>();
		dll.insertAtBeginning("First");
		dll.insertAtBeginning("Second");
		dll.insertAtBeginning("Third");
		dll.removeFromBeginning();
		System.out.println(dll.toString());
		
	}

	class DoubleLinkedList<Item> implements Iterable<Item> {

		Node first;
		int N;

		class Node {
			Item item;
			Node next;
			Node previous;

		}

		public DoubleLinkedList() {
			first = null;
			N = 0;
		}

		public boolean isEmpty() {
			return first == null;
		}

		public int size() {
			return N;
		}

		public void insertAtBeginning(Item item) {

			Node oldfirst = first;
			first = new Node();
			first.item = item;
			first.next=null;
			first.previous=null;			
			if(oldfirst != null){				
				oldfirst.previous=first;
			}
			
		}
		public void insertAtEnd(Item item) {
			
			Node toInsert= new Node();
			toInsert.item=item;
			Node temp =first;
			while(temp.next!=null){
				temp.next=toInsert;
				toInsert.previous=temp;
			}
					
		}
		public void insertAfterNode(Node given, Item item) {
			
			Node toInsert= new Node();
			toInsert.item=item;
			toInsert.next=given.next;
			toInsert.previous=given;
			given.next.previous=toInsert;
			given.next=toInsert;
			
		}
		public void insertBeforeNode(Node given, Item item) {
			
			Node toInsert= new Node();
			toInsert.item=item;
			
			toInsert.next=given;
			toInsert.previous=given.previous;
			given.previous.next=toInsert;
			given.previous=toInsert;
			
		}

		
		public Item removeFromBeginning() {
			if (isEmpty())
				throw new NoSuchElementException("Stack underflow");
			Item item = first.item; // save item to return
			first = first.next; // delete first node
			N--;
			return item; // return the saved item
		}
		
		public Item removeFromEnd() {
			if (isEmpty())
				throw new NoSuchElementException("Stack underflow");
			Node temp =first;
			Item item = null;
			while(temp.next!=null){
				item=temp.item;
				temp.previous.next=null;
			}
			N--;
			return item; // return the saved item
		}
		
		public void removeNode(Node given) {
			if (isEmpty())
				throw new NoSuchElementException("Stack underflow");
			given.next.previous=given.previous;
			given.previous.next=given.next;
			N--;
		}
		

		public String toString() {
			StringBuilder s = new StringBuilder();
			for (Item item : this)
				s.append(item + " ");
			return s.toString();
		}

		public Iterator<Item> iterator() {
			return new ListIterator();
		}

		// an iterator, doesn't implement remove() since it's optional
		private class ListIterator implements Iterator<Item> {
			private Node current = first;

			public boolean hasNext() {
				return current != null;
			}

			public void remove() {
				throw new UnsupportedOperationException();
			}

			public Item next() {
				if (!hasNext())
					throw new NoSuchElementException();
				Item item = current.item;
				current = current.next;
				return item;
			}
		}

	}

}
