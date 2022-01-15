package ch04_1_if;

public class Ex00__If {
	public static void main(String[] args) {
		int score = 99;
				if(score >= 60) {
			System.out.println("합격입니다");
		}else {
			System.out.println("불합격입니다");
		}
				
		if(score >= 90) {
			System.out.println("A등급 입니다");
		}else if(score >=80) {
			System.out.println("B등급 입니다");
		}else if(score >=70) {
			System.out.println("C등급 입니다");
		}else{
			System.out.println("F등급입니다");}
	}
}
