package Review211102;
class Calculator{
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public int avg() { //return 타입을 void에서 int로 바꿔줌
		return ((this.left + this.right)/2);
	}
}

class SubstractionableCalculator extends Calculator{
//	부모한테 상속받은 sum을 재정의(overriding)하고 있는 것
//	부모의 return타입과 자식의 return타입이 일치해야 한다
//	메서드 이름, 매개 변수의 숫자, 매개변수의 데이터타입, 순서도 같아야 한다.
	public void sum() { 
		System.out.println("실행결과는" + (this.left+this.right)+"입니다");
	}
	
	public int avg() {
		return super.avg();
//		super는 현재 클래스의 부모 클래스를 의미함
//		.avg();는 부모 클래스에 저장된 avg() 메서드를 호출함
	}
	
	public void substract() {
		System.out.println(this.left-this.right);
	}
}

public class Ex01_Overriding2 {
	public static void main(String[] args) {
		SubstractionableCalculator c1 = new SubstractionableCalculator();
		c1.setOprands(10, 20);
		c1.substract();
		System.out.println("실행결과는 " + c1.avg());
	}
}
