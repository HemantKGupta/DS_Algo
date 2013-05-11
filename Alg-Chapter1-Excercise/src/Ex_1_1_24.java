public class Ex_1_1_24 {
	public static void main(String[] args) {
		System.out.println(gcd(1111111,1234567));
	}
	public static int gcd(int p, int q) {
		System.out.println("Two integers are :"+p+" and "+q);
		if (q == 0)
			return p;
		int r = p % q;
		return gcd(q, r);
	}
}
