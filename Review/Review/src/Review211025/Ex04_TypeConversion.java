package Review211025;

public class Ex04_TypeConversion {
	public static void main(String[] args) {
//		타입간 변환방법
//		1. 숫자를 문자로 변환 - 숫자에 '0'을 더 한다
//		2. 문자를 숫자로 변환 - 문자에서 '0'을 뺀다
//		3. 숫자를 문자열로 변환 - 숫자에 빈 문자열("")을 더한다
//		4. 문자열을 숫자로 변환 - Integer.parseInt()또는 Double.parseDouble()사용
//		5. 문자열을 문자로 변환 -  charAt(번지)을 사용
//			charAt()은 String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해주는 녀석이다.			
//		6. 문자를 문자열로 변환 - 빈 문자열("")을 더한다
		
		int a = 1;
		System.out.println((char)(a+'0'));
//		1번 예시
//		숫자 1에 문자 0을 더해 문자로 만들었다
//		a 변수의 값 1의 아스키 코드 값은 49이다 이값을 char형으로 형변환 하여 숫자 1이 나온다
		System.out.println((char)(3+'0'));
//		숫자 3에 문자0을 더해 아스키코드 값이 나오게 하고 char형으로 형변환 하면 숫자 3이 나온다
				
		System.out.println(('3'-'0') +1);
//		2번 예시
//		문자 3에 '0'을 빼면 숫자로 변환된다. 

		System.out.println((3+"")+1);
//		3번 예시
//		숫자에 빈 문자열을 더하면 문자열로 변환된다
//		String이 가장 형님이라..자동 형변환 되는 것 같다
		
		System.out.println(Integer.parseInt("3")+1);
//		4번 예시
//		parsInt 사용하여 3을 숫자로 바꿔준다
		
		String str = "34";
		System.out.println(str.charAt(0));
//		5번째 예시
//		String으로 저장된 문자열에서 번지 수에 숫자를 char 타입으로 변환. 0번째인 3이 문자로 출력 됨
		
		System.out.println('3'+"" +1);
//		문자인 '3'에 빈 문자열("")을 더해주면 문자열이 되고 문자열에 1을 더하면 31이 나온다
		
//		문자인 숫자에 더하기를 하면 아스키 코드로 변환되어 숫자로 나오므로 문자열로 변환하려면 형변환 해야 하는 것 같고
//		스트링에 더하기를 하면 더한 숫자가 문자열로 나란히 붙어서 나오게 되는것 같다!
	}
}
