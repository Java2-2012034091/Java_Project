package sample_0407;

public class Television {
	private int channel;
	private int volume;
	private boolean onOff;
	
	Television(int c, int v, boolean o) {
		channel = c;
		volume = v;
		onOff = o;
	}
	
	void print() {
		System.out.println("채널은 " + channel+"이고 볼륨은"+ volume + "입니다."+onOff);
	}
	
	int changeChannel(int ch){
		channel = ch;
		return channel;
	}
	
	public Television(){
		this.channel = 10;
		this.volume = 10;
		this.onOff = true;
	}
	
	
}
