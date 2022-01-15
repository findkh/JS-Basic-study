package Review211104;
import java.io.*;
class B{
	void run() throws FileNotFoundException, IOException{
			BufferedReader bReader = null;
			String input = null;
			System.out.println(input);
	}
}
class C{
	void run() throws FileNotFoundException, IOException{
		B b = new B();
		b.run();
	}
}

public class Ex03_ThrowExceptionDemo {
	public static void main(String[] args) {
		C c = new C();
		try {
			c.run();
		} catch (FileNotFoundException e) {
			System.out.println("text파일이 필요합니다");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
