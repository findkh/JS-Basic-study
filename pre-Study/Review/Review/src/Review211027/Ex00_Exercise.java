package Review211027;
public class Ex00_Exercise {
	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
			System.out.println("arr합계 : "+sum);
//		-----------------------------------
		int arr2 [][] = {
							{5, 5, 5, 5, 5},
							{10, 10, 10, 10, 10},
							{20, 20, 20, 20, 20},
							{30, 30, 30, 30, 30}
		};
		int total = 0;
		float average = 0;
						
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
					total += arr2[i][j];
			}
		}
		average = total / (float)(arr2.length * arr2[0].length);
		System.out.println("total= " + total);
		System.out.println("average= " + average);
	}

}
