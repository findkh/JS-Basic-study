package Review211103;
abstract class A{
//	멤버중에 하나라도 abstract라면 클래스는 abstract가 되어야 함
	
	public abstract int b();
//	추상 메서드 b() 구체적인 로직을 담는 본체는 오버라이딩해서 사용하는 쪽에서 정의 해야함
	
//	public abstract int c() {System.out.println("Hello");}
//	abstract을 형식을 가진 c()는 구체적인 로직을 가지고 있을 수 없다
	
	public void d() {
		System.out.println("world");
	}
//	추상 클래스 내에는 추상 메서드가 아닌 메서드가 존재할 수 있다.
}

class B extends A{
	public int b() {
		return 1;
//		오버라이딩 해야함
	}
}

public class Ex00_AbstractDemo {
	public static void main(String[] args) {
//		A obj = new A();
		B obj = new B();
		System.out.println(obj.b());
	}
}
