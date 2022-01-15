package Review211026;

public class Ex09_2DArray {
	public static void main(String[] args) {
//		2차원 배열의 선언은 1차원 배열과 같고 대괄호 하나만 더 추가 해주면 된다
//		2차원 배열은 주로 테이블 형태의 데이터를 담는데 사용한다

		int score[][] = {
							{100, 100, 80},
							{80, 60, 75},
							{90, 30, 50},
							{40, 100, 60}
		};
		int sum = 0;
		
		for(int i = 0; i<score.length; i++) {
			for(int j = 0; j<score[i].length; j++) {
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
				sum += score[i][j];
			}
		}
		System.out.println("합계 : "+sum);
	}

}
