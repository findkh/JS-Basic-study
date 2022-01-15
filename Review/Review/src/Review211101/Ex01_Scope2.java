package Review211101;

public class Ex01_Scope2 {
	static int i;
//	클래스 직속 변수 : 전역변수(GV)
//	전역변수는 {} 안에서 모두 사용 가능하다.
	static void a() {
		i=0;
//		전역변수 i를 사용
	}
	
	public static void main(String[] args) {
		for(i=0; i<5; i++) {
//			i에 대한 선언은 전역변수를 사용함
			a();
			System.out.println(i);
		}
//		무한 반복 일어남
	}
}
