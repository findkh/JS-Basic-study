package Review211028;
public class Ex00_CreationOfObject {
	public static void main(String[] args) {
//		Tv t = new Tv();를 풀어쓰면 밑에와 같다
		Tv t; //변수 선언 : Tv클래스 타입의 참조변수 t를 선언한다. 아직 인스턴스가 생성되지 않음
		t = new Tv(); //객체 생성 : 연산자 new에 의해 Tv클래스의 인스턴스가 메모리의 빈 공간에 생성된다. 
//						멤버변수는 각 자료형에 따라 기본값으로 초기화 된다. 
//						대입연산자(=)에 의해 생성된 객체의 주소값이 참조변수 t에 저장된다.
//						참조변수 t를 통해 Tv인스턴스에 접근 할 수 있다.
//						인스턴스를 다루기 위해서는 참조변수가 반드시 필요하다
		t.channel = 7; //참조변수 t에 저장된 주소에 있는 인스턴스의 멤버변수 channel에 7을 저장한다.
//						 인스턴스의 멤버변수(속성)을 사용하려면 '참조변수.멤버변수'
		t.channelDown(); //메서드 호출
		System.out.println("현재 채널은 " + t.channel + " 입니다");
//		출력값 : 현재 채널은 6 입니다
	}
}

class Tv{
//	Tv 클래스 = Tv의 설계도
	
//	Tv의 속성(멤버변수)
	String color;
	boolean power;	//t.channel = 7에 의해 7이 저장된다.
	int channel;
	
//	TV의 기능(메서드)
	void power() {power=!power;}
	void channelUp() { ++channel; } 
	void channelDown() { --channel; } //t.channelDown();이 호출한 메서드가 실행된다.
}

//인스턴스는 참조변수를 통해서만 다룰 수 있으며, 참조변수의 타입은 인스턴스의 타입과 일치해야 한다.