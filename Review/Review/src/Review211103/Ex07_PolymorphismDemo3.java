package Review211103;
class A{
	public String x() {return "A.x";}
}

class B extends A{
	public String x() {return "B.x";}
//	오버라이딩 함
	public String y() {return "y";}
}

class B2 extends A{
	public String x() {return"B2.x";}
}

public class Ex07_PolymorphismDemo3 {
	public static void main(String[] args) {
//		데이터 타입이 A(부모클래스)이지만 자식클래스에서 부모클래스의 메서드를 오버라이딩 했다면
//		자식 클래스의 오버라이딩한 메서드가 실행된다
//		부모클래스에서 정의하지 않은 메서드를 호출하면 존재하지 않는 메서드로 호출되지 않는다.	
		A obj = new B();
		A obj2 = new B2();
		System.out.println(obj.x());
//		원래 클래스 B의 메서드를 호출함
		System.out.println(obj2.x());
//		원래 클래스 B2의 메서드를 호출함
	}
}

