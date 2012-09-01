package solutions;

public class ProblemExecuter {
	public static void main(String[] args) {
		boolean runAllProblems = args.length == 0;
		int problemToSolve = 0;
		long startTotalTime = System.currentTimeMillis();
		long startTime;
		long endTime;
		
		/* If the app is run without any arguments then solve all problems */
		if (runAllProblems){
			System.out.println("Solving all problems, this may take a while!");
		} else {
			problemToSolve = Integer.parseInt(args[1]);
		}
				
		if (runAllProblems|| problemToSolve == 1){
        	/* Solution to problem 1 */
    		System.out.print("The solution to Problem 1 is: ");
    		startTime = System.currentTimeMillis();
    		System.out.print(ProblemSolver.problem1(new int[]{3, 5}, 1000));
    		endTime = System.currentTimeMillis();
    		System.out.println(" and it took " + (endTime - startTime) + " milliseconds!");
		}
		
		if (runAllProblems || problemToSolve == 2){
        	/* Solution to problem 2 */
    		System.out.print("The solution to Problem 2 is: ");
    		startTime = System.currentTimeMillis();
    		System.out.print(ProblemSolver.problem2(4000000));
    		endTime = System.currentTimeMillis();
    		System.out.println(" and it took " + (endTime - startTime) + " milliseconds!");
		}
		
		if (runAllProblems || problemToSolve == 3){
        	/* Solution to problem 3 */
    		System.out.print("The solution to Problem 3 is: ");
    		startTime = System.currentTimeMillis();
    		System.out.print(ProblemSolver.problem3("60085147514"));
    		endTime = System.currentTimeMillis();
    		System.out.println(" and it took " + (endTime - startTime) + " milliseconds!");
		}
		
		if (runAllProblems){
			/* Total execution time */
			endTime = System.currentTimeMillis();
			System.out.println("The entire problem set took " + (endTime - startTotalTime) + " milliseconds to finish!");	
		}
	}
}
