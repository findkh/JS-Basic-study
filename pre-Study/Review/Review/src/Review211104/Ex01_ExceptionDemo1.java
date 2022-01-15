package Review211104;
class A{
	private int[] arr = new int[3];
	A() {
		arr[0]=0;
		arr[1]=10;
		arr[2]=20;
	}
	public void z(int first, int second) {
		try {
			System.out.println(arr[first]/arr[second]);
		} catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception e");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException e");
		} catch(Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("finally");
//		try문이든 catch문이든 항상 실행 되는 문장
		}
	}
}

public class Ex01_ExceptionDemo1 {
	public static void main(String[] args) {
		A a= new A();
		a.z(2, 1);
		a.z(10, 0);
		a.z(1, 0);
	}
}
