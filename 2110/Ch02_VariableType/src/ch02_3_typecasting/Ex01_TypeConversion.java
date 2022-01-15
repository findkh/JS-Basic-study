package ch02_3_typecasting;

public class Ex01_TypeConversion {
	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		System.out.println(b+i);
		//byte가 int로 형변환
		System.out.println(10/4);
		//int는 정수형이므로 소숫점 잘림
		System.out.println(10.0/4);
		//실수/정수는 실수의 범위가 더 넓어 실수로 표현됨
		System.out.println((float)10/4);
		// 위와 같음
		System.out.println((char)0x12340041);
		//0x는 16진수고, char형으로 캐스팅됨. 해당 데이터의 하위 2바이트만 읽을 수 있음
		//16진수 41은 10진수로 65는 아스키코드 A에 해당함
		System.out.println((char)0x12340061);
		//위와 같은 이유로 61은 아스키코드 a 해당
		System.out.println((byte)(b+i));
		//byte로 형변환 하여 손실된 값이 나옴
		System.out.println((int)2.9+1.8);
		//정수2+실수1.8 = 3.8
		System.out.println((int)(2.9+1.8));
		//4.7을 int형으로 변환 
		System.out.println((int)2.9+(int)1.8);
		//2+3 int형으로 바꾼 다음 덧셈
		System.out.println(3 + "4");
		//int+String = String으로 34
		System.out.println(3+'4');
		//int 3 + char 4 는 (52) int로 형변환 됨
	}
}
