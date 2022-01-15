package ch02_1_variable;

public class Ex02_VariableUse {
	public static void main(String[] args) {
		int hour = 24;
		int minute = 00;
		
		System.out.println(hour+"시간"+minute+"분");
		//자료형이 같아야 연산을 하는데 int+String이 됨
		//자료형을 같게 맞춰줌(형변환)
		//자료형이 큰쪽으로 형변환 됨
		
		int totalMinute = (hour*60)+minute;
		System.out.println("총 "+totalMinute+"분");
	}

}
