
public class Exercise5_4 {

	public static void main(String[] args) {
		// 2차원 배열 arr에 담긴 모든값의 총합과 평균을 구하는 프로그램 
		
		int[][] arr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30},
			};
		
		int total = 0;
		float average = 0;
		
		//코드작성
		
//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				//System.out.printf("[%d][%d] = %d%n", i, j, arr[i][j]);
				
				total += arr[i][j];
				
			}
			
		}
		average = total /(float)(arr.length*arr[0].length);
		System.out.println("total=" + total);
		System.out.println("average=" + average);

	}

}
