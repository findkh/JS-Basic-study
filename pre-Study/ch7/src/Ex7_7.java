public class Ex7_7 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine(); //FireEngine객체를 생성
		FireEngine fe2 = null;

		fe.water();
		car = fe; //부모로 형변환 fe의 값을 car에 저장 형변환 생략됨
		fe2 = (FireEngine)car; //부모가 자식으로 형변환 생략불가
		fe2.water();
	}
}

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("dirve~~");
	}
	
	void stop() {
		System.out.println("stop!");
	}
}

class FireEngine extends Car { //car부모로부터 상속받은 FireEngine
	void water() {
		System.out.println("water~~~~");
	}
}
