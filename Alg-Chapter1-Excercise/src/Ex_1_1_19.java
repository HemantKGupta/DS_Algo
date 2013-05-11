public class Ex_1_1_19 {
	static long[] a;
	public static long F(int N) {
		if (N == 0)
			return 0;
		if (N == 1)
			return 1;
		return F(N - 1) + F(N - 2);
	}

	public static void main(String[] args) {
		a=new long [93];
		a[0]=0;
		a[1]=1;
		for (int N = 0; N < 93; N++)
			StdOut.println(N + " " + F2(N));
	}
	
	public static long F2(int N) {
		if (N == 0)
			return a[0] ;
		if (N == 1)
			return a[1];
		a[N - 1]= F2(N-1);
		//a[N - 2]= F2(N-2);
		return a[N - 1] + a[N - 2];
	}
}
