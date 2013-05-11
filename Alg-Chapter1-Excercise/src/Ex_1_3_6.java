public class Ex_1_3_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Queue2<String> q = new Queue2<String>();
		q.enqueue("A");
		q.enqueue("B");
		q.enqueue("C");
		q.enqueue("D");
		q.enqueue("E");
		q.enqueue("F");
		q.enqueue("G");
		
		
		Stack<String> stack = new Stack<String>();
		while (!q.isEmpty())
			stack.push(q.dequeue());
		while (!stack.isEmpty())
			q.enqueue(stack.pop());
		
		System.out.println(q);
	}

}
