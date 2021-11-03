package Review211103;
class A{
	public String x() {return "A.x";}
}

class B extends A{
	public String x() {return "B.x";}
//	오버라이딩 함
	public String y() {return "y";}
}

public class Ex06_PolymorphismDemo2 {
	public static void main(String[] args) {
		A obj = new B();
		System.out.println(obj.x());
//		클래스 B에 속해 있는 x() 메서드가 호출됨
	}
}

