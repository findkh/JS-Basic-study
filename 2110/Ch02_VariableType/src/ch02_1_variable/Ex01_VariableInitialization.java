package ch02_1_variable;

public class Ex01_VariableInitialization {

	public static void main(String[] args) {
		/*변수?
		* 값을 저장할 수 있는 메모리 번지에 붙인 이름
		* 변수를 통해서 프로그램은 메모리 번지에 값을 저장하고
		* 읽을 수 있다.
		* 
		* 변수 선언?
		* 변수의 타입(크기 및 종류)의 데이터를 저장할지
		* 그리고 이름을 무엇으로 할지 결정하는 것
		* 
		* 상수?
		* 항상 같은 값으로 값이 변하지 않는다, 표준, 디폴트
		* 변수가 값이 바뀌는거랑은 다름
		* final 붙이면 재할당이 불가능
		*/
		
		double x = 5*123/2;
		final double pi = 3.141592;
		char a = 99;
		int i = 97;
		
		System.out.println(x);
		System.out.println(a);
		System.out.println((char)i);
	}

}
