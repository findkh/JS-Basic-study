package Review211105;
class ArithmeticOpration{
//	4개의 메서드 생성
//	main에서 전달한 인자들이 a, b로 들어가서 연산한후 return한다
	long add(long a, long b) {
		long result = a+b;
		return result;
	}
	long substract(long a, long b) 		{ return a - b;	}
	long multiply(long a, long b)  		{ return a * b;	}
	double divide(double a, double b) 	{ return a/b;	}
	int abs(int x) { return x>0? x: -x; }
//	정수의 부호를 판단해서 음수일경우 양수로 반환한다
}
public class Ex01_ArithmeticOperation {
	public static void main(String[] args) {
		ArithmeticOpration m = new ArithmeticOpration();
		long result1 = m.add(5, 3);
		long result2 = m.substract(5, 3);
		long result3 = m.multiply(5, 3);
		double result4 = m.divide(5, 3);
		int result5 = m.abs(-5);
		int result6 = m.abs(5);
		
		System.out.printf("add 메서드 : %d%n", result1);
		System.out.printf("substract 메서드 : %d%n", result2);
		System.out.printf("multiply 메서드 : %d%n", result3);
		System.out.printf("divide 메서드 : %3.2f%n", result4);
		System.out.println(result5);
		System.out.println(result6);
	}
}
