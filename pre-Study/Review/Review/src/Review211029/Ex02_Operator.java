package Review211029;
public class Ex02_Operator {
	public static void main(String[] args) {
		char c = 'a';
		for(int i=0; i<26; i++) {
			System.out.print(c++);
		}
		System.out.println();
		c='A';
		for(int i=0; i<26;i++) {
			System.out.print(c++);
		}
		System.out.println();
		c='0';
		for(int i=0; i<10; i++) {
			System.out.print(c++);
		}
		System.out.println();
	}
}
