import java.lang.*;

public class euler_problem3 {


	public boolean isPrime(double number) {
		for (double i =2; i< Math.ceil(Math.sqrt(number)); i++) {
			if (number % i == 0 ) return false;
		}
		return true;
	}
	public static void main (String[] args) {
		
		euler_problem3 euler_problem3 = new euler_problem3();
		for (double n = 600851475142L; n>1; n--) {
			if (600851475143L % n==0 )
				System.out.print(n + "        "); 
				if (euler_problem3.isPrime(n)) {
					System.out.println(n);
					return;
				}
		}
		
	}

}
