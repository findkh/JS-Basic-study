package Review211026;
import java.util.Scanner;
public class Ex05_MaxOfArray {
	public static void main(String[] args) {
//		양수 5개를 입력 받아 배열에 저장하고, 제일 큰 수를 화면에 출력하는 코드를 작성
		Scanner in = new Scanner(System.in);
		System.out.println("숫자 다섯개를 입력해주세요");
		int Array[] = new int[5];
		int max = 0;
		
		for(int i=0; i<Array.length; i++) {
			Array[i] = in.nextInt();
			if(Array[i] > max) {
				max = Array[i];
			}
		}
		in.close();
		System.out.println("제일 큰 수는? " + max);
	}
}
