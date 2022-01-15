package pkg1;

public class MyParent{ //default 같은 패키지만
	private int prv; //같은 클래스
	int dft;		// 같은 패키지
	protected int prt; // 같은 패키지 + 자손패키지
	public int pub;		// 접근제한 없음
	
	public void printMember() {
		System.out.println(prv); // 같은 클래스라 오케이
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}

class MyParentTest {

	public static void main(String[] args) {
		MyParent p = new MyParent();
//		System.out.println(p.prv); //에러
		System.out.println(p.dft);
		System.out.println(p.prt);
		System.out.println(p.pub);

	}

}
