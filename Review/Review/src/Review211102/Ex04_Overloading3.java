package Review211102;
//오버로딩과 오버라이딩의 차이
public class Ex04_Overloading3 extends Ex03_Overloading2 {
//	Ex03_Overloading2를 상속 받은 Ex04_Overloading3
	void A(String arg1, String arg2) {
//	부모의 메서드에 없는 형식이 없기 때문에 메서드 오버로딩
//	같은 이름 다른 메서드
		System.out.println("sub class : void A (String arg1, String arg2)");
		}
	void A() {System.out.println("sub class : void A()");}		
//	인자가 없는 메서드는 부모의 메서드에 있음 메서드 오버라이딩에 해당
//	부모 클래스에 있는 메서드를 자식 클래스에서 정의해서 부모클래스의 메서드를 상속 받지 않고 자식 클래스에서
//	새롭게 변경하고자 할 때 사용 
	public static void main(String[] args) {
		Ex04_Overloading3 od = new Ex04_Overloading3();
		od.A();
		od.A(1);
		od.A("coding everyday");
		od.A("coding everyday", "conding everyday");
	}
}
