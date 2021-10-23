class Outer6{
	static class Inner{
		int iv = 200;
	}
}
public class Exercise7_7 {
	public static void main(String[] args) {
		Outer6.Inner s = new Outer6.Inner();
		System.out.println(s.iv);
	}
}
