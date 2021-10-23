class Superobj{
	public void show() {
		print();
	}
	
	public void print() {
		print();
		System.out.print("Super");
	}
}

class Subobj extends Superobj{
	public void show() {
		super.print();
	}
	public void print() {
		System.out.print("Sub");
	}
	
}


public class Ex_soo {
	public static void main(String[] args) {
		Superobj s = new Subobj();
		s.show();

	}

}
