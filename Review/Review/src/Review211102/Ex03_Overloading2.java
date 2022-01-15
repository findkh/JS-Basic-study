package Review211102;

public class Ex03_Overloading2 {
//	메서드 A를 4개를 정의함
	void A () {System.out.println("void A()");}
	void A(int arg1) {System.out.println("void A(int arg1)");}
//	void A(int param1) {System.out.println("void A(int arg1)");}
//	매개변수의 이름을 다르게 해도 오류가 발생. 
	void A(String arg1) {System.out.println("void A(String arg1)");}
//	int A() {System.out.println("Void A()");}
//	처음 정의한 메서드와 같지만 return값이 void와 int로 다르다
	
	public static void main(String[] args) {
		Ex03_Overloading2 od = new Ex03_Overloading2();
		od.A();
//		반환 값은 메서드를 사용하는 단계에서 알려주는 정보가 아니라
//		메서드를 사용한 결과이기 때문에 애매함이 발생
		od.A(1);
		od.A("coding everbody");		
	}
}
