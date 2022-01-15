class Data_1 {
	int value;
} //정의 되어 있는 생성자가 하나도 없으므로 컴파일러가 기본 생성자 추가 해줌

class Data_2 {
	int value;
	//Data_2(){} //-> 생성자 추가해줘야 오류가 안남
	Data_2(int x){ //매개변수가 있는 생성자가 1개 존재함
		value = x;
	}
	
}
public class Ex6_11 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(10); // Data_2(int x) 생성자 사용
		
	}
}
