
public class Ex_1_1_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//a
		/*double t = 9.0;
		while (Math.abs(t - 9.0/t) > .001)
		{t = (9.0/t + t) / 2.0;
		StdOut.printf("%.5f\n", t);
		}
		StdOut.printf("%.5f\n", t);
		System.out.println((char) ('a' + 4));
		*/
		
		//b adding natural no
		/*int sum = 0;
		for (int i = 1; i < 10; i++)
		for (int j = 0; j < i; j++)
		sum++;
		StdOut.println(sum);*/
		
		//c Adding 1 with other even no
		int sum = 0;
		for (int i = 1; i < 10; i *= 2)
		for (int j = 0; j < i; j++)
		sum++;
		StdOut.println(sum);
	}

}
