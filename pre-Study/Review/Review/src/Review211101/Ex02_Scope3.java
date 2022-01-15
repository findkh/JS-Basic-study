package Review211101;

public class Ex02_Scope3 {
	static void a() {
		String title = "coding everybody";
//		a메서드의 title은 a 메서드 안에서만 실행 가능하다.
	}
	
	public static void main(String[] args) {
		a();
//		System.out.println(title); -> 오류 발생
	}
}
