
public class Exercise4_11 {

	public static void main(String[] args) {
		// 1~100까지 정수 중 5의 배수 합계를 출력 for문사용할 것
		
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%5==0) {
				sum += i;
			 }
		}
		
		System.out.println("5의 배수의 합계는" + sum);

	}

}
