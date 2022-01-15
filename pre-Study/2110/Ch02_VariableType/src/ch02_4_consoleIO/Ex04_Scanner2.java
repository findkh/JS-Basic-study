package ch02_4_consoleIO;

import java.util.Scanner;

public class Ex04_Scanner2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputData;
		
		while(true) {
			System.out.print("문자열을 입력해주세요> ");
			inputData = sc.nextLine();
			
			System.out.printf("당신이 입력한 문자열은 %s%n", inputData);
			
		 if (inputData.equals("q")) {
			 break;
		 }
		}
		
		System.out.println("good bye");
		sc.close();

	}

}
