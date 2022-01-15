package Review211025;

public class Ex02_Continue {

	public static void main(String[] args) {
		// continue는 반복문을 빠져 나가지 않으면서 반복문 실행 도중 다음 반복을 진행한다
		// for와 continue 사용하여 1부터 100까지 짝수의 합
		
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			if(i%2 == 0) {
				sum += i;
			}else {
				continue;
			}
		}
			System.out.printf("1부터 100까지 짝수의 합은? %d%n", sum);
	}

}
