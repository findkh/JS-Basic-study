package Review211028;
public class Ex01_CreationOfObject {
	public static void main(String[] args) {
//		같은 클래스로부터 생성되었을지라도 각 인스턴스의 속성(멤버변수)은 서로 다른값을 유지 할 수 있으며,
//		메서드의  내용은 모든 인스턴스에 대해 동일하다
		Tv t1 = new Tv();
		Tv t2 = new Tv();
//		Tv클래스의 인스턴스 t1과 t2 생성
		System.out.println("t1의 channel값은 " + t1.channel + " 입니다");
		System.out.println("t2의 channel값은 " + t2.channel + " 입니다");
		
		t1.channel = 7;
//		t1의 channel 값만 변경
		System.out.println("t1의 channel값을 7로 변경하였습니다");
		
		System.out.println("t1의 channel값은 " + t1.channel + " 입니다");
		System.out.println("t2의 channel값은 " + t2.channel + " 입니다");
	}
}
