package ch02_2_primitive;

public class Ex06_EscapeChar {
	public static void main(String[] args) {
//		'\' + 문자   
//		형태로 출력을 제어하는 기능을 함
		
		System.out.println("번호\t이름\t직업"); //<\t> 탭 기능
		
		System.out.print("a\nb"); //<\n> 띄어쓰기

//		우리는 "개발자" 입니다
		
		char a = 34; //아스키코드 " 는 34임
		System.out.println(a);
		System.out.println("우리는 \"개발자\" 입니다" ); //<"\> 큰 따옴표 
		System.out.println("우리는 " + a + "개발자" + a + " 입니다");
		System.out.println("2011\\10\\19"); //<\\> 역슬래시 
		System.out.println("C:\\DevJava\\Download");
		System.out.println("\'아아 \'");
	}
}
