package ch02_3_typecasting;

public class Ex07_PrimitiveAndAtringConversion {
	public static void main(String[] args) {
		//문자열->숫자, 숫자->문자열
		
		String str = "100";
		int var = 100;
		
		
		System.out.println(str + 1); //String 1001 
		System.out.println(var + 1); //int 101
		
		//문자열로 입력 받은 수를 수식연산하려면? parseInt 사용
		
		int intVal = Integer.parseInt(str); //문자열 100을 정수형 100으로 리턴함
		
		System.out.println(intVal+1); //101
		System.out.println("intVal =" + intVal + 1); //1001
		System.out.println("intVal =" + intVal+1); //왜 문자?? 1001
		System.out.printf("intVal = %d\n", intVal + 1); //intVal를 10진수로 변환해서 + 1 =101
		System.out.printf("intVal = %x\n", intVal + 1); //intVal를 16진수로 변환해서 + 1 =65
		
		
		String message = Integer.toString(var); //int형 var 100을 문자열로 변환
		System.out.printf("message = %s%n", message + 2);  // 1002가 나옴
		System.out.println(message+2); //1002
		System.out.println("message =" + message + 2); //1002
	}

}
