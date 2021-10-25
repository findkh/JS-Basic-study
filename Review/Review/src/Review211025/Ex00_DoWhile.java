package Review211025;

public class Ex00_DoWhile {
	public static void main(String[] args) {
		// Do while문 사용  a부터 z까지 출력
		char a = 'a';
		do{
			System.out.print(a);
			a = (char)(a+1);
			
		} while( a<='z');

	}

}
