package Review211026;

public class Ex02_UsingArray {
	public static void main(String[] args) {
//		변수 선언과 초기화
		int sum = 0;
		float average = 0f;
		int score[] = {100, 88, 90, 30, 50};
//		배열의 첫번째 값으로 초기화 해준다
		int max = score[0];
		int min = score[0];
		
		for(int i = 0; i<score.length; i++) {
			sum += score[i];
		}
		average = sum / (float)score.length;
		
		for(int i= 1; i<score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}else if(score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + average);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}
