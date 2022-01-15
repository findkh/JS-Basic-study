package Review211025;

public class Ex10_Sum3 {
	public static void main(String[] args) {
//		1+(-2)+3+(-4)+..이런식으로 더해 나갔을 때 몇까지 더해야 총합이 100이상 되는지 구하시오
//		음수로 변환하는 법은 *-1을 하면 됨
		
		int sum = 0;
		int nega = 0;
		
		for(int i = 1; sum<100; i++) {
//			i는 1부터 sum이 100을 초과하기 전까지 1씩 더해준다
			if(i%2==0) {
				nega= i*-1;
				sum += nega;
//			i가 짝수라면 음수로 바꿔서 sum에 더해준다
			}else{
				sum += i;
//			i가 홀수라면 그대로 sum에 더해준다
			}
			System.out.println(i);		
//			199가 되었을 때 총합이 100이 된다. 
		}	
		
	}
}

