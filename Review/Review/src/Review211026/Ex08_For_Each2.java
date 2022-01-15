package Review211026;
public class Ex08_For_Each2 {
	enum Week {월, 화, 수, 목, 금, 토, 일}
	public static void main(String[] args) {
		for (Week day:Week.values())
			System.out.print(day + "요일 ");
		System.out.println();
//		출력값 : 월요일 화요일 수요일 목요일 금요일 토요일 일요일 
	}
}
