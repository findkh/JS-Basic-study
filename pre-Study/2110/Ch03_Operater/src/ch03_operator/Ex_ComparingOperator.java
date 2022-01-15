package ch03_operator;

public class Ex_ComparingOperator {
	public static void main(String[] args) {
		//비교(<, <=, >, >=, !=)
		int a = 10;
		int b = 20;
		if(a>b) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
		System.out.println("--------------");
		if(a==10) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
		System.out.println("--------------");
		String str1="abc";

		
		boolean result = str1.equals("abc");
		System.out.println(result);
		boolean result2 = str1.equals("ABC");
		System.out.println(result2);
	}
}
