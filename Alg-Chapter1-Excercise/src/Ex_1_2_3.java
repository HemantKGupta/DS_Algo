public class Ex_1_2_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//int N = 10;
		for (int i = 0; i < 10; i++) {

			Interval1D xinterval = new Interval1D(StdRandom.uniform(2, 8),
					StdRandom.uniform(2, 8));
			Interval1D yinterval = new Interval1D(StdRandom.uniform(2, 8),
					StdRandom.uniform(2, 8));
			Interval2D box = new Interval2D(xinterval, yinterval);
			box.draw();

		}

	}

}
