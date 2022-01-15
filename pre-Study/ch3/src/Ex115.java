public class Ex115 {
	public static void main(String[] args) {
		int i = 1;
		for( ; i<10; ) {
		switch(i%2) {
		case 0: System.out.printf("짝수 : %d\n", i); break;
		default : System.out.printf("홀수 : %d\n", i);
		}
		i+=3;
		}
	}
}
