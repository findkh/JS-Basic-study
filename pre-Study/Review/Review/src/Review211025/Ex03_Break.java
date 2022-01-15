package Review211025;
import java.util.Scanner;
public class Ex03_Break {
	public static void main(String[] args) {
//		break문은 하나의 반복문만 벗어남
//		while문과 break문을 사용하여 -1이 입력될 때까지 입력된 숫자의 갯수 출력
		
		Scanner in = new Scanner(System.in);
		int num = 0;
		
		while(true) {
			if(in.nextInt() == -1)
				break;
			num++;
		}
		System.out.println("입력된 숫자 개수는?" + num);
		in.close();
	}
	
}
