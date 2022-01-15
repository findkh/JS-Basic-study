package Review211104;
import java.io.IOException;

public class Ex05_Exception {
	void throwArithmeticException() {
		throw new ArithmeticException();
	}
	void throwIOException1() {
		try {
			throw new IOException();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	void throwIOException2() throws IOException{
		throw new IOException();
	}
}
