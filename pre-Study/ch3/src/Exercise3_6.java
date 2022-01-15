
public class Exercise3_6 {

	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius1 = (5/9f * (fahrenheit - 32));		
		float celcius3 = (5/9f * (fahrenheit - 32)*100);
		float celcius4 = (int)((5/9f * (fahrenheit - 32))*100 + 0.5);
		float celcius5 = (int)((5/9f * (fahrenheit - 32))*100 + 0.5) / 100f;
		
		
		System.out.println("Fahrenheit:" +fahrenheit); //100
		System.out.println("Celcius:" +celcius1); //37.77778	
		System.out.println("Celcius:" +celcius3); //3777.7778
		System.out.println("Celcius:" +celcius4); //3778.0
		System.out.println("Celcius:" +celcius5); //37.78
	}

}
