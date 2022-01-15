package ch02_3_typecasting;

public class Ex00_Typecasting {
	public static void main(String[] args) {
//		값의 허용(표현) 범위에 따른 분류
//		byte(1)<short(2)<int(4)<long(8)<float(4)<double(8)<String
		
		System.out.println(3 + "4");
		
		System.out.println(65);
		System.out.println((char)65);
//		-----------------------------------------------------
		byte b1 = 10;
		byte b2 = 20;
		byte result = (byte)(b1+b2);
		// byte result = b1 + b2;
		// 30인데 왜 byte의 범위를 넘어가나?
		// 자바에서 int형으로 바꿔버림
		// int + int가 되어 byte에 저장 할 수 없게 됨
		System.out.println("result : " + result);

		
		long l1 = 10;
		int i1 = 20;
		long result2 = l1 + i1;
		//int result2 =  l1 + i1;
		//int보다 큰 long이 오니 int를 long으로 형변환 하고 result2는 int형이 오류가 남
		System.out.println("result2 : " + result2);
		
		byte bv = 10;
		int iv = 100;
		long lv = 100000L;
		
		long sum = bv + iv + lv;
		System.out.println(sum);
		
//		------------------------------------------------------
		System.out.println(1/2); //0
		System.out.println((float)1/2); //0.5
		// 1.0/2 형변환
		
		int x = 1;
		int y = 2;
		
		int result3 = x / y;
		System.out.println(result3); //0
//		------------------------------------------------------
		
		System.out.println("abc");
		System.out.print("a");
		System.out.println("b");
		System.out.printf("%c%n", 65);
		System.out.printf("%d%n", 10);
		
		String name = "홍길동";
		String job = "도적";
		int age = 27;
		
		System.out.printf("%s | %s | %d |%n", name, job, age);
		
		double d = 1.23456789;
		float f = 1f;
		System.out.printf("d= %f%n", d);
		System.out.printf("d= %14.10f%n", d);
		System.out.printf("f= %5.3f%n", f);
		//printf 
		//%s -> String %c -> char %d -> 10진수 %o -> 8진수 %x -> 16진수 %f->float형 %n=\n -> 개행
//		------------------------------------------------------
		
		
	}

}
