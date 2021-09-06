class Tv{ //부모 멤버 5개
	boolean power;
	int channel;
	
	void power() 		{		power = !power; }
	void channelup()		{		++channel;		}
	void channelDown()	{		--channel;		}
}

class SmartTv extends Tv{ //자식 멤버 2개 + 부모 멤버5개 총 7개
	boolean caption;
	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}


public class Ex7_1 {
	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;	//조상으로 상속 받은 멤버
		stv.channelup();	// 조상으로 상속 받은 멤버
		System.out.println(stv.channel);
		stv.displayCaption("Hello, world");
		stv.caption = true;
		stv.displayCaption("Hello, world");

	}

}
