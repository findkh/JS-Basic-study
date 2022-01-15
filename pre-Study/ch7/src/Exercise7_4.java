class Mytv{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel; //이전 채널
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 0;
	
	public void setChannel(int channel) {
		if(channel<MIN_CHANNEL || channel >MAX_CHANNEL)
			return;
		
		prevChannel = this.channel; //현재 채널을 이전 채널에 저장
		this.channel = channel;
	}
	
	public void gotoPrevChannel() {
		setChannel(prevChannel);
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setVolume(int volume) {
		if(volume<MIN_VOLUME || volume > MAX_VOLUME)
			return;
		
		this.volume = volume;
	}
	
	public int getVolume() {
		return volume;
	}
}

public class Exercise7_4 {
	public static void main(String[] args) {
		Mytv t = new Mytv();
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setVolume(20);
		System.out.println("VOLUME:"+t.getVolume());
		t.setChannel(30);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
	}
}
