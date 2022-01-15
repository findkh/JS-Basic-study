
public class Exercise4_9 {

	public static void main(String[] args) {
	//int타입의 변수 num이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성
	//문자열로 변환하지 말고 숫자로만 처리해야한다.
		
		int num = 12345;
		int sum = 0;
		
		for(int i =0; i<6; i++) {
			sum += num % 10;
			num /= 10;
		}
		
//		while(num > 0) {
//			sum += num % 10;
//			num /= 10;
//		}

			System.out.println("sum="+sum);
			System.out.println("num="+num);
	}
	
}
