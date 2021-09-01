
public class Exercise6_1 {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름:" + s.name);
		System.out.println("총점:" + s.getTotal());
		System.out.println("평균:" + s.getAverage());
	}
}

class Student{ 
	//맴버변수 타입 정의 
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;		
	
	Student(){} //기본생성자 형식 : 클래스이름(){}
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		//this.name은 인스턴스변수 , name은 지역변수
		//this 인스턴스 자신을 가르키는 참조변수다.
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		return (int)(getTotal()/3f*10+0.5f)/10f;
	}
}
