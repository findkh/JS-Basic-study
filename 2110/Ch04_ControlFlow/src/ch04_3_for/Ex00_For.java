package ch04_3_for;

public class Ex00_For {
	public static void main(String[] args) {
		//1부터 10까지 합을 더하라	
		int sum = 0;
		for(int i=0; i<=10; i++) {
//			int sum = 0; 왜?????
			sum += i;
		}
		
		System.out.println("1~10합계 : " + sum);
		}
}
