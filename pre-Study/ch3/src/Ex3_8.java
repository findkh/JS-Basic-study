
public class Ex3_8 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b);
		System.out.println(c);
		//출력 값은 44
		// 10*30은 300이지만 300은 byte의 범위를 넘어감  byte형으로 변환하면 8bit까지 표현하니까
		// 300 이진수로 변환하면 1_0010_1100
		// 0010_1100을 10진수로 계산하면 44가 나옴
		// 이게 데이터 손실임
	}

}
