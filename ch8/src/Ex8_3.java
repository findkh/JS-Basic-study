public class Ex8_3 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0); //예외발생
			System.out.println(4); //실행안됨
		}catch (Exception e) {//ArithmeticException대신 Exception사용
			System.out.println(5);
		}
			System.out.println(6);
	}
}
