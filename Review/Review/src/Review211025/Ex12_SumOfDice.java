package Review211025;

public class Ex12_SumOfDice {

	public static void main(String[] args) {
//		두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성
		System.out.println("주사위 2개 던졌을때 합이 6이 되는 경우의 수");
		for(int i = 1; i<=6; i++) 
			for(int j = 1; j<=6; j++) 
				if((i+j)==6) 
					System.out.printf("%d+%d=6%n",i,j);
	}
}

