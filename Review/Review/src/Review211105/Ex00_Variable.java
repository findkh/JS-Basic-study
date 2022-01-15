package Review211105;
class Card{
//	인스턴스 변수 kind, number 선언
//	인스턴스 변수는 자신만의 저장 공간을 가지고 있다
	String kind;
	int number;
//	클래스 변수 width, height 선언
//	모든 인스트턴스가 공통된 저장공간(변수)을 공유한다
//	모든 인스턴스들이 공통적인 값을 유지해야 하는 경우 사용한다
	static int width = 100;
	static int height = 250;
}

public class Ex00_Variable {
	public static void main(String[] args) {
		System.out.println("Card.width = "+Card.width);
		System.out.println("Card.height = "+Card.height);

		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 6;
		
		System.out.printf("c1은 종류는 %s c1의 번호는 %d, 카드 규격은 [%d*%d] 입니다.%n", c1.kind, c1.number, c1.width, c1.height);
		System.out.printf("c2은 종류는 %s c2의 번호는 %d, 카드 규격은 [%d*%d] 입니다.%n%n", c2.kind, c2.number, c2.width, c2.height);
		
		System.out.println("c1의 카드 규격을 [200*450]으로 변경합니다");
		System.out.println();
		c1.width = 200;
		c1.height = 450;
//		width와 height는 클래스 변수기 때문에 값을 변경하면 c2도 같이 변경된다
		
		System.out.printf("c1은 종류는 %s c1의 번호는 %d, 카드 규격은 [%d*%d] 입니다.%n", c1.kind, c1.number, c1.width, c1.height);
		System.out.printf("c2은 종류는 %s c2의 번호는 %d, 카드 규격은 [%d*%d] 입니다.%n", c2.kind, c2.number, c2.width, c2.height);
	}
}
