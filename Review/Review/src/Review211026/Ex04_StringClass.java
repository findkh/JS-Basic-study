package Review211026;
public class Ex04_StringClass {
	public static void main(String[] args) {
//		String 클래스는 char배열에 기능(메서드)을 추가한 것이다
//		String객체(문자열)은 read only
		
		String str = "Java";
		str = str+"8";
		System.out.println(str);
//		문자열 str의 내용이 변경된 것 같지만 문자열은 변경할 수 없으므로 새로운 내용의 문자열이 생성된 것이다
		
//		주요 메서드
//		1. charAt(int index) 
//		문자열에서 해당 위치에 있는 문자를 반환한다
		String str2 = "ABCDE";
		System.out.println(str2.charAt(3));
//		D가 출력 됨
		
//		2. length()
//		문자열의 길이를 반환한다
		System.out.println(str2.length());
//		str2의 배열의 길이인 5가 출력된다
		
//		3. substring(int from, int to)
//		문자열에서 해당 범위의 문자열을 반환한다(to는 포함 안됨)
		String str3 = "123456789";
		System.out.println(str3.substring(2,6));
//		출력값 : 3456
		
//		4. equals(object obj)
//		문자열의 내용이 같은지 확인 한다. true, false
		boolean i;
		i = (str3.equals("123456789")? true : false);
		System.out.println(i);
//		출력값 : true
		i = (str2.equals("abcde")? true : false);
		System.out.println(i);
//		출력값 : false
//		대소문자 비교 안하려면  equalsIgnoreCase() 써야함
		i = (str2.equalsIgnoreCase("abcde")? true : false);
		System.out.println(i);
//		출력값 : true
	}
}
