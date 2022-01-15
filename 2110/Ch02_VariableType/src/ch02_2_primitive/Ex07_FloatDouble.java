package ch02_2_primitive;

public class Ex07_FloatDouble {
	public static void main(String[] args) {
		
		float fl2  = 0.1234567890123456789f;
	    double dl2 = 0.1234567890123456789;
	    
	    System.out.println("fl2 = " + fl2); // 정밀도 .포함 해서 7자리까지만 정확함
	    System.out.println("dl2 = " + dl2);

//	       지수(e)표현식
	    double dl3 = 3e6; //e = 10, 3*10^6=300_0000
	    float fl3 = 3e6F;
	    double dl4 = 2e-3; //2*10^-3
	    
	    System.out.println("dl3 = " + dl3);
	    System.out.println("fl3 = " + fl3);
	    System.out.println("dl4 = " + dl4);
	    
	}

}
