package sample_0519;

public class Class_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_object[] pob = new P_object[3];
		pob[0] = new P_object();
		pob[1] = new C1_object();
		pob[2] = new C2_object();
		
		pr_all(pob[0]);
		pr_all(pob[1]);
		pr_all(pob[2]);
		
//		P_object po1 = new P_object();
//		C1_object co1 = new C1_object();
//		C2_object co2 = new C2_object();
		pob[0].pr();
		pob[1].pr();
		pob[2].pr();
		
//		pr_all(po1);
//		pr_all(co1);
//		pr_all(co2);
		
		/*for(P_object temp : pob){
			temp = new P_object();
			pr_all(temp);
			change_all(temp, 7, 77);
			pr_all(temp);
		}*/
		
	} // P_pbject temp = co1;

	
	public static void pr_all(P_object temp)	{
		temp.pr();
	}
	
	public static void change_all(P_object temp, int x, int y) {
		temp.change(x,y);
	}
	
}
