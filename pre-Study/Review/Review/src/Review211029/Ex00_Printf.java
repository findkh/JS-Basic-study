package Review211029;

public class Ex00_Printf {
	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFL;
		
		int octNum = 010;
		int hexNum = 0x10;
		int binNum = 0b10;
		
		System.out.printf("b=%d%n", b); //byte b를 10진수로 출력
		System.out.printf("s=%d%n", s); //short s를 10진수로 출력
		System.out.printf("c=%c, %d %n", c, (int)c); //char c를 char형과 10진수로 변환한(65)으로 출력
		System.out.printf("finger = [%5d]%n", finger);  //finger = [   10] 출력될 값이 차지할 공간을 숫자로 지정함
		System.out.printf("finger = [%-5d]%n", finger); //finger = [10   ]
		System.out.printf("finger = [%05d]%n", finger); //finger = [00010]
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex);
		System.out.printf("octNum=%o, %d%n", octNum, octNum);
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
	}
}
