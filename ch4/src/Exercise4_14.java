
public class Exercise4_14 {

	public static void main(String[] args) {
		// 주사위 눈이 6이 나올때까지 계속 굴리고 눈이 6이 되면 지금까지 굴린 횟수 출력
		// while문으로 반복 주사위는 Math.random() 사용
		int i = 0;
		int count = 0;
		
		while(true) {
			count++;
			i = (int)(Math.random()*6)+1;
				System.out.println(i);
			
			if(i==6) {
				break;
			}
			System.out.println("주사위를 던진 횟수는" + count);
		}
	}
}
