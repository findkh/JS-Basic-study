
public class Ex113 {
	public static void main(String[] args) { //파보나치 수열
		int a, b, c;
		a = 1;
		b = 1;
		c = 2;
		
		while(c< 20) {
			a = b;
			b = c;
			c = a+b;
			System.out.print(c + " ");
		}

	}

}
