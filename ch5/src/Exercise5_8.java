
public class Exercise5_8 {

	public static void main(String[] args) {
		// 하나의 배열엔 1부터 10까지 10개의 정수가 저장되어 있다
		//각각의 값을 다른 배열의 해당 인덱스 값에 제곱값을 대입하는 코드를 완성
		
		int[] num1 = {1,2,3,4,5,6,7,8,9,10};
		int[] num2 = new int[10];
		
		for (int i=0; i<num1.length; i++) {
			num2[i] += num1[i]*num1[i];
		}
		
		for (int  i=0; i<num2.length; i++) {
			System.out.println(num2[i]);
		}

	}

}
