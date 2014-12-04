
public class Fibonacci {
	
	static void fibonacci() {
		long i=0;
		long j=1;
		long k = 0;
		while(true) {
			k = i + j;
			i = j;
			j = k;
			Prime.prime(k);
		}
	}

}
