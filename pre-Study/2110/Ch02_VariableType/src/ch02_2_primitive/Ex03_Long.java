package ch02_2_primitive;

public class Ex03_Long {
	public static void main(String[] args) {
		int i = 2000000000;
		long var1 = 100_0000_0000_0000_0000L;
		long var2 = 10L;
		
		System.out.println("long 최대범위 : "+Long.MAX_VALUE);
		System.out.println("long 최소범위 : "+Long.MIN_VALUE);
		System.out.println("long: " + Long.BYTES + "바이트");
	}
}
