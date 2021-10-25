package Review211025;

public class Ex07_MathRandom {

	public static void main(String[] args) {
//		while문 사용 로또번호 추출
//		로또번호만 찍어내는건 while문으로 잘 되는데
//		보너스 번호를 따로 빼서 앞에 추출한 6개랑 겹치지 않게 뽑는건 배열을 써야 할 것 같다...
		int count = 0;
		int lottery = 0;
		int lottery2 = 0;
		
		while(true) {
			lottery = (int)(Math.random()*45)+1;
			
			if(count==6) {
				break;
			}
			count++;
			System.out.println("행운의 번호 : " + lottery);
		}
		
		while(true) {
			lottery2 = (int)(Math.random()*45)+1;
			if(lottery!=lottery2) {
				System.out.println("보너스 번호:" + lottery2);
				break;
			} else {
				continue;
			}				
		}			
	}
}
