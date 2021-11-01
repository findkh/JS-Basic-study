package Review211101;
public class Ex00_Scope {
	static void a() {
		int i = 0;
//		지역변수 i는 a 매서드 안에서만 유효한 지역변수이다.		
	}
	
	public static void main(String[] args) {
		for (int i=0; i<5; i++) {
			a();
			System.out.println(i);
		}

	}

}
