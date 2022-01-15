package Review211103;
class O{
	public void a(int param) {
		System.out.println("숫자 출력");
		System.out.println(param);
	}
	public void a(String param) {
		System.out.println("문자 출력");
		System.out.println(param);
	}
}
public class Ex04_PolymorphismOverLoadingDemo {
	public static void main(String[] args) {
		O o = new O();
		o.a(1);
		o.a("one");
	}
//	클래스 O의 메소드 a는 두개의 본체를 가지고 있고,
//	이름은 같지만 서로 다른 동작방법을 가지고 있기 때문에 오버로딩은 다형성의 예로 볼 수 있다
}
