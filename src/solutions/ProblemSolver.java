package solutions;

import java.math.BigInteger;

public class ProblemSolver {
	/**
	 * @param divisors an array of integers
	 * @param max an integer representing the max range of numbers
	 * @return an integer representing the sum of all the numbers from 0 to 
	 * 	<code>max</code> that are divisible by at least one of the given
	 * 	<code>divisors</code>
	 */
	public static long problem1(int[] divisors, int max){
		long sum = 0;
		
		for (int i = 0; i < max; i++){
			for (int j = 0; j < divisors.length; j++){
				if ((i % divisors[j]) == 0){
					sum += i;
					break;
				}
			}
		}
		
		return sum;
	}
	
	/**
	 * @param max
	 * @return
	 */
	public static long problem2(int max){
		int currentFibonacciNumber = 1;
		int previousFibonacciNumber = 1;
		long sum = 0;
		
		while (currentFibonacciNumber < max ){
			int numberSwapBuffer;
			
			if ((currentFibonacciNumber % 2) == 0){
				sum += currentFibonacciNumber;
			}
			
			/* Calculate the new Fibonacci number and save the old one */
			numberSwapBuffer = currentFibonacciNumber;
			currentFibonacciNumber += previousFibonacciNumber;
			previousFibonacciNumber = numberSwapBuffer;
		}
		
		return sum;
	}
	
	public static long problem3(String numberToFactorize){
		BigInteger factorize = new BigInteger(numberToFactorize);
		return 0;
	}
}
