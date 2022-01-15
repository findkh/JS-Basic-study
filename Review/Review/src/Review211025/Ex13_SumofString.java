package Review211025;

public class Ex13_SumofString {

	public static void main(String[] args) {
		// 숫자로 이루어진 문자열 str이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라
		String str = "12345";
		int sum = 0;
		
		for(int i = 0; i<str.length(); i++) {
			sum += str.charAt(i)-'0';			
		}
		System.out.print(sum);
	}
}
//		charAt() 은 문자열의 문자를 하나씩 읽어서 문자로 반환한다
//		문자가된 1은 아스키 코드에서 49인데 문자 0의 아스키코드 48을 빼주면 1이 된다
//		이와 같은 방법으로 2는 50인데 문자 0의 아스키코드 48을 빼주면 2가 된다

