
import java.util.Scanner;

public class Ex4_3 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt = ' ';
		
		System.out.print("점수를 입력해주세요>");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		
		if (score >= 90 ) {
			grade = 'A';
			if (score>=98) {
				opt = '+';
			} else if (score < 94) {
				opt = '-';
			}
		} 
		else if (score >= 80) {
			grade = 'B';
			if (score>=88) {
				opt = '+';
			} else if (score<=84) {
				opt ='-';
			}
		} 
		else if (score >= 70) {
			grade = 'C';
			if (score >= 78) {
				opt = '+';
			} else if (score <= 74) {
				opt = '-';
				}
		}
		else if (score >=60) {
			grade = 'D';
			if (score >= 68) {
				opt = '+';
			} else if (score <= 64) {
				opt = '-';
			}
		}
		else if (score >=50) {
			grade = 'D';
			if (score >= 58) {
				opt = '+';
			} else if (score <= 54) {
				opt = '-';
			}
		}	
		else {
			grade = 'F';
		}
			System.out.printf("당신의 점수는 %d입니다.%n", score);
			System.out.printf("당신의 학점은 %c%c입니다%n", grade, opt);
		}
}
