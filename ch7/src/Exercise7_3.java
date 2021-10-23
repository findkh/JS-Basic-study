class Product5{
	int price;
	int bonusPoint;
	
	Product5(){}
	
	Product5(int price){
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
}

class Tv5 extends Product5 {
	Tv5(){}
	
	public String toString() {
		return "Tv5";
	}
}

public class Exercise7_3 {
	public static void main(String[] args) {
		Tv5 t = new Tv5();
	}
}
/*product클래스에 기본 생성자 Product()가 없어 에러가 발생 */