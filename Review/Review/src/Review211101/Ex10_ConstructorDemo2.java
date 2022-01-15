package Review211101;

class Calculator{
	int left, right;
	
	public Calculator() {} //부모 클래스의 기본생성자
	
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
//	부모 클래스의 기본 생성자를 자동으로 호출함
    public SubstractionalbeCalculator(int left, int right) {
    	this.left = left;
        this.right = right;
	}
//  부모클래스와 자식 클래스의 생성자가 중복됨
    
	public void substract() {
		System.out.println(this.left - this.right);
	}
}
	
public class Ex10_ConstructorDemo2 {
	public static void main(String[] args) {
        SubstractionalbeCalculator c1 = new SubstractionalbeCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();

	}

}
