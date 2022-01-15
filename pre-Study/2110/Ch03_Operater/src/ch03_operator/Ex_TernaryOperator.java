package ch03_operator;

public class Ex_TernaryOperator {
	public static void main(String[] args) {
//		삼항(조건식? 참값: 거짓값)
		int score = 85;
		char grade = ' ';
		grade = (score>=90? 'A' : 'B');
		System.out.println(grade);
		System.out.println("--------------");
		
		int score2 = 60;
		String grade2 = "";
		grade2 = (score2>=60? "합격입니다" : "불합격입니다");
		System.out.println(grade2);
	}
}
