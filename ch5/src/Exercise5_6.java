import java.util.Scanner;
public class Exercise5_6 {

	public static void main(String[] args) {
		// 단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 코드
		String[] words = {"television", "computer", "mouse", "phone"};
		
		Scanner scanner = new Scanner(System.in);

		for(int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray(); //string을 char로 바꾼다.
	
			//코드 입력
			
			for(int j = 0; j < question.length; j++) {
				int idx = (int)(Math.random() * question.length);
				char tmp = question[i];
				question[i] = question[idx];
				question[idx] = tmp;
			}
			
			System.out.printf("Q%d. %s의 정답을 입력하세요", i + 1, new String(question));
			String answer = scanner.nextLine();
			
			if (words[i].equals(answer.trim()))
				System.out.printf("맞았습니다%n%n");
			else
				System.out.printf("틀렸습니다%n%n");
		}
	}
}

