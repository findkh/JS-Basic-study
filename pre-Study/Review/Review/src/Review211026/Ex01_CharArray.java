package Review211026;
public class Ex01_CharArray {
	public static void main(String[] args) {
//		charArray를 String으로 변환하는 방법
//		1. String 생성자 사용		
		char[] charArray = {'J', 'a', 'v', 'a'};
		String str1 = new String(charArray);
		System.out.println(str1);
//		출력값 : Java
		
//		2. String.valueOf() 메서드 사용
		char[] charArray2 = {'h', 'y', 'u', 'n'};
		String str2 = String.valueOf(charArray2);
		System.out.println(str2);
//		출력값 : hyun
		
//		3. String.copyValueOf() 메서드 사용
		char[] charArry3 = {'g', 'a', 'h', 'e', 'e'};
		String str3 = String.copyValueOf(charArry3);
		System.out.println(str3);
//		출력 값: gahui

//		4. plentln 사용
		char[] charArray4 = {'h', 'a', 'f', 'a'};
		System.out.println(charArray4);
//		출력 값 : hafa
	}
}
