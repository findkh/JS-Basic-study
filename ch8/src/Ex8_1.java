public class Ex8_1 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
		} catch (Exception e) { //예외가 발생하지 않음 실행 되지 않는다
			System.out.println(4);
		}
		System.out.println(5);
	}
}