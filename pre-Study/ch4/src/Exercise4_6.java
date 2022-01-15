
public class Exercise4_6 {

	public static void main(String[] args) {
		//두개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력
		//이중for문
		int i;
		int j;
		int num = 0;
		
		for(i=1; i<6; i++) {
			for (j=1; j<6; j++){
				if(i+j==6) {
					num+=1;
				}
			}
		}
		System.out.println(num);
	}

}
