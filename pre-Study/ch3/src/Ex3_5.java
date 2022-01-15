
public class Ex3_5 {

	public static void main(String[] args) {
		double d = 85.4;
		int score = (int) d;
		System.out.println(score);
		//실수형인 double을 int로 형변환하면 소수점은 버린다 그래서 85가 나옴

        float x = 14.456f;
		int e = (int)x;
		System.out.println(e);
		// float에서 int로 변환할 때 반올림 안함
		
		int a = 65;
		char B = (char)65;
		System.out.println(B);
		// 정수형인 65를 문자형으로 변환하면 A가 나옴
		
		char i = 'D';
		int c = (int)'D';
		System.out.println(c);
		// 문자형인 D를 정수형으로 변환하면 68이 나옴
		
		char z = '1';
		int y = (int)'1';
		System.out.println(y);
		//문자형인 1을 int로 변환하면 유니코드 49가 나옴


	}

}
