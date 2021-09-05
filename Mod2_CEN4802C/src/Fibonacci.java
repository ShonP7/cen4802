
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


//naive recursive algorithm
	// if n <= 2: f=1
	//else f = fib(n-1) + fib(n-2)
	// return return f
