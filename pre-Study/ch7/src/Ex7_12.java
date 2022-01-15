public class Ex7_12 {
	class InstanceInner{ //인스턴스 내부클래스
		int iv = 100;
//		static int cv = 100; static 변수를 선언할 수 없다
		final static int CONST = 100;
	}
	
	static class StaticInner{ //static 내부클래스
		int iv  = 200;
		static int cv = 200; //static 클래스만 static멤버를 정의할 수 있다
	} //static 내부 클래스에서는 외부 클래스의 인스턴스 멤버에 접근할 수 없다
	
	void myMethod() {
		class LocalInner{//지역 내부 클래스
			int iv = 300;
//			static int cv = 300; static변수 사용할 수 없다
			final static int CONST = 300;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}
}
