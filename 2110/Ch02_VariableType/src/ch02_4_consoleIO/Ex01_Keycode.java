package ch02_4_consoleIO;

import java.io.IOException;

public class Ex01_Keycode {

	public static void main(String[] args) throws IOException {
		int keyCode;
		
		keyCode = System.in.read();
		System.out.printf("keyCode: %d\n", keyCode);

		keyCode = System.in.read();
     	System.out.printf("keyCode: %d\n", keyCode);
		
		keyCode = System.in.read();
		System.out.printf("keyCode: %d\n", keyCode);
		
		keyCode = System.in.read();
		System.out.printf("keyCode: %d\n", keyCode);

		keyCode = System.in.read();
		System.out.printf("keyCode: %d\n", keyCode);
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			
			if(keyCode == 113) {
				break;
			}
		}		
	}
}
	

