package uge08;

public class Main {

	public static void main(String[] args) {
		
		int[] a = {40,50,66,68,15,54,68,43};
		
		ArrayUtils AUtil = new ArrayUtils(a);
		
		System.out.println(AUtil.arrayToString());
		
		System.out.println(AUtil.occurences(66));
		
		System.out.println(AUtil.sumOfArray());
		
	}
	
}
