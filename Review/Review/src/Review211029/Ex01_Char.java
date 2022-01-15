package Review211029;
public class Ex01_Char {
	public static void main(String[] args) {
		char ch = 'A';
//		char형의 ch변수에 유니코드 65가 저장된다.
		char ch2 = 65;
//		이렇게 저장해도 같은 결과가 나온다
		System.out.println(ch);
		System.out.println(ch2);
		
		System.out.println('\''); // ' 하나 출력, '''이렇게 할 수 없음
		System.out.println("abc\t123\b456"); // \t 탭키, \b는 백스페이스라는데 안먹힌다.. 구글에 쳐도 안나옴
		System.out.println("\"Hello\""); // \" 큰따옴표
		System.out.println("c:\\"); //  \\ 역슬래시 두개치면 역슬래시 하나 나옴
		

	}

}
