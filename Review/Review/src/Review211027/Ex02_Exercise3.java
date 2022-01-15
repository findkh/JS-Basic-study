package Review211027;

import java.util.Scanner;
public class Ex02_Exercise3 {
	public static void main(String[] args) {
//		단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 예제
		String words[] = {"KYOUNGHYUN", "LEGO", "JOHAFA", "JOGAHEE"};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			char[] question = words[i].toCharArray();
//			String을 char[]로 변환
			
			for(int j=0; j<question.length;j++) {
				int idx = (int)(Math.random()*question.length);
//				char로 변환한 단어들의 길이만큼의 배열의 번지수를 생성함
				char tmp = 0;
				tmp = question[i];
				question[i] = question[idx];
				question[idx] = tmp;				
			}
			
			System.out.printf("Q%d. %s의 정답을 입력하세요>", i+1, new String(question));
			
			String answer = scanner.nextLine();
			
//			trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
			if(words[i].equalsIgnoreCase(answer.trim())) //대소문자 무시하는 equalsIgnoreCase사용
				System.out.printf("맞았습니다.%n%n");
			else
				System.out.printf("틀렸습니다.%n%n");
		}
		scanner.close();
	}
}
