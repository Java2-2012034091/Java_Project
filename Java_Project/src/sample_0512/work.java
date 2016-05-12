package sample_0512;

public class work {

	int value;
	int value2;
	
	void inc(int a) {
			a = a+1;
	}
	
	void inc(work ctr) {
		ctr.value = ctr.value + 1 ;
	}
	
	void inc(int[] array) {
		for(int i = 0; i<array.length; i++)
			array[i] = array[i] +1;
		
	}
}


