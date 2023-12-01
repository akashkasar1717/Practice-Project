package recursion;

public class SumOfNumbers {
	public static int sumOfNumbers(int limit) {
		if(limit>0) {
			return limit+(sumOfNumbers(limit-1));
		}
		return limit;
	}
	public static void main(String[] args) {
		int firstTenNos=10;
		int sum=sumOfNumbers(firstTenNos);
		System.out.println(sum);
	}

}
