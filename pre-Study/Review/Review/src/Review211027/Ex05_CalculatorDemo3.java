package Review211027;
//클래스 변수
class Calculator {
	static double PI = 3.14;
//		모든 인스턴스 변수가 공유하는 클래스 변수
//		PI는 double형이고 3.14를 담고 있다
//		static변수는 클래스에 소속된다 = 모든 인스턴스에서 동일한 값으로 갖게 된다    
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
	
	public class Ex05_CalculatorDemo3 {
	public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.PI); //3.14
 
        Calculator c2 = new Calculator();
        System.out.println(c2.PI); //3.14
 
        System.out.println(Calculator.PI); //3.14
//		클래스에 직접 접근해서 값을 받아옴
	}

}
