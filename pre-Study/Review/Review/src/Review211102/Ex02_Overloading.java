package Review211102;
class Calculator{
	int left, right;
	int third = 0;
	
//		setOprands 메서드 2개가 있음
//		overloading 
//		같은 이름 다른 매개 변수의 형식 or 숫자로 overloading이 가능해짐
	public void setOprands(int left, int right) {
		System.out.println("setOprands(int left, int right)");
		this.left = left;
		this.right = right;
		}

	public void setOprands(int left, int right, int third) {
		System.out.println("setOprands(int left, int right, int third)");
//		this.left = left;
//		this.right = right;
//		위에 setOprands와 중복됨
		this.setOprands(left, right);
//		중복이 되는 코드 먼저 호출하고 필요한 부분만 추가함. 
		this.third = third;
		}
	
	public void sum() {
		System.out.println(this.left+this.right+this.third);
	}
	
	public void avg() {
		System.out.println((this.left+this.right+this.third)/3);
	}
}

public class Ex02_Overloading {
	public static void main(String[] args) {
//		3개의 값을 대상으로 연산이 가능하게 바꾸고 싶을 때
		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		c2.setOprands(10, 20, 30);
		c2.sum();
		c2.avg();
	}
}
