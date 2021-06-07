package wrapper;

import java.util.ArrayList;

public class WrapperTest {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(100);    //Integer객체로 자동 박싱
		
		Integer a = 100;
		int b = a.intValue(); //언박싱
		b = a;                //자동 언박싱
		
		String s = Integer.toString(a);   //int -> String
	}

}
