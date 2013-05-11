import java.util.Arrays;

public class Ex_1_1_22 {

	// precondition: array a[] is sorted
	public static int rank(int key, int[] a, int low, int high, int depth) {
		System.out.println("Low is: "+low);
		System.out.println("High is: "+high);
		System.out.println("Depth is: "+depth);
		if (low == high && a[low] == key){
			System.out.println("Got value at :"+low);
			return low;
		}
		else {

			int mid = low + (high - low) / 2;
			System.out.println("Mid is: "+mid);
			depth++;
			if (key < a[mid]){
				System.out.println("Will search in lower...");
				rank(key, a, low, mid - 1,depth);
			}
			else if (key > a[mid]){
				System.out.println("Will search in upper...");
				rank(key, a, mid + 1, high,depth);
			}
			else
			{	System.out.println("Got value at :"+mid);
				return mid;
			}	
		}
		
		
	}

	public static void main(String[] args) {
		int[] whitelist = In.readInts(args[0]);

		Arrays.sort(whitelist);
		// Arrays.asList(whitelist)
		System.out.println(Arrays.toString(whitelist));
		// read key; print if not in whitelist
		// while (!StdIn.isEmpty()) {
		// int key = StdIn.readInt();
		int key = 18;
		if (rank(key, whitelist, 0, whitelist.length-1,0) == -1) {
			StdOut.println("Not Found key: " + key);
		} else {
			StdOut.println("Found key: " + key);
		}
		// }
	}
}
