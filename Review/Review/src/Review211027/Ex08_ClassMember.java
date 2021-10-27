package Review211027;
//	1. 인스턴스 메서드는 클래스 멤버에 접근 할 수 있다.
//	2. 클래스 메서드는 인스턴스 멤버에 접근 할 수 없다.
//	클래스는 언제나 메서드보다 먼저 구현됨
//	클래스를 기반으로 만들어진 인스턴스들에 접근하려고 하면 안되기 때문에...
//	인스턴스 변수 = Non-Static Field
//	클래스변수 = Static Field

class C1{
	static int static_variable = 1;
//	클래스 변수 = static변수
	int instance_variable = 2;
//	인스턴스 변수
	
	static void static_static() {
		System.out.println(static_variable);
	}
//	클래스 메서드가 클래스 변수에 접근
	
	static void static_instance() {
//		클래스 메서드에서는 인스턴스 변수에 접근할 수 없다
//		System.out.println(instance_variable);
	}
//	클래스 메서드에서 인스턴스 변수에 접근
	
	void instance_Static() {
		System.out.println(static_variable);
	}
	
	void instance_instance() {
		System.out.println(instance_variable);
	}
}

public class Ex08_ClassMember {
	public static void main(String[] args) {
//		c라는 인스턴스 생성
		C1 c = new C1();

		c.static_static();

//		c.static_instance();

		c.instance_Static();

		c.instance_instance();
	
		C1.static_static();

//		C1.static_instance();

//		C1.instance_static();

//		C1.instance_instance();
	}
}
