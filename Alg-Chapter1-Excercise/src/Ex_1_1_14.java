
public class Ex_1_1_14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int N =33;
		int s=0;
		for (int n = N; n > 0; n /= 2)
		s++;
		if (N/2==0){
			System.out.println(s);
		}else{
			System.out.println(s-1);
		}
		
	}

}
