package Review211026;
import java.util.Arrays;
public class Ex03_ShuffleTheArray {
	public static void main(String[] args) {
//		길이가 10인 배열을 생성하고 0~9까지 숫자를 초기화 하여 출력
//		random()을 이용해서 배열의 임의의 위치에 있는 값과 배열의 첫번째 요소의 값을 교환하는 일을 해서 섞이게 한다
		int numArr[] = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		for(int i=0; i<10; i++) {
			int n = (int)(Math.random() * 10); 
//			변수 n에 0~9까지 랜덤으로 한숫자가 뽑혀 나옴
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
//			tmp에 numArr[0]값을 넣어놓고 
//			numArr[0]에는  numArr[랜덤으로 뽑은 숫자]를 넣고 
//			tmp에 빼놓은 numArr[0]을 numArr[n]에 넣는다
		}
		System.out.println(Arrays.toString(numArr));
	}
}
