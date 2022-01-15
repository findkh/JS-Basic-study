import java.util.*;

public class Ex4_6 {

	public static void main(String[] args) {
		int num = 0, sum = 0;
		System.out.print("숫자를 입력하세요>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp =  scanner.nextLine();
		num = Integer.parseInt(tmp); //입력 받은 문자열(tmp)을 숫자로 변환
		
		while(num!=0) {
			sum += num%10;
			System.out.printf("sum=%3d num=%d%n", sum, num);
			//%3d는 스페이스바 3번 누른것과 같음
			num /= 10;
		}
			System.out.println("각 자리수의 합:" + sum);
	}
}
