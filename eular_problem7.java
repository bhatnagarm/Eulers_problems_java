public class eular_problem7 {

	public boolean isPrime(int number){
		for (int i =2;i <= Math.ceil(Math.sqrt(number)); i++) {
			if (number%i == 0) return false;
		}
		return true;
	}

	public static void main (String[] args) {
		eular_problem7 eular_problem7 = new eular_problem7();
		int count = 0;
		int counter = 2;
		int primeCount = 0;
		do {
			counter++;
			if(eular_problem7.isPrime(counter)){
				primeCount ++; 
				count += counter;
			}
		}while(primeCount<=10000);
		System.out.println("CounterDetails" + count);
	}


}
