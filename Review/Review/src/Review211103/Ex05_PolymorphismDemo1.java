package Review211103;
class A{
	public String x() {return "x";}
}

class B extends A{
	public String y() {return "y";}
}

public class Ex05_PolymorphismDemo1 {
	public static void main(String[] args) {
		A obj = new B();
//		클래스 B를 인스턴스화 시킨 인스턴스를 obj라는 변수에 담았는데 obj는 A라는 데이터 타입을 가지고 있다
		obj.x(); //-> 정상 실행
//		obj.y(); 실행 안됨. 클래스 A에 y가 정의되어 있지 않기 때문에..
	}
}

