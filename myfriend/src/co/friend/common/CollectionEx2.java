package co.friend.common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import co.friend.access.FriendAccess;
import co.friend.access.FriendDAO;
import co.friend.model.Friend;

public class CollectionEx2 {

	public static void main(String[] args) {
		//p568~570
		
		System.out.println("Hello".hashCode());
		System.out.println("Hello".hashCode());
		System.out.println("Hi".hashCode());
		
		
		FriendAccess fa = new FriendDAO();
		Set<Friend> set = new HashSet<>();
		
		ArrayList<Friend> list = fa.selectAll();
		
		for (int i=0; i<list.size(); i++) {
			set.add(list.get(i));
			System.out.println(list.get(i));
		}

		System.out.println("<set>");
		
		for (Friend ff : set) {
			System.out.println(ff);
		}
		
		

	}

}
