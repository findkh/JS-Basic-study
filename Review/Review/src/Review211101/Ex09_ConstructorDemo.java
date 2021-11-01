package Review211101;

//public class Ex09_ConstructorDemo {
//	public static void main(String[] args) {
//		Ex09_ConstructorDemo c = new Ex09_ConstructorDemo();
////		생성자가 존재 하지 않는 상태 -> 자바가 기본 생성자를 만들어줌(이름이 같으면서 매개변수가 없는 생성자)
//	}
//}


public class Ex09_ConstructorDemo {
	public Ex09_ConstructorDemo(){} //기본생성자
	public Ex09_ConstructorDemo(int param1) {}
//	매개변수가 있는 생성자가 있을 때는 자동으로 기본 생성자를 만들어주지 않는다.
//	이문제를 해결하기 위해서는 기본 생성자를 추가해줘야 한다.
	public static void main(String[] args) {
		Ex09_ConstructorDemo c = new Ex09_ConstructorDemo();
//		
	}
}