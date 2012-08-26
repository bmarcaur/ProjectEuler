package solutions;

public class Problem_2 {
	public static void main(String[] args) {
		long sum = 0;
		int currentFibonacciNumber = 1;
		int previousFibonacciNumber = 1;
		int maximumFibonacciNumber = 4000000;
		
		while (currentFibonacciNumber < maximumFibonacciNumber ){
			int numberSwapBuffer;
			
			if ((currentFibonacciNumber % 2) == 0){
				sum += currentFibonacciNumber;
			}
			
			/* Calculate the new Fibonacci number and save the old one */
			numberSwapBuffer = currentFibonacciNumber;
			currentFibonacciNumber += previousFibonacciNumber;
			previousFibonacciNumber = numberSwapBuffer;
		}
		
		System.out.print("The sum equals: " + sum);
	}
}
