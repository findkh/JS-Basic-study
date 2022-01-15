
public class Ex3_9 {

	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 1_000_000;
		long d = 1_000_000L;
		
		long c = a * b;
		 System.out.println(c);

		 // 결과 값 -1454759936
		 // long타입(8byte)은 1_000_000_000_000이 나와야 하지만 int*int는 int타입이기 때문에 
		 // 변수를 long타입으로 변경해줘야 한다
		 
		 long e = a * d;
		 System.out.println(e);
		 // 변수는 어느 것으로 long 타입으로 변경해주든 상관 없음
         // 결과값 1000000000000


	}

}
