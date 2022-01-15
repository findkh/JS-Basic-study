package ch02_2_primitive;

public class Ex04_Character {
	public static void main(String[] args) {
		System.out.println("char: " + Character.BYTES + "바이트");
		System.out.println("char형 최대범위 : "+(int)Character.MAX_VALUE);
		System.out.println("char형 최대범위 : "+(int)Character.MIN_VALUE);

		char ch = '가';
		System.out.println(ch);
		System.out.println((int)ch);
		
		char ch1 = 44032;
		char ch2 = 65;
		System.out.println(ch1);
		System.out.println(ch2);
	}
}
