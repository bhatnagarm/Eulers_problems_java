public class euler_problem5 {


	public int gcd(int a, int b) {
		if (b ==0) return a;
		else return gcd(b,a%b);
	}

	public int lcmValue () {
		int hcfValue =0, multi =1;
		for (int i =1; i<20; i++) {
			hcfValue = gcd(i,i+1);
			multi *= i;
		}
		return multi/hcfValue;
	}

	public static void main (String[] args) {
		euler_problem5 euler_problem5 = new euler_problem5();
		System.out.println(euler_problem5.lcmValue());
	}
}
