import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, String> m= new HashMap<String, String>(); 
		//String w= "ABCDAB";
		//String w= "PARTICIPATE IN PARACHUTE";
		String w= "ABCDABD";
		String text="ABC ABCDAB ABCDABCDABDE";
		
		int T[] = new int[w.length()];
		T[0]=-1;
		T[1]=0;
		int pos=2;
		int cnd=0;
		
		while(pos<w.length()){
			if(w.charAt(pos-1)==w.charAt(cnd)){
				cnd++;
				T[pos]=cnd;
				pos++;
			}else if (cnd>0){
				cnd=T[cnd];
			}else{
				T[pos]=0;
				pos++;
			}
		}
		
		System.out.println(Arrays.toString(T));
		
		int m1=0;
		int i=0;
		
		while(m1+i < text.length()-1){
			
			if(w.charAt(i)==text.charAt(m1+i)){
				
				if(i==w.length()-1){
					System.out.println("Got it at m: "+m1);
					System.exit(0);
				}
				
				i++;
				
			}else{
				
				m1=m1+i-T[i];
				
				if(T[i]>-1){
					i=T[i];
				}
				i=0;			
			}
		}
		
		
	}

}
