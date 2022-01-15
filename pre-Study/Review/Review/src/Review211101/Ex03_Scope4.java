package Review211101;

public class Ex03_Scope4 {
	static int i = 5;
//	전역변수 i를 5로 초기화
	
	static void a() {
		int i = 10;
//		지역변수 i를 10으로 초기화
		b();
	}
	
	static void b() {
		System.out.println(i);
//		전역변수 i=5 가 출력됨
//		정적인 유효범위(Static scope, Lexical Scope)
//		자기 자신이거나 전역변수 둘중 하나에만 접근할 수 있다.
	}
	
	public static void main(String[] args) {
		a();
//		출력값 : 5
	}
}
