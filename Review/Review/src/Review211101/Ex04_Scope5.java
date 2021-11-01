package Review211101;
class C{
		int v = 10;
//		전역변수 v는 10으로 초기화 되어 있다
		
		void m() {
			int v = 20;
			System.out.println(v); //지역변수 v 사용 출력값: 20 
			System.out.println(this.v); //전역변수 v 사용 출력값 : 10
//			전역변수와 지역변수가 경합할 경우 지역변수가 더 우선순위가 높다. 
		}
	}

public class Ex04_Scope5 {	
	public static void main(String[] args) {
		C c1 = new C();
		c1.m();
//		출력값: 20 
	}
}
