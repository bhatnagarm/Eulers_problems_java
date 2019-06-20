public class euler_problem1{
	


	public static void main(String[] args) {
		int result = 0, countForThree = 1, countForFive = 1, countForFifteen = 1;
		System.out.println("Data values");
		while(countForThree * 3< 1000){
			System.out.println(countForThree *3);
			result += countForThree*3;
			++countForThree;
		}
		while(countForFive * 5 < 1000) {
			System.out.println(countForFive*5);
			result += countForFive*5;
			++countForFive;
		}
		while(countForFifteen *15 <1000) {
			result -= countForFifteen*15;
			++countForFifteen;
		}
		System.out.println("Final Sum = " + result);
	}
} 
