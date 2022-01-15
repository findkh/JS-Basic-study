abstract class Unit2{
	int x, y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다");}
}

interface Fightable{
	void move(int x, int y); //public abstract 생략됨
	void attack(Fightable f);//public abstract 생략됨
}

class Fighter extends Unit2 implements Fightable{
	//오버라이딩 규칙 : 조상보다 접근 제어자가 좁으면 안된다
	public void move(int x, int y) {
		System.out.println("[" + x +","+y+ "]로 이동");
	}
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
	}
}

public class FighterTest {
	public static void main(String[] args) {
		Fightable f = new Fighter(); 
		
		Unit2 u = new Fighter(); 
		u.move(100, 200);
//		u.attack(New Fighter()); //Unit2에는 attack()이 없어서 호출불가
		u.stop();
		
		f.move(100, 200);
		f.attack(new Fighter());
//		f.stop(); //Fightable에는 stop()이 없어서 호출불가
	}
}


