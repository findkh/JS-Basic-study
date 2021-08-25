import java.util.Scanner;

public class Exercise3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("100단위 숫자를 입력하시오");
	
	String input = scanner.nextLine();
	int num = Integer.parseInt(input); //입력받은 문자열을 숫자로 변환
	
	System.out.println("100의 자리 이하를 버리면" + num/100*100 + "입니다.");

	}

}
