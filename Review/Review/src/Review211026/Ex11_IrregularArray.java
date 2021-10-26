package Review211026;
public class Ex11_IrregularArray {
	public static void main(String[] args) {
//		비정방형 배열
//		각 행의 열의 개수가 다른 배열
//		비정방형 배열 만들기
		int Array[][]= new int[4][];
		Array[0] = new int[3];
		Array[1] = new int[2];
		Array[2] = new int[3];
		Array[3] = new int[2];
//		new int 생성할때 맨 위에 행의 수를 적어주고
//		행마다 길이를 new int[길이]를 적어줘야 하는 것 같다
		
		for (int i=0; i<Array.length; i++) {
			for(int j=0; j<Array[i].length; j++) {
				Array[i][j] = (i+1)*10+j;
			}
		}
		
		for(int i=0; i<Array.length; i++) {
			for(int j=0; j<Array[i].length; j++) {
				System.out.print(Array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
