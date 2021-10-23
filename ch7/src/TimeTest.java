class Time{
	private int hour; //0~23사이의 값을 가져야 함
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(hour<0 || hour>23) return;
		
		this.hour = hour;
	}
	
	public int getHour() { return hour; };
}
public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time();
//		t.hour = -100;
		t.setHour(21); //hour의 값을 21로 변경
		System.out.println(t.getHour());
		t.setHour(3);
		System.out.println(t.getHour());

	}

}
