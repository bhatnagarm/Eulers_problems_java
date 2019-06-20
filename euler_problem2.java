public class euler_problem2 {


	public int fibonacciSeries(int n) {
		if (n < 2) {
			return n;
		}
		return fibonacciSeries(n-1) + fibonacciSeries(n-2);
	}
	public static void main(String[] args) {
		euler_problem2 euler_problem2 = new euler_problem2();
		int n = 1,result = 0 ,term = 0 ;
		do {
			term = euler_problem2.fibonacciSeries(n);
			n++;
			System.out.println(term);
			if (term % 2 == 0 )  result +=term;
		
		}while(term<=4000000);
		System.out.println("Result " + result);
	}

// Can be better . Calling fibonacci at every step.

}
