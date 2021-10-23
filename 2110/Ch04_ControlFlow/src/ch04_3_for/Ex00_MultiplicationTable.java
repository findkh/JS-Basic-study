package ch04_3_for;

public class Ex00_MultiplicationTable {

	public static void main(String[] args) {
		for(int i = 0; i < 9; i++)
			System.out.println("2 X " + (i+1) + " = " + 2*(i+1));
		
//		구구단
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + "X" + j + "=" + i*j);
			}
			System.out.println();
		}
	}
}
