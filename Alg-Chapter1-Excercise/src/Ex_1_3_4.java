
public class Ex_1_3_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s= "[()]{}{[()()](}";
		
		Stack<String> stack = new Stack<String>();
		
		for (int i = 0; i < s.length(); i++) {
			String current = ""+s.charAt(i);
			if (current.equals("(")||current.equals("{")||current.equals("[")){
			
				stack.push(current);
			
				
			}else {
				String top = stack.pop();
				if( top.equals("(") && !current.equals(")")) {
					System.out.println("Not matched");
				}else 	if(top.equals("{") && !current.equals("}")) {
					System.out.println("Not matched");
				} else 	if(top.equals("[") && !current.equals("]")) {
					System.out.println("Not matched");
				}
				
			}
		}
		
		if(!stack.isEmpty()){
			System.out.println("Not matched");
		}
	}

}
