
public class StringPatternMatch {
	public static void main(String[] args) {
		System.out.println(match());
}
	 public static boolean match() {
		  String text="dhwiudhwuohfjqwjdfpo";
		  String pattern= "hwu";
		  int[] failure=new int[3];
		  int matchPoint=0;
		    int j = 0;
		    if (text.length() == 0) return false;
		    
		    for (int i = 0; i < text.length(); i++) {
		      while (j > 0 && pattern.charAt(j) != text.charAt(i)) {
		        j = failure[j - 1];
		      }
		      if (pattern.charAt(j) == text.charAt(i)) { j++; }
		      if (j == pattern.length()) {
		        matchPoint = i - pattern.length() + 1;
		        return true;
		      }
		    }
		    return false;
		  }

	public static void match1(){
	String text="dhwiudhwuohfjqwjdfpo";
	String pattern = "hwu";
	int i=0;
	int j=0;
	for (i = 0; i < text.length()-pattern.length(); i++) {
		for (j = 0; j < pattern.length(); j++) {				
			if(text.charAt(i+j)!=pattern.charAt(j))
				break;
		}
		if (j==pattern.length()){
			System.out.println("Pattern found at: "+i);
		}
		}
		
	}
}

