public class euler_problem6 {


	public static void main (String[] args) {
		int result = 0;
		for (int i = 1; i <= 100; i++)
			for (int j =1; j<=100; j++)
				if (i != j) result += i*j;

		System.out.println("Final Result:" + result);
	}
}
