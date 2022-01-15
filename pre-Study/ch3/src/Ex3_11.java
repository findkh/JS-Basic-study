
public class Ex3_11 {

	public static void main(String[] args) {
double pi = 3.141592;
		
		System.out.println(Math.round(pi));
		// Math.round 소숫점 첫째자리에서 반올림하는 것
        // 결괏값 : 3
		
		System.out.println(pi*1000);
        // 결괏값 : 3141.592
		System.out.println(Math.round(pi*1000)/1000d);
		// 5번째 자리에서 반올림 하고 싶으면 이렇게 함
        // 결괏값 : 3.142

		// 3.141을 얻으려면?
		System.out.println(pi*1000);
		System.out.println((int)(pi*1000));
		System.out.println((int)(pi*1000)/1000.0);
   	}

}
