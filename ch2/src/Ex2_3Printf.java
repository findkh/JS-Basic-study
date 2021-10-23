
public class Ex2_3Printf {

	public static void main(String[] args) {
		String url = "blog.naver.com/watermoon14";
		//String url = "www.codechobo.com";
		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.23456789;

		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
//	 	실수형 값에 사용되는 지시자 %f 소숫점 아래 6자리까지 출력
//	 	%e 지수형태, %g 값을 간단하게 표현
		
		System.out.printf("d=%f%n", d);
//	 	%f 소숫점 6자리까지 출력되니까 반올림해서 7이 8이 됨
		
		System.out.printf("d=%14.10f%n", d);
//		 총 14자리에서 소숫점 밑으로 10자리가 생김,  소숫점(.)도 한자리임 소숫점포함 4자리
//		 공백은 0으로 채움
		System.out.printf("[%s]%n", url); //34개
		System.out.printf("[%30s]%n", url); //우측 정렬
		System.out.printf("[%-30s]%n", url); //좌측 정렬
		System.out.printf("[%.10s]%n", url); // 왼쪽에서 10개만 출력 

	}

}
