
public class E {
	public static void main(String[] args) {
		//(int)((kor+eng+math)/3f*10+0.5f)/10f
		
		int i = 236;
		float avg1 = 0;
		float avg2 = 0;
		float avg3 = 0;
		float avg4 = 0;
		float avg5 = 0;
		float avg6 = 0;
	
		avg1 = i/3;                          //78.0
		avg2 = i/3f;                         //78.333334
		avg3 = i/3f*10;                      //786.6666
		avg4 = i/3f*10+0.5f;                 //787.1666
		avg5 = (int)(i/3f*10+0.5f);          
		avg6 = (int)(i/3f*10+0.5f)/10f;      //78.7
		
		System.out.println(avg1);
		System.out.println(avg2);
		System.out.println(avg3);
		System.out.println(avg4);
		System.out.println(avg5);
		System.out.println(avg6);

	}
}
