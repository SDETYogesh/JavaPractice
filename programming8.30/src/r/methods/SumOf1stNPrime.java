package r.methods;

//Java implementation of above solution
public class SumOf1stNPrime {
	
	final static double MAX = 10000 ;
	// Create a boolean array "prime[0..n]" and initialize
	// all entries it as true. A value in prime[i] will
	// finally be false if i is Not a prime, else true.
	static boolean prime[] = new boolean [(int) (MAX + 1.0)] ;
	static void sum()
	{
		
		for(int i = 0; i <= MAX; i++)
			prime[i] = true ;
		
		prime[1] = false;
	
		for (int p = 2; p * p <= MAX; p++) {
	
			// If prime[p] is not changed, then it is a prime
			if (prime[p] == true) {
	
				// Set all multiples of p to non-prime
				for (int i = p * 2; i <= MAX; i += p)
					prime[i] = false;
			}
		}
	}
	
	// find the sum of 1st N prime numbers
	static int solve(int n)
	{
		// count of prime numbers
		int count = 0, num = 1;
	
		// sum of prime numbers
		long sum = 0;
	
		while (count < n) {
	
			// if the number is prime add it
			if (prime[num]) {
				sum += num;
	
				// increase the count
				count++;
			}
	
			// get to next number
			num++;
		}
		return (int) sum;
	}
	// Driver code
	public static void main(String args[])
	{
		// create the sieve
		sum();
	
		int n = 4;
	
		// find the value of 1st n prime numbers
		System.out.println("Sum of 1st N prime numbers are :" + solve(n));
		
	}
}

