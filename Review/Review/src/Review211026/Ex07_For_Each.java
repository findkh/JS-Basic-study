package Review211026;

public class Ex07_For_Each {
	public static void main(String[] args) {
//		for-each문
//		배열이나 나열의 각 원소를 순차적으로 접근하는데 유용한  for문이다
		int num[] = {1,2,3,4,5};
		int sum = 0;
		for (int k : num) {
//			반볼 될 때마다 k는 num[0], num[1], ... , num[4] 값으로 설정 
			sum += k;
		}
		System.out.println(sum);
//		출력값 : 15
		
		String names[] = {"사과", "배", "바나나", "딸기", "오렌지"};
		for (String s : names)
			System.out.print(s + " ");
		}
//		출력값 : 사과 배 바나나 딸기 오렌지 
}
