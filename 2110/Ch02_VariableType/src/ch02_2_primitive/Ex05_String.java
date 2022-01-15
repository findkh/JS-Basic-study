package ch02_2_primitive;

public class Ex05_String {

	public static void main(String[] args) {
		String str1 = "A";
		String str2 = "KOREA";
		System.out.println(str1+ ", "+str2);
		
		String str3 = "I am ";
		String str4 = "Programmer";
		System.out.println(str3 + str4);
		
		String str5 = new String("KOREA");
		System.out.print(str5.charAt(0)); //0번지만 찍음
		System.out.println(str5.charAt(1)); //1번지만 찍음
		
		String str6 = "ABC";
		String str7 = "가나다";
		
		System.out.println("ABC 길이 : "+ str6.length()); //String의 길이
		System.out.println("가나다 길이 : " + str7.length());
		
		System.out.println("ABC byte : " + str6.getBytes().length); //String의 바이트
		System.out.println("가나다 byte : " + str7.getBytes().length);
		
//		System.out.println("가나다(euc-kr): " + str7.getBytes("euc-kr").length);
//		System.out.println("가나다(utf-8): " + str7.getBytes("utf-8").length);
	}
}
