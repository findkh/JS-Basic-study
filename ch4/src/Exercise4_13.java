
public class Exercise4_13 {

	public static void main(String[] args) {
		// 두 개의 주사위의 두 눈의 합이 6이 되는 모든 경우의 수를 출력
		
		for (int x=1; x<=6; x++) {
			for(int y=1; y<=6; y++) {
				//코드작성
				if(x+y==6) {
					System.out.println("(" + x + ")" + "(" + y + ")");
				}					
			}
		}
	}
}
