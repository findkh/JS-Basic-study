package Review211103;
interface I2{
	public String A();
}

interface I3{
	public String B();
}

class D implements I2, I3{
	public String A() { //I2에서 강제하고 있는 것을 구현
		return "A";
	}
	public String B() { //I3에서 가엦하고 있는 것을 구현
		return "B";
	}
}

public class Ex09_PolymorphismDemo4 {
	public static void main(String[] args) {
		D obj = new D();
//		D라는 클래스를 obj라는 변수로 인스턴스화 시키고 데이터 타입은 D 클래스와 데이터 타입 동일
		I2 objI2 = new D();
//		D라는 클래스를 objI2라는 변수로 인스턴스화 시키고 데이터 타입은 I2
		I3 objI3 = new D();
//		D라는 클래스를 objI3이라는 변수로 인스턴스화 시키고 데이터 타입은 I3
		
		obj.A();
		obj.B();
//		데이터 타입이 D이기 때문에 클래스 D가 정의하고 있는 모든 멤버를 사용할 수 있다
		
		objI2.A();
//		objI2.B();
//		objI2는 데이터 타입이 I2이기 때문에 I2에서 정의한 A메서드만 사용 가능하다
		
//		objI3.A();
		objI3.B();
//		objI3은 데이터 타입이 I3이기 때문에 I3에서 정의한 B메서드만 사용 가능하다
	}
}
