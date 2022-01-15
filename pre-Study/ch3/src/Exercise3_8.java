
public class Exercise3_8 {

	public static void main(String[] args) {
		// ﻿지불할 금액을 지폐수량으로 계산하는 코드
		int price = 187_000;
		int oman = (price/50000);
		int ilman = (price-oman*50000)/10000;
		int ochun = (price-oman*50000-ilman*10000)/5000;
		int ilchun = (price-oman*50000-ilman*10000-ochun*5000)/1000;
		
		System.out.println("5만원 권 : " + oman + "장");
		System.out.println("1만원 권 : " + ilman + "장");
		System.out.println("5천원 권 : " + ochun + "장");
		System.out.println("1천원 권 : " + ilchun + "장");
	}

}
