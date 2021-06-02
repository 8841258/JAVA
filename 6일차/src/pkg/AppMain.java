package pkg;

public class AppMain {

	public static void main(String[] args) {
		Count count1 = new Count();
		Count.cnt1++;
		//count1.cnt2++;
		
		Count count2 = new Count();
		Count.cnt1++;
		//count2.cnt2++;
		
		Count count3 = new Count();
		Count.cnt1++;
		//count3.cnt2++;
		
		//System.out.println(Count.cnt1 +" : " + count1.cnt2);
		//System.out.println(Count.cnt1 +" : " + count2.cnt2);
		//System.out.println(Count.cnt1 +" : " + count3.cnt2);
		
		
	}

}
