package sample_0407;

public class Television {
	int channel;
	int volume;
	boolean onOff;
	
	void pr() {
		System.out.println(channel+" "+ volume+" "+onOff);
	}
	
	int changeChannel(int ch){
		channel = ch;
		return channel;
	}
}
