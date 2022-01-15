package Review211025;

public class Ex11_FortoWhile {

	public static void main(String[] args) {
//		다음 for문을 while문으로 변경해라
//		for(int i = 0; i <=10 ; i++) {
//			for (int j = 0; j <= i; j++)
//				System.out.print("*");
//			System.out.println();
//			}
		int i = 0;
		while(i <= 10) {
			int j = 0;
			while(j<=i) {
				System.out.print("*");	
				j++;
			}
			i++;
			System.out.println();
			
		}
	}
}

