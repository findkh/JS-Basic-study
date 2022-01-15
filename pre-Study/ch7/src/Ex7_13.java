
public class Ex7_13 {
	class InstanceInner{}
	static class StaticInner{}
	
	//인스턴스멤버 간에는 서로 직접 접근이 가능하다.
	InstanceInner iv = new InstanceInner();
	//static 멤버간에는 서로 직접 접근이 가능하다
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
//		InstanceInner obj1 = new InstanceInner(); 오류
//		static 멤버는 인스턴스멤버에 접근할 수없다
		StaticInner obj2 = new StaticInner();
	}
	
	void instanceMethod() {
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
//		LocalInner lv = new LocalInner();
//		메서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근할 수 없다
	}
	
	void myMethod() {
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}
}
