package ch04_1_if;
import java.util.Scanner;
public class Ex00_SuccessOrFail {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요>");
		int score = in.nextInt();
		if (score >= 60) {
			System.out.println("합격입니다");
		}else {
			System.out.println("불합격입니다");
		}
	}
}
