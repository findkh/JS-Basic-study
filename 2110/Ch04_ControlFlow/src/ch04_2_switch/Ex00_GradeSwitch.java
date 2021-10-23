package ch04_2_switch;

public class Ex00_GradeSwitch {
	public static void main(String[] args) {
//		학점이 A, B인 학생에게는 잘했습니다
//		학점이 C, D인 학생에게는 노력하세요
//		학점이 F인 학생은 재수강하세요 출력
		
		char grade = 'C';
		switch(grade) {
		case 'A':
		case 'B':
			System.out.println("잘했습니다");
			break;
		case 'C':
		case 'D':
			System.out.println("노력하세요");
			break;
		default :
			System.out.println("재수강하세요");
			break;
		}
	}
}
