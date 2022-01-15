package Review211026;
import java.util.Scanner;
public class Ex06_AverageOfArray {
	public static void main(String[] args) {
//		배열의 길이 필드를 이용하여 배열 크기만큼 키보드에서 정수를 입력 받고 평균을 구하는 코드 작성
		Scanner in = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int Array[] = new int[5];
		int sum = 0;
		float avg = 0;
		
		for(int i=0; i<Array.length; i++) {
			Array[i] = in.nextInt();			
		}
//		배열의 길이만큼 숫자를 입력 받는다
		
		for(int i=0; i<Array.length; i++) {
			sum += Array[i];
		}
		avg = sum/Array.length;
		in.close();
		System.out.println("평균 : " + avg);
	}
}
