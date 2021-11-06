package Review211105;
//기본형 매개변수 : 변수의 값을 읽기만 할 수 있다
//참조형 매개변수 : 변수의 값을 읽고 변경할 수 있다
class Data { int x; }
public class Ex00_211106 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x=10;
		System.out.println("main() x = " + d.x);
		
		change(d.x); //d.x가 change 메서드의 매개변수 x에 복사됨
		System.out.println("After change(d.x)");
		System.out.println("main() x = " + d.x);
	}
	
	static void change(int x) { //기본형 매개변수
		x=1000; //x의 값을 1000으로 변경
		System.out.println("change() : x = " + x);
//		d.x의 값이 변경된 것이 아니라, change 메서드의 매개변수 x의 값이 변경된 것이다.
//		즉 원본이 아닌 복사본이 변경된 것이라 원본에는 아무런 영향을 미치지 못한다.
	}

}
