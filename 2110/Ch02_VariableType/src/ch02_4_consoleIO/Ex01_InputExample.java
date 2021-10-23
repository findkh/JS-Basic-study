package ch02_4_consoleIO;

import java.io.*;

public class Ex01_InputExample {

	public static void main(String[] args) {
//		system.in을 InputStreamReader에 연결하여 사용자로부터 키 입력
//		입력 받은 문자를 화면에 출력하고, ctal-z 키 누르면 읽기 종료
		
		InputStreamReader rd = new InputStreamReader(System.in);
		try {
			while(true) {
				int a = rd.read();
				if(a==-1)
					break;
				System.out.println((char)a);
			}
		}
		catch(IOException e) {
			System.out.println("입력 에러 발생");
		}
	}
}
