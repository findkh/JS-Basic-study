class Outer{
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner{
		int iiv = outerIv; //외부클래스의 private멤버도 접근가능하다
	}
	
	static class StaticInner{
		static int scv = outerCv;
		//스태틱 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없다
	}
	
	void myMethod() {
		int lv = 0; //지역변수
		/*final*/ int LV = 0; //jdk1.8부터 final생략 가능
		
		class LocalInner{
			int liv = outerIv;
			int liv2 = outerCv;
//			int liv3 = Iv;
			int liv4 = LV;
		}
	}
}

