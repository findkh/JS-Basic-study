class Mymath2{
	long a, b;
	//인스턴스 변수 a, b만 이용하여 작업 매개변수 필요 없음
	long add() { return a + b; } //a, b는 인스턴스 변수
	long subtract() { return a - b; }
	long multiply() { return a * b; }
	double divide() { return a / b; }
	
	//매개변수만으로 작업
	static long add(long a, long b) { return a + b; } //a, b는 지역변수
	static long subtract(long a, long b) { return a - b; } 
	static long multiply(long a, long b) { return a * b; }
	static double divide(long a, long b) { return a / (double)b; }	
}

public class Ex6_9 {
	public static void main(String[] args) {
		//클래스 메서드 호출. 인스턴스 생성 없이 호출 가능
		System.out.println(Mymath2.add(200L, 100L));
		System.out.println(Mymath2.subtract(200L, 100L));
		System.out.println(Mymath2.multiply(200L, 100L));
		System.out.println(Mymath2.divide(200L, 100L));
		
		Mymath2 mm = new Mymath2(); //인스턴스 생성
		mm.a = 200L;
		mm.b = 100L;
		//인스턴스 메서드는 객체 생성 후에만 호출 가능
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}
}
