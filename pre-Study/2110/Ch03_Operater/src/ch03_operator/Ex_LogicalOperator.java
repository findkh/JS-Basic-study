package ch03_operator;

public class Ex_LogicalOperator {
	public static void main(String[] args) {
//		논리(AND=&&, OR=||, NOT=!)
		int CharCode = 'b';
		if((CharCode >= 65) && (CharCode <=90)) {
			System.out.println(CharCode+": 대문자");
		}else {
			System.out.println(CharCode+": 소문자");
		}
		System.out.println("-------------");
		
		//아스키코드 숫자 범위 0:48 ~ 9:57
		int num = 5;
		if((num >=0 ) && (num<=9)) {
			System.out.println(num+": 숫자입니다");
		}else {
			System.out.println(num+": 숫자가 아닙니다");
		}
		System.out.println("-------------");
		
		String name = "수다르";
		String name2 = "수달";
		
		String result = (name!=name2? "잘못입력했습니다" : "이름이 맞습니다" );
		System.out.println(result);
	}
}
