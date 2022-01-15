
public class Exercise5_5 {

	public static void main(String[] args) {
		// 1~9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 코드
		
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		
		for(int i =0; i< ballArr.length; i++) {
			int j = (int)(Math.random()*ballArr.length);
			int tmp = 0;
			//코드 입력
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}
			//코드 입력
			System.arraycopy(ballArr, 0, ball3, 0, 3);
		
		for(int i=0; i<ball3.length; i++) {
			System.out.print(ball3[i]);
		}

	}

}
