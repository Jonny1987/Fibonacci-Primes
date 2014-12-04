
public class App {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		Fibonacci.fibonacci();
		
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		
		System.out.println("****************************************\n");
		System.out.println("Total Running Time: " + totalTime + "ms");
		
		

	}

}
