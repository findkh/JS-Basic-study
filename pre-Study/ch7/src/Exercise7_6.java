class Outer4{
	class Inner{
		int iv = 100;
	}
}

public class Exercise7_6 {
	public static void main(String[] args) {
		Outer4 o = new Outer4();
		Outer4.Inner ii = o.new Inner();
		
		System.out.println(ii.iv);
	}
}
