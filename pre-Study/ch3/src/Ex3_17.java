
public class Ex3_17 {

	public static void main(String[] args) {
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = x >= 0 ? x : -x; // 음수이면 양수로 만든다.
		absY = y >= 0 ? y : -y; // 음수와 음수는 양수가 되기 때문인 것 같음....(확실치 않음)
		absZ = z >= 0 ? z : -z;
		signX = x > 0 ? '+' : ( x==0 ? ' ' : '-');
		signY = y > 0 ? '+' : ( y==0 ? ' ' : '-');
		signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-');
		
		System.out.printf("x=%c%d%n", signX, absX);
		System.out.printf("Y=%c%d%n", signY, absY);
		System.out.printf("Z=%c%d%n", signZ, absZ);
		//%c는 문자 형식으로 출력된다는 뜻
		//X=문자형식 정수형식 개행 
		//X= signX가 10이 0보다 크니 참값인 + 를 나타내고 absX는 참값이 0을 나타냄
		//Y= signY가 0보다 작으니 거짓 거짓을 보면 y가 0은 아니니 - , absY 0보다 작으니 거짓 - + - =  +
		//Z = signZ가 0과 같으니 공백 absZ가 0과 같으니 참 
		//결과 값 x=+10 Y=-5 Z= 0


	}

}
