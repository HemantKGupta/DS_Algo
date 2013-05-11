
public class Ex_1_1_27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static double binomial(int N, int k, double p)
	{
	if ((N == 0) || (k < 0)) return 1.0;
	return (1.0 - p)*binomial(N-1, k,p) + p*binomial(N-1, k-1,p);
	}

}
