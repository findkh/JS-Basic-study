
public class Ex4_5_1 {

	public static void main(String[] args) {
		int lotto = 0;
		int i, z;
		int num;
		
	
		 for(i = 1; i <= 6; i++) {
			lotto = (int)(Math.random() * 49) + 1;
				System.out.printf(i+"번째"+" "+"행운의 숫자는?%d\n" , lotto);
			}
		 for(i = 1; i <= 1; i++) {
				z = (int)(Math.random() * 49) + 1;
					System.out.printf("보너스 번호는?%d\n"+ " " , z);
				}
		
	}

}
