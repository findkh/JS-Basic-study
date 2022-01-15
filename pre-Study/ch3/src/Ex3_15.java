import java.util.Scanner;

public class Ex3_15 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			char ch = ' ';
			
			System.out.printf("숫자나 영문자 하나 입력하세요.>");
			
			String input = scanner.nextLine();
			ch = input.charAt(0);
			
			if('0' <= ch && ch <= '9') {
				System.out.printf("입력하신 문자는 숫자입니다.%n");
			} else if ('a' <= ch && ch <= 'z') {
				System.out.printf("입력하신 문자는 소문자입니다%n");
			} else if('A' <= ch && ch <= 'Z') {
				System.out.printf("입력하신 문자는 대문자입니다%n");					
			} else //if(!('0' <= ch && ch <= '9') || !('a' <= ch && ch <= 'z') || !('A' <= ch && ch <= 'Z'))
				System.out.printf("잘못 입력하셨습니다%n");
			}
		}
