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
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

class SubstractionableCalculator extends Calculator{
//	부모한테 상속받은 sum을 재정의(overriding)하고 있는 것
	public void sum() { 
		System.out.println("실행결과는" + (this.left+this.right)+"입니다");
	}
	
	public void substract() {
		System.out.println(this.left-this.right);
	}
}

public class Ex00_Overriding {
	public static void main(String[] args) {
		SubstractionableCalculator c1 = new SubstractionableCalculator();
		c1.setOprands(10, 20);
		c1.sum();
//		부모와 자식이 모두 sum을 가지고 있으니 자식 클래스의 메서드가 실행된다.
		c1.avg();
		c1.substract();
	}
}
