package sample_0407;

public class TelevisionTest {

	public static void main(String[] args) {
		Television tv = new Television();
		tv.setChannel(11);
		int ch = tv.getChannel();
		System.out.println(ch);
				
		/*Television myTv = new Television(7, 10, true);
		myTv.print();
		Television yourTv = new Television(11, 20, true);
		yourTv.print();
	
		Television myTV = new Television();
		myTV.channel = 18;
		myTV.volume = 12;
		myTV.onOff = true;
		
		Television testTV = new Television();
		testTV = myTV;
		testTV.channel = 536;
		
		myTV.pr();
		
		Television yourTV = new Television();
		yourTV.channel = 18;
		yourTV.volume = 12;
		yourTV.onOff = true;
		
		System.out.println("current channel :" + yourTV.changeChannel(24));
		
		yourTV.pr();
			*/
	}
}
