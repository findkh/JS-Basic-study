package Review211027;

class Calculator3{
	public static void sum(int left, int right) {
		System.out.println(left+right);
	}
//	static을 제외하면 전과 같은 상태다
//	
	
	public static void avg(int left, int right) {
		System.out.println((left+right)/2);
	}
}
//		지금까진 인스턴스를 생성해서 값을 넣었지만
//		인스턴스 없이 클래스에 직접 접근하여 값을 줌
//		인스턴스 생성하지 않으면 메모리를 절약할 수 있다
public class Ex07_CalculatorDemo5 {
	public static void main(String[] args) {
		Calculator3.sum(10, 20);
		Calculator3.avg(10, 20);
		
		Calculator3.sum(20, 40);
		Calculator3.avg(20, 40);
	}
}
