package ch02_2_primitive;

public class Ex01_IntegerLiteral {
	public static void main(String[] args) {
		
		int var0 = 365; //10진수
		int var1 = 0b1011; //0b 2진수 표현
		int var2 = 0206; // 0 8진수 표현
		int var3 = 0xB3; //0x 16진수
		
		System.out.println("10진수: "+var0);
		System.out.println("2진수->int 10진수: "+var1);
		System.out.println("8진수->int 10진수: "+var2);
		System.out.println("16진수->int 10진수: "+var3);
		
		System.out.println("int: " + Integer.BYTES + "바이트");
		System.out.println("int형 최대 범위 : "+Integer.MAX_VALUE);
		System.out.println("int형 최소 범위 : "+Integer.MIN_VALUE);
		System.out.println("111" + 1); //숫자일을 스트링으로 바꿈 문자열이 되어 1111이 나옴 시험!
		System.out.println(Integer.parseInt("111") + 1); //문자열을 인트형으로 바꿈
	}
}
