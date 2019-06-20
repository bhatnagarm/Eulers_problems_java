public class eular_problem10 {


	public boolean isPrime(int number){
		for (int i = 2; i<=Math.ceil(Math.sqrt(number));i++) {
			if (number%i == 0 ) return false;
		}
		return true;
	}

	public int sumPrime(int limit){
		int counter = 3, total = 0;
		while(counter <=limit) {
			if (isPrime(counter) == true) {
				total +=counter;
			}
			++counter;
		}
		return total+2;
	}

	
	public static void main (String[] args) {
		eular_problem10 eular_problem10 = new eular_problem10();
		System.out.println(eular_problem10.sumPrime(2000000));
	}
}
