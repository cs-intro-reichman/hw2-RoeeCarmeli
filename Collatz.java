// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		
		int seed = Integer.parseInt(args[0]);
		String doShow = args[1];
		int newSeed = 0;
		int i = 0;
		int count = 1;

		if (doShow == "c") System.out.print("Every one of the first " + seed +
		 " hailstone sequences reached 1.");
		else{
			while (i < seed) {
				while (newSeed != 1) {
					if (newSeed == 0){
						System.out.print("1 ");
						newSeed = 4;
						count++;
					}
					System.out.print(newSeed + " ");
					if (newSeed % 2 == 0) newSeed = newSeed / 2;
					else newSeed = (newSeed * 3) + 1;
					count++;	
				}
				System.out.println(newSeed + " (" + count + ")");
				newSeed = i + 2;
				i++;
				count = 1;
			}
				
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1."); 
	}
	}
}
