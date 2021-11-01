package Review211101;

class Calculator{
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

class SubstractionalbeCalculator extends Calculator{ //상속의 키워드 extends
	public void substract() {
		System.out.println(this.left - this.right);
	}
}
	
public class Ex06_Calculator {
	public static void main(String[] args) {
		SubstractionalbeCalculator c1 = new SubstractionalbeCalculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();
	}
}
