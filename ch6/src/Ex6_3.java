
public class Ex6_3 {
	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height); // 클래스 변수로 객체 선언 없이 생성 가능
		
		Card c1 =  new Card(); //c1, c2는 인스턴스 변수
		c1.kind = "Space";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Space";
		c2.number = 4;
		
		System.out.println("c1은" +  c1.kind + ", " + c1.number +" 이며, 크기는(" + c1.width+ ", "+ c1.height + ")");
		System.out.println("c1은" +  c2.kind + ", " + c2.number +" 이며, 크기는(" + c2.width+ ", "+ c2.height + ")");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다");
		
		Card.width = 50;
		Card.height = 80; // 클래스 변수 속성 변경
		
		System.out.println("c1은" +  c1.kind + ", " + c1.number +" 이며, 크기는(" + c1.width+ ", "+ c1.height + ")");
		System.out.println("c1은" +  c2.kind + ", " + c2.number +" 이며, 크기는(" + c2.width+ ", "+ c2.height + ")");		
	}
}

class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}
