package sample_0407;

public class Television {
	int channel;
	int volume;
	boolean onOff;
	
	/*Television(int c, int v, boolean o) {
		channel = c;
		volume = v;
		onOff = o;
	}
	
	void print() {
		System.out.println("채널은 " + channel+"이고 볼륨은"+ volume + "입니다."+onOff);
	}*/
	
	int getChannel(){
		return channel;
		
	}
	
	void setChannel(int ch) {
		channel = ch;
	}
	
	/*public Television(){
		this.channel = 10;
		this.volume = 10;
		this.onOff = true;
	}*/
	
	
}
