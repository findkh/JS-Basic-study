
public class soo1 {
	public static void main(String[] args) {
		int i, j;
		for(i=2; i<=5; i++) {
			System.out.printf("[%d]:", i);
			for(j=1; j<=i; j++) {
				if(i%j == 0)
					System.out.printf("%d ", j);
			}
		}
	}

}
