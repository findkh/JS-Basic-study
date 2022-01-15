public class Ex8_2 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(0/0); //예외발생 바로 catch문으로 감
			System.out.println(2);
		}catch (ArithmeticException ae) {
			System.out.println(3);
		}
		System.out.println(4);
	}
}
