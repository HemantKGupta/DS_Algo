import java.util.Scanner;

public class Ex_1_3_10 {

	public static void main(String[] args) {

		Stack<Object> stack = new Stack<Object>();
		StringBuilder output = new StringBuilder();
		 String input = " ( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )";
		//String input = "2 * 3 + 4";
		Scanner sc = new Scanner(input);
		while (sc.hasNext()) {

			if (sc.hasNextInt()) {
				output.append(sc.nextInt());
			} else {
				String s = sc.next();
				System.out.println("Processing: " + s);
				if (s.equals("(")) {

					stack.push(s);
					System.out.println("Pushed in stack: " + s);
				} else if (s.equals("+") || s.equals("-") || s.equals("*")
						|| s.equals("/")) {

					while (!stack.isEmpty()
							&& ComparePrecedence((String) stack.peek(), s)) {
						output.append(stack.pop());
					}
					stack.push(s);
					System.out.println("Pushed in stack: " + s);
				} else if (s.equals(")")) {
					while (!stack.peek().equals("(")) {
						output.append(stack.pop());
					}
					stack.pop();
				}

			}//End processing non operand item

		}// End while loop

		while (!stack.isEmpty()) {
			output.append(stack.pop());
		}

		System.out.println(output);
	}

	private static boolean ComparePrecedence(String first, String second) {
		System.out.println("comparing " + first + " and " + second);
		if (first.equals("+") && second.equals("*")) // + has lower precedence
														// than *
			return false;

		if (first.equals("*") && second.equals("-")) // * has higher precedence
														// over -
			return true;

		if (first.equals("+") && second.equals("-")) // + has same precedence
														// over +
			return true;

		return true;
	}

}
