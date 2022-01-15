package ch02_1_variable;

public class Ex04_VariableScope {
	static int v = 0; // static 붙이면 메모리에 바로 적재함, 상수
	
	public static void main(String[] args) {
		int v1 =15; //인스턴스 변수
	
		
		if (v1 > 10) {
			int v2 = v1-10; //v2는 지역변수
			System.out.println("v2: " + v2);
			System.out.println(v);
		} 

		System.out.println(v);
		int v3 = v1 + 5;
		System.out.println("v3: " + v3);
		
	}
}
