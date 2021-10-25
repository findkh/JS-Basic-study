package Review211025;

public class Ex06_MathRound {

	public static void main(String[] args) {
//		Math.round()메서드는 소수점 첫째 자리에서 반올림한 결과를 정수로 변환한다.
		
		long result = Math.round(4.52);
		System.out.println(result);
		
//		소수점 첫째 자리가 아닌 다른 자리에서 반올림 하려면 10의 n제곱으로 적절히 곱하고 나눠야 한다.
		double pi = 3.141592;
		double shortpi = Math.round(pi*1000)/1000.0;
		System.out.println(shortpi);
//		3.141592 * 1000 = 3141.592
//		Math.round(3141.592) = 3142
//		3142*1000 = 3.142
		
//		0.123456789를  0.12346로 하려면?
		double d = 0.123456789;
		double shortd = Math.round(d*100000)/100000.0;
		System.out.println(shortd);

	}

}
