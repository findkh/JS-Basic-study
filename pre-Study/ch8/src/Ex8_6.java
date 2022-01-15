public class Ex8_6 {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시킴"); //예외 메시지
			throw e;
		} catch(Exception e) {
			System.out.println("에러 메시지 : "+ e.getMessage());
			e.printStackTrace();
		}
			System.out.println("프로그램 정상종료");
	}
}
