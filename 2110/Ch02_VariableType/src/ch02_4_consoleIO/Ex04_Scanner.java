package ch02_4_consoleIO;

import java.util.Scanner;

public class Ex04_Scanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두 자리 정수를 하나 입력해주세요>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input); //String을 Int로 변환한다
		
		System.out.println("입력내용 :"+input);
		System.out.printf("num+1=%d%n", num+1); //Int형임을 확인하기 위해 +1을 함
	}
}
