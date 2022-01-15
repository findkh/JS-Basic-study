
public class Ex5_7 {

	public static void main(String[] args) {
		String str = "ABCDE";
		char ch = str.charAt(4);
			System.out.println(ch);		
		String str2 = str.substring(1,4);
			System.out.println(str2);
		String str3 = str.substring(1);
		// 뒤에 생략하면 str.length()와 똑같다
			System.out.println(str3);
	}

}

