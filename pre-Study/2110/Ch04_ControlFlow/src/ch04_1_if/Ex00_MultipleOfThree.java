package ch04_1_if;

import java.util.Scanner;

public class Ex00_MultipleOfThree {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("수를 입력하세요");
		int number = in.nextInt(); //입력된 수를 int형으로 변환

		if(number%3 == 0) {
			System.out.println("3의 배수입니다");
		}else{
			System.out.println("3의 배수가 아닙니다");
		}
	}
}
