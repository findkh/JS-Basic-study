
public class Exercise4_12 {

	public static void main(String[] args) {
		// 1부터 100까지의 수 중 짝수와 홀수의 합을 각각 구하시오
		
		int evenSum = 0;
		int oddSum = 0;
		
		for (int i =1; i <=100; i++) {
			//코드작성
			if(i%2==0) {
				evenSum += i;
			}else {
				oddSum += i;
			}
		}
		
		System.out.println("짝수의 합계는"+evenSum);
		System.out.println("홀수의 합계는"+oddSum);

	}

}
