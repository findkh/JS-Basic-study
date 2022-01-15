package ch04_2_switch;

public class Ex00_Switch {
	public static void main(String[] args) {
//		switch -> 조건제어문(if ~ else if~)
//		if ~ else if~ : 조건(식)에 대한 분기
//		switch : (값)에 대한 분기
		int num = (int)(Math.random()*6)+1;
		System.out.println(num);
		switch(num) {
		case 1:
			System.out.println("1번");
			break;
		case 2:
			System.out.println("2번");
			break;
		case 3:
			System.out.println("3번");
			break;
		case 4:
			System.out.println("4번");
			break;
		case 5:
			System.out.println("5번");
			break;
		case 6:
			System.out.println("6번");
			break;
		}		
	}
}
