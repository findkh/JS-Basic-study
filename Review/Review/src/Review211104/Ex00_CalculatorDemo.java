package Review211104;
class Calculator{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void divide() {
		try {
			System.out.print("계산 결과는 ");
			System.out.print(this.left/this.right);
			System.out.print(" 입니다");
		} catch (Exception e) {
			System.out.println("\n\ne.getMesage()\n"+ e.getMessage());
//			e.getMesage()
//			/ by zero
			
			System.out.println("\n\ne.toString()\n"+e.toString());
//			e.toString()
//			java.lang.ArithmeticException: / by zero
			
			System.out.println("\n\ne.printStackTrance()");
			e.printStackTrace();
//			e.printStackTrance()
//			java.lang.ArithmeticException: / by zero
//				at Review211104.Calculator.divide(Ex00_CalculatorDemo.java:12)
//				at Review211104.Ex00_CalculatorDemo.main(Ex00_CalculatorDemo.java:27)
		}
		System.out.println("Dvide End");
	}
}

public class Ex00_CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		c1.divide();
	}
}
