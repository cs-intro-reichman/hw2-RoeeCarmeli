// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) {
		Double realPi = Math.PI;
		int numOfRepet = Integer.parseInt(args[0]);
		Double aprxPi;
		double baseNum = 0;
		Double divider = 1.0;
		
		for(int i = 1; i <= numOfRepet; i++){
			if (i % 2 == 0) {
				baseNum = baseNum - (1 / divider);
			}
			else baseNum = baseNum + (1 / divider);
			divider = divider + 2;
			//System.out.println(divider);
			//System.out.println(baseNum);
		}

		System.out.println("pi according to Java: " + realPi);
		System.out.println("pi, approximated:     " + (baseNum * 4.0));
	}
}
