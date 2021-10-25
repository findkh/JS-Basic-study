package Review211025;

public class Ex09_Sum2 {

	public static void main(String[] args) {
//		1+(1+2)+(1+2+3) ... +(1+2+3...+10)의 합은?
		
		int sum = 0;
		for(int i = 0; i<=10; i++) {
			for(int j = 1; j<=i; j++) {
				sum+=j;
			}
		}
		System.out.println(sum);

	}

}
