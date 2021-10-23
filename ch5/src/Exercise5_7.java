
public class Exercise5_7 {

	public static void main(String[] args) {
		// 합계와 평균 점수를 출력하는 코드
		
		int[] score = {90, 80, 60, 100};
		int totalScore = 0;
		double avgScore = 0;
		
		for(int i = 0; i <score.length; i++) {
			totalScore += score[i];
		}
			avgScore = totalScore / (float)score.length;
		System.out.println("합계 점수 : " + totalScore);
		System.out.println("평균 점수 : " + avgScore);
	}

}
