package pkg.collect;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.sound.midi.SysexMessage;

import pkg.friend.CompanyFriend;
import pkg.friend.Friend;
import pkg.friend.SchoolFriend;

public class ListTest {

	public static void main(String[] args) {
		LinkedList<Friend> list = new LinkedList<Friend>();
		list.add(0, new CompanyFriend("디즈니회사", "피글렛", "010-1111-2222"));
		list.add(new SchoolFriend("디즈니학교", "미니마우스", "010-6729-1111"));
		
		//전체조회
		for ( Friend fr : list ) {
			System.out.println(fr.getName());
		}
		
		//삭제
//		list.remove(0);
//		for ( Friend fr : list ) {
//			System.out.println(fr.getName());
//		}
		
		
		
		//첫번째 이름
		System.out.println("첫번째 이름: " + list.get(0).getName());
		
		//마지막 이름
		System.out.println("마지막 이름: " + list.get(list.size()-1).getName());
		
		
		list.set(1, new Friend("디즈니학교", "티거", "010-222-1414"));
		for (Friend f : list) {
			System.out.println(f.getName());
		}
		
		
	}

}
