public class Ex_1_2_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		StdDraw.setCanvasSize(500, 500);
		StdDraw.setXscale(0, 100);
		StdDraw.setYscale(0, 100);
		StdDraw.setPenRadius(.005);
		StdDraw.setPenColor(StdDraw.RED);
		int N = 3;
		Point2D[] points = new Point2D[N];
		for (int i = 0; i < N; i++) {
			int x = StdRandom.uniform(100);
			int y = StdRandom.uniform(100);
			points[i] = new Point2D(x, y);
			points[i].draw();
			System.out.println(points[i]);
		}
		double temp = 100000000.0;
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points.length; j++) {
				if (i > j) {
					double d = points[i].distanceSquaredTo(points[j]);
					
					StdDraw.line(points[i].x(), points[i].y(), points[j].x(),
							points[j].y());
					if(d<temp) temp=d;
				}
			}

		}
		System.out.println(temp);
	}

}
