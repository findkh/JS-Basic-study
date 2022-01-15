package Review211027;
public class Ex01_Exercise2 {
	public static void main(String[] args) {
//		1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 코드
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		for(int i=0; i<ballArr.length; i++) {
			int j = (int)(Math.random()*ballArr.length);
			int tmp = 0;
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}
//		i는 ballArr의 길이만큼 돌면서 j에 랜덤 숫자를 넣어줌
//		j는 ballArr의 배열의 번지(?)처럼 사용함
			System.arraycopy(ballArr,0,ball3,0,3);
//		arraycopy는(배열이름,배열주소,복사할배열이름,복사할배열의번지,복사할갯수)
			for(int i=0; i<ball3.length;i++) {
				System.out.print(ball3[i]);
			}
	}
}
