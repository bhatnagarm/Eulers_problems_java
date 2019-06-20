public class euler_problem4 {

	public boolean isPalendrome(int number) {
		String stringifyInteger =  new Integer(number).toString();
		String stringifyReverseInteger = new StringBuilder(stringifyInteger).reverse().toString();
		return stringifyInteger.equals(stringifyReverseInteger); 
	}

	public int computeLargestPalendrome() {
		for (int i = 999; i>=100; i--)
			for(int j = 999; j>=100; j++)
				if (isPalendrome(i*j)) return i * j;
	return 0;
	}
	public static void main (String[] args) {
		euler_problem4 euler_problem4 = new euler_problem4();
		System.out.println(euler_problem4.computeLargestPalendrome());
	}
}
