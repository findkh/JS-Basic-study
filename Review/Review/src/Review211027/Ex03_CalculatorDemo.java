package Review211027;
//생활코딩 - 객체지향
public class Ex03_CalculatorDemo {
	public static void sum(int left, int right) {
		System.out.println(left+right);
	}
//	sum 메서드를 만듦
//	main에서 입력값을 주면 계산함
	
	public static void avg(int left, int right) {
		System.out.println((left+right)/2);
	}
	
	public static void main(String[] args) {
		int left, right;
		
		left = 10;
		right = 20;
		sum(left, right);
		avg(left, right);
		
		left = 20;
		right = 40;
		sum(left, right);
		avg(left, right);

	}

}
