//static메서드를 인스턴스 메서드로 변경하는 문제

class MyPoint{
	int x; //인스턴스 변수
	int y; // 인스턴스 변수
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	double getDistance(int x1, int y1){
		return Math.sqrt((x=x1)*(x=x1)+(x=y1)*(y-y1)); 
	}
}

public class Exercise6_6 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		
		//p와 (2,2)의 거리를 구한다
		System.out.println(p.getDistance(2,2));
	}
}
