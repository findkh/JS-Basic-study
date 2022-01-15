package ch02_1_variable;

public class Ex03_VariableExchange {
	public static void main(String[] args) {
		int x = 97;
		int y = 98;
		System.out.println("x:" + (char)x + ", y:" + (char)y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + (char)x + ", y:" + (char)y);
		
		
		int c1 = 97;
		char c2 = 97;
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		System.out.println("c1=" + (char)c1);
		System.out.println("c2=" + (float)c2);
	}
}
