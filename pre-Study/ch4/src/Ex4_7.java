import java.util.*;

public class Ex4_7 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1;
		System.out.println(answer);
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1과 100사이의 정수를 입력하세요>");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 값을 입력하세요");
			}else if(input < answer) {
				System.out.println("더 큰 값을 입력하세요");
			}			
		 } while(input!=answer);
			
			System.out.println("정답입니다");
		}
}
