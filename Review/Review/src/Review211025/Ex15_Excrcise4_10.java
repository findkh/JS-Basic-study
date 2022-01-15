package Review211025;

public class Ex15_Excrcise4_10 {
	public static void main(String[] args) {
//		숫자 맞히기 게임
		int anwer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요");
			input = s.nextInt();
			
			if(anwer>input) {
				System.out.println("더 큰 수를 입력하세요");
			}else if(anwer<input) {
				System.out.println("더 작은 수를 입력하세요");
			}else{
				System.out.println("맞혔습니다");
				System.out.printf("시도횟수는 %d입니다%n",count);
				break;
			}
			
		}while(true);
		s.close();
	}
}
