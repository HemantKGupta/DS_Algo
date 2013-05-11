import java.util.Iterator;
import java.util.NoSuchElementException;

public class Ex_1_3_37 {
	

	/**
	 *  The <tt>Queue</tt> class represents a first-in-first-out (FIFO)
	 *  queue of generic items.
	 *  It supports the usual <em>enqueue</em> and <em>dequeue</em>
	 *  operations, along with methods for peeking at the top item,
	 *  testing if the queue is empty, and iterating through
	 *  the items in FIFO order.
	 *  <p>
	 *  All queue operations except iteration are constant time.
	 *  <p>
	 *  For additional documentation, see <a href="http://algs4.cs.princeton.edu/13stacks">Section 1.3</a> of
	 *  <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
	 */
	    class Queue<Item> implements Iterable<Item> {
	    private int N;         // number of elements on queues
	    private Node last;     // end of queue

	    // helper linked list class
	    public class Node {
	        private Item item;
	        private Node next;
	    }

	   /**
	     * Create an empty queue.
	     */
	    public Queue() {
	        last  = null;
	        N = 0;
	    }

	   /**
	     * Is the queue empty?
	     */
	    public boolean isEmpty() {
	        return last == null;
	    }

	   /**
	     * Return the number of items in the queue.
	     */
	    public int size() {
	        return N;     
	    }

	   /**
	     * Return the item least recently added to the queue.
	     * @throws java.util.NoSuchElementException if queue is empty.
	     */
	    public Item peek() {
	        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
	        return last.next.item;
	    }

	    
	    /**
	     * Add the item to the queue.
	     */
	    public void enqueue(Item item) {
	    	
	    	if(last==null){
	    		System.out.println("Adding first item.");
	    		last = new Node();
		        last.item = item;
		        last.next=last;
		        N++;
	        } else{	       
	        Node newnode = new Node();
	        newnode.item = item;
	        newnode.next=last.next;
	        last.next=newnode;
	        last=newnode;
	        
	        N++;
	        } 
	    }

	   /**
	     * Remove and return the item on the queue least recently added.
	     * @throws java.util.NoSuchElementException if queue is empty.
	     */
	    public Item dequeue() {
	        if (isEmpty())throw new NoSuchElementException("Queue underflow");
	                
	        if(last.next==last){
	        	Item item =last.item;
	        	last=null;
	        	N--;
	        	return item;
	        }
	        Item item = last.item;
	        last.next=last.next.next;
	        N--;
	        return item;
	    }

	   /**
	     * Return string representation.
	     */
	    public String toString() {
	        StringBuilder s = new StringBuilder();
	        for (Item item : this)
	            s.append(item + " ");
	        return s.toString();
	    } 

	   
	 

	   /**
	     * Return an iterator that iterates over the items on the queue in FIFO order.
	     */
	    public Iterator<Item> iterator()  {
	        return new ListIterator();  
	    }

	    // an iterator, doesn't implement remove() since it's optional
	    private class ListIterator implements Iterator<Item> {
	        private Node current = last.next;

	        public boolean hasNext()  { return current != null;                     }
	        public void remove()      { throw new UnsupportedOperationException();  }

	        public Item next() {
	            if (!hasNext()) throw new NoSuchElementException();
	            Item item = current.item;
	            current = current.next; 
	            return item;
	        }
	    }


	    }    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue<String> q = new Ex_1_3_37().new Queue<String>();
        q.enqueue("0");
        q.enqueue("1");
        q.enqueue("2");
        q.enqueue("3");
        q.enqueue("4");
        q.enqueue("5");
        q.enqueue("6");
        q.enqueue("7");
        q.enqueue("8");
        q.enqueue("9");
        
        Queue<String>.Node first = q.last.next; 
        System.out.println(first.item);
        
        Queue<String>.Node tmp = first.next.next;
        System.out.println(tmp.next.item);
        tmp.next = tmp.next.next;
        
        tmp= tmp.next.next.next;
        System.out.println(tmp.next.item);
        tmp.next = tmp.next.next;
        
        tmp= tmp.next.next.next;
        System.out.println(tmp.next.item);
        tmp.next = tmp.next.next;
        tmp= tmp.next.next.next;
        System.out.println(tmp.next.item);
        tmp.next = tmp.next.next;
        tmp= tmp.next.next.next;
        System.out.println(tmp.next.item);
        tmp.next = tmp.next.next;
        tmp= tmp.next.next.next;
        System.out.println(tmp.next.item);
        tmp.next = tmp.next.next;
        tmp= tmp.next.next.next;
        System.out.println(tmp.next.item);
        tmp.next = tmp.next.next;
        tmp= tmp.next.next.next;
        System.out.println(tmp.next.item);
        tmp.next = tmp.next.next;
        tmp= tmp.next.next.next;
        System.out.println(tmp.next.item);
        tmp.next = tmp.next.next;
        
        StdOut.println("(" + q.size() + " left on queue)");
	}
	
}
