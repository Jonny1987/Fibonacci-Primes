public class Prime {

	static void prime(long number) {

		boolean isPrime = false;
		
		long end = (long) (Math.sqrt(number) + 1);
		for (long i = 2; i <= end; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			} else {
				isPrime = true;
			}
		}
		if (isPrime) {
			System.out.println(number);
		}

	}

}
