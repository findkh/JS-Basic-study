package Review211101;

public class Ex11_ConstructorDemo3 {
	class Calculator{
		int left, right;
		
		public Calculator() {}
			
		public Calculator(int left, int right) {
			this.left = left;
			this.right = right;
		}
		//부모 클래스의 생성자
		
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

	class SubstractionalbeCalculator extends Calculator{
	    public SubstractionalbeCalculator(int left, int right) {
	    	super(left, right);
//	    	super는 상위 클래스(부모 클래스)를 가르키는 키워드다
//	    	하위 클래스의 초기화 내용은 super 밑에 작성해야 함.
		}
	    
		public void substract() {
			System.out.println(this.left - this.right);
		}
	}
	
	public static void main(String[] args) {
		SubstractionableCalculator c1 = new SubstractionalbeCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
	}
}
