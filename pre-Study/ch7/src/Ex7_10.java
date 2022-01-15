public class Ex7_10 {
	public static void main(String[] args) {
		Unit[] group = {new Marine(), new Tank(), new Dropship()};
		
		for (int i = 0; i < group.length; i++)
			group[i].move(100, 200);
		//unit배열의 모든 유닛을 좌표(100,200) 위치로 이동시킨다
	}
}

abstract class Unit{ //공통된 부분 추출하여 Unit클래스로 정의
	int x, y;
	abstract void move(int x, int y);
	void stop() {  /*현재 위치에 저장 */ }
}

class Marine extends Unit{
	void move(int x, int y) {
		System.out.println("Marine[=x" + x + ",y=" + y + "]");
	}
	void stimPack() {  /*스팀팩을 사용한다 */  }
}

class Tank extends Unit{
	void move(int x, int y) {
		System.out.println("Tank[=x" + x + ",y=" + y + "]");
	}
	void changeMode() {  /*공격모드를 변환하다*/  }
}

class Dropship extends Unit{
	void move(int x, int y) {
		System.out.println("Dropship[=x" + x + ",y=" + y + "]");
	}
	void load() {  /*태운다 */  }
	void unload() {  /*태운다 */  }
}

