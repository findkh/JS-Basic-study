package Review211103;
class Calculator implements Calculatable{
//	Calculatable에 있는 메서드들을 구현하고 있다
	int first, second, third;
	public void setOprands(int first, int second, int third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}
	
	public int sum() {
		return this.first + this.second + this.third;
	}
	
	public int avg() {
		return (this.first+this.second+this.third)/3;
	}
}

public class Ex03_CalculatorConsumer {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setOprands(10, 20, 30);
		System.out.println(c.sum()+c.avg());
	}
}
