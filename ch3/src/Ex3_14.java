
public class Ex3_14 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\" == \"abc\" ? %b%n", "abc"=="abc");
		//"abc" == "abc" ? true
		
		System.out.printf("str1 == \"abc\" ? %b%n", str1=="abc");
		//str1 == "abc" ? true
		
		System.out.printf("str2 == \"abc\" ? %b%n", str2=="abc");
		//str2 == "abc" ? false
		// abc가 같은데도 false를 반환하는 이유는 서로 다른 객체라서 그렇다.
		//equals를 사용하면 객체가 달라도 true를 반환한다.
		
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		//str1.equals("abc") ? true
		
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		//str2.equals("abc") ? true
		
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		//str2.equals("ABC") ? false
		
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
		//str2.equals("ABC") ? true
		//equalsIgnoreCase를 사용하면 대소문자 구별하지 않음.
		
		// \" 이렇게 쓰는 이유는 따옴표를 붙이기 위해서 
		// %b boolean으로 표현 %n 개행


	}

}
