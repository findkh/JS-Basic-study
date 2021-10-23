
public class Ex3_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5, j =0;
		
		j = i++;
		System.out.println("j=i++ 실행하면"+ "i=" + i + "j=" + j);
	// 결괏값 j=i++ 실행하면i=6j=5
		i = 5;
		j = 0;
		
		j = ++i;
		System.out.println("j=++i 실행하면"+ "i=" + i + "j=" + j);
    // 결괏값 j=++i 실행하면i=6j=6
	}
}
