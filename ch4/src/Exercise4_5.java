
public class Exercise4_5 {

	public static void main(String[] args) {
//		for 문을 while문으로 변경하시오
//		for(int i = 0; i <=5; i++) {
//			for (int j = 0; j <= i; j++)
//				System.out.print("*");
//			System.out.println();
//		}
		
		int i = 1;
		int j = 1;
		
		while(i<6) {
			i++;
			while(j<i) {
				System.out.print("*");
				j++;
				
			}//내부반복
			j=1;
			System.out.println();
		}//외부반복
		
			
		}
			
		}


	


