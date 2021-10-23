package ch03_operator;

public class Ex_UnaryOperator {
	public static void main(String[] args) {
//		증감 연산자 (++, --)
		int opr = 0;
		opr +=3;
		System.out.println(opr++); //3
		System.out.println(opr); //4
		System.out.println(++opr); //5
		System.out.println(opr--);//5
		System.out.println(opr);//4
		System.out.println(--opr);//3
		System.out.println(opr);//3
		
		System.out.println("-----------------");
		int x = 1, y =1;
		int result1 = ++x + 10;
		int result2 = y++ + 10;
		System.out.println(result1); //12
		System.out.println(result2); //11

		System.out.println("-----------------");
		int i = 0;
		i++;
		System.out.println(i); //1
		System.out.println(++i); //2
		System.out.println(i); //2
		System.out.println(i++); //2
		System.out.println(i); //3
		System.out.println();
		System.out.println(++i);//4
		System.out.println(i);//4
	}
}
