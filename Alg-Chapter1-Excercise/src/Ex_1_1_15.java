import java.util.Arrays;


public class Ex_1_1_15 {
	public static void main(String[] args) {
		
		int[] histogram_array = histogram(new int[] {0,1,1,2,2,2,3,3,4,4,5,5,6,6}, 7);
		System.out.println(Arrays.toString(histogram_array));
		
	}
	
	public static int[] histogram(int[] a, int m){
		int[] b = new int [m];
		for (int i = 0; i < a.length; i++) {
			b[a[i]]=b[a[i]]+1;
		}
		return b;
	}

}
