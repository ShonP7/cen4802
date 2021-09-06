
/**
 * Date: September 4, 2021
 * @author Shon Pierce
 * @version 1.0
 * 
 *<p>
 *This method accepts n as a parameter. The recursive function takes in a number and 
 *checks for 1 or 0. When input(n) is greater than 1(r) or 0(y) the function calls it self 
 *recursively until the loops terminating condition is meet.       
 * 
 *@param fibonacciIteration  
 *@returns an nth term of the fibonacci sequence 
 *
 *	static int fibonacciIteration(int n){
		int r = 1;
		int y =0;
		
		switch(n) {
		case 0:
			r = 0;
			break;
		
		case 1:
			r = 1;
			break;
		
		default:
			for(int i = 1; i < n; i++) {
				r += y;
				y = r - y;
			}
			break;
		}
		
		return r;
	}
 *
 */

public class Fibonacci {
	
	public static void main(String [] args) {
		int n;
		  n = fibonacciIteration(10);
	        System.out.printf("\n\nThe %d number of the Fibonacci sequence "
	        		+ "is %d\n", 10 , n);
	    	
	} //end main
	
	static int fibonacciIteration(int n){
		int r = 1;
		int y =0;
		
		switch(n) {
		case 0:
			r = 0;
			break;
		
		case 1:
			r = 1;
			break;
		
		default:
			for(int i = 1; i < n; i++) {
				r += y;
				y = r - y;
			}
			break;
		}
		
		return r;
	}

} // end class



