package ch04_1_if;

public class Ex00_Dice {
	public static void main(String[] args) {
//		random() : 무작위 난수 생성
//		0.0~1.0 사이의 값이 무작위로 나옴
	
	int count = 0;
		while(true) {
			int dice = (int)(Math.random()*6)+1;
				count++;
				System.out.println(dice);
			if(dice == 3){
				System.out.println("Good bye");
				break;
			}	
		} 
		System.out.println("던진 횟수 : "+count);
	}
}
