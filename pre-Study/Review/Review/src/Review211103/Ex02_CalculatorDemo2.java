package Review211103;
class Calculator{
	static final double PI = 3.14;
//	final = 바뀌지 않는 값
//	한번 정의한 값을 바꿀 수 없다.
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

public class Ex02_CalculatorDemo2 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.PI);
	}
}
