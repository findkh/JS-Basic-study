package Review211026;
import java.util.Arrays;
public class Ex00_Array {
	public static void main(String[] args) {
//		배열이란 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
//		배열의 선언
//		타입[] 변수이름 = new 타입[길이];
		
//		배열 선언
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = {100, 95, 80, 70, 60};
//		저장할 값들을 괄호 안에 넣어서 나열하면 값의 개수에 의해 배열의 길이가 자동으로 결정되기 때문에 길이는 안적어도 된다
//		-------------------------------------------------------
		for (int i=0; i<iArr1.length; i++ ) {
			iArr1[i] = i+1;
		}
//		i는 0부터 시작해서 iArr1의 길이만큼 반복한다. 
//		System.out.println(iArr1 + ",");
//		타입@주소의 형식으로 출력된다 배열이 가리키는 참조변수를 출력하는 것. [I@15db9742
		for(int i=0; i<iArr1.length; i++) {
			System.out.print(iArr1[i]+",");
		}
		System.out.println();
//		for문을 돌려서 값을 하나씩 출력함
//		출력 값: 1,2,3,4,5,6,7,8,9,10,
//		-------------------------------------------------------
//		for(int i=0; i<iArr2.length; i++) {
//			iArr2[i] = (int)(Math.random()*10)+1;
//		}
//		iArr2라는 배열에 1~10까지의 랜덤 숫자를 넣어줌(숫자가 중복됨)
		for(int i=0; i<iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10)+1;
			for(int j=0;j<i;j++) {
				if(iArr2[i]==iArr2[j]) {
					i--;
				}
			}
		}
//		숫자가 중복되지 않게 i와 j값을 비교하여 i에 1을 뺴주어 다시 랜덤을 돌리게 한다
//		다른 값이 나올 때까지 랜덤이 돌아가게 됨
		System.out.println(Arrays.toString(iArr2));
//		for문 돌려서 출력하는 것보다 쉬운 방법은 Arrays.toString(배열이름)메서드를 사용하는 것
//		Arrays.toString을 사용하려면 import문이 필요하다
//		ctrl+shift+o 눌러서 import java.util.Arrays; 삽입해준다
//		-------------------------------------------------------
		System.out.println(Arrays.toString(iArr3));
		
		char[] chArr = {'a', 'b', 'c', 'd'};
		String str = String.valueOf(chArr);
		System.out.println(chArr); 
//		책에는 char배열은 println메서드로 출력하면 abcd가 출력된다는데 나는 주소 값이 나온다..
		System.out.println(Arrays.toString(chArr));
//		Arrys.toString 쓰니까 아스키코드 값이 나온다 
		System.out.println(str);
//		String.valueof 써봤는데 주소값이 나온다..
	}
}
