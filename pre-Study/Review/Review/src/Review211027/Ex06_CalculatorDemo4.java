package Review211027;
//		클래스 변수의 용도
//		인스턴스에 따라서 변하지 않는 값이 필요한 경우
//		인스턴스를 생성할 필요가 없는 값을 클래스에 저장하고 싶은 경우
//		값의 변경 사항을 모든 인스턴스가 공유해야 하는 경우

class Calculator2{
	static double PI = 3.14;
	static int base =0;
//	클래스 변수인 base 추가
//	정수를 담을 수 있는 base로 Calculator2의 멤버다.
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
//		더하기에 base의 값을 포함
		System.out.println(this.left + this.right + base);
	}
	
	public void avg() {
//		평균치에 base의 값을 포함시킨다
		System.out.println((this.left+this.right+base)/2);
	}
}

public class Ex06_CalculatorDemo4 {
	public static void main(String[] args) {
		Calculator2 c1 = new Calculator2();
		c1.setOprands(10, 20);
		c1.sum();
		
		Calculator2 c2 = new Calculator2();
		c2.setOprands(20, 40);
		c2.sum();
		
		Calculator2.base = 10;
		c1.sum();
		c2.sum();

	}

}
