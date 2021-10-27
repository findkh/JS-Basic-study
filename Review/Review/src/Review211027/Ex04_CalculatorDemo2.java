package Review211027;
//클래스는 설계도다
//객체는 독립된 프로그램으로 변수도 있고 메서드도 있다
//클래스는 연관되어 있는 변수와 메서드의 집합이다.

class Calculator{
//	Calculator라는 객체의 설계도를 알려주겠다
	int left, right;
//	int타입의 left와 right 변수 선언
	
//	c1.setOprands의 10, 20이 매개변수에 10과 20을 넘겨줌
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
//		this는 클래스를 통해서 만들어진 인스턴스 자신을 가르킨다.
//		this.left와 left의 차이
//		this.가 붙은 것은 우리가 생성한 c1에 담겨 있는 calculator의 값을 가리킴
//		left라는 것은 매개변수를 의미함 지역변수 같음
//		this.left는 위에 int left에 담기게 됨
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
//		위에 int에 담긴 값들을 가져와서 계산함.
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

public class Ex04_CalculatorDemo2 {
	public static void main(String[] args) {
//		계산기 만들기
//		left와 right값을 가지고 sum과 avg를 실행

		Calculator c1 = new Calculator();
//		new Calculator는 클래스 Calculator를 구체적인 제품으로 만드는 명령
//		이렇게 만들어진 구체적인 제품을 인스턴스라고 부른다.
//		new을 이용해 만든 인스턴스를 변수  c1이라는 변수에 담음
//		Calculator c1 
//		사용자 정의 데이터 타입을 만드는 것과 같은 의미
//		c1앞에 calculator는 데이터 타입이다
		
//		클래스를 인스턴스화 할 때는 변수에 담아야 한다
//		이 때 사용하는 변수의 데이터 타입은 그 클래스가 된다.

		
//		2개의 인스턴스를 만듦(c1, c2)
		
		c1.setOprands(10, 20);
//		setOprands 메서드 : 연산의 대상이 될 값을 의미함
		c1.sum();
		c1.avg();

//		재활용		
		Calculator c2 = new Calculator();
		c2.setOprands(20, 40);
		c2.sum();
		c2.avg();
	}
}
