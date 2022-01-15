package Review211026;
public class Ex10_SalesRevenue {
	public static void main(String[] args) {
//		한 회사의 지난 3년간 분기별 매출의 총액과 연평균 매출을 구하는 코드 작성
		int Array[][]= {
				{90, 90, 110, 110},
				{120, 110, 100, 110},
				{120, 140, 130, 150}
		};
		int sum = 0;
		
		for(int i=0; i<Array.length; i++) {
			for(int j=0; j<Array[i].length; j++) {
				sum += Array[i][j];
			}
		}
		System.out.println("매출 합계 : " + sum);
		System.out.println("매출 평균 : " + (float)sum/Array.length);
	}
}
