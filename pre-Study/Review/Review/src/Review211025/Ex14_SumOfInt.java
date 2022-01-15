package Review211025;

public class Ex14_SumOfInt {

	public static void main(String[] args) {
//		int 타입의 변수 num이 있을때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라
//		문자열로 변환하지 말고 숫자로만 처리해야 한다
		int num = 12345;
		int sum = 0;
		
		while(num>0) {
			sum += num%10;
			num /= 10;
		}
		System.out.println(sum);
	}

}
