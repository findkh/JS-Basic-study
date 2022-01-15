package ch02_2_primitive;

public class Ex02_Byte {
	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		int var7 = 128;		
		byte b = (byte) 128;
		System.out.println(b);

		System.out.println(var7);
		System.out.println("byte: " + Byte.BYTES + "바이트");
		System.out.println("byte의 최대범위 : " + Byte.MAX_VALUE);
		System.out.println("byte의 최소범위 : " + Byte.MIN_VALUE);
	}
}
