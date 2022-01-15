
public class Exercise3_9 {

	public static void main(String[] args) {
		// 정수 타입 변수에서 십의 자리 이하를 버리는 코드
		int number = 1234;
		int result =number-number%100;
		System.out.println(result);
	}

}
