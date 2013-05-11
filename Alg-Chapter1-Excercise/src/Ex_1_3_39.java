import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;


public class Ex_1_3_39<T> {
	 private T[] buffer;

	  private int tail;

	  private int head;
	  
	  private int n;

	  @SuppressWarnings("unchecked")
	  public Ex_1_3_39(int size) {
		n=size;
	    buffer = (T[]) new Object[n];
	    tail = 0;
	    head = 0;
	  }

	  public void add(T toAdd) {
	    if (!isFull()) {
	    	tail++;
	        buffer[tail] = toAdd;
	        tail = tail % buffer.length;
	    } else {
	        throw new BufferOverflowException();
	    }
	    
	  }
	  
	  public boolean isFull(){
		  
		if( head == (tail+1)% buffer.length){
			 return true;
		 }
		 return false;
	  }
	  
	  public boolean isEmpty(){
		  if( (head==tail) ){
			  return true;
		  }
		  return false;
	  }
	  
	  public T remove() {
	    T t = null;
	    if (!isEmpty()) {	    
	        t = (T) buffer[head];
	        head++;
	        head = head % buffer.length;
	    } else {
	        throw new BufferUnderflowException();
	    }
	    return t;
	  }
	  
	 

	  public String toString() {
	    return "CircularBuffer(size=" + (buffer.length-1) + ", head=" + head + ", tail=" + tail + ")";
	  }

	  public static void main(String[] args) {
		  Ex_1_3_39<String> b = new Ex_1_3_39<String>(3);
	    
	        System.out.println("Start: " + b);
	        b.add("One");
	        System.out.println("One: " + b);
	        b.add("Two");
	        System.out.println("Two: " + b);
	        b.add("Three");
	        System.out.println("Three: " + b);
	       // b.add("Four");
	        System.out.println("Got '" + b.remove() + "', now " + b);
	        System.out.println("Got '" + b.remove() + "', now " + b);
	        System.out.println("Got '" + b.remove() + "', now " + b);
	      //  System.out.println("Got '" + b.remove() + "', now " + b);

	  
	  }
}
