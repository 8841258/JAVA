package co.friend.access;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.friend.model.Friend;

public class FriendList implements FriendAccess {
	ArrayList<Friend> friends; //ArrayList도 가능.
	String path = "d:/temp/friend.txt";
	
	//리스트는 인터페이스, new 키워드로 생성할 수 없다.
	public FriendList () {
		friends = new ArrayList<Friend>();
		open();
	}
	
	public void save() {
		try {
			BufferedWriter fw = new BufferedWriter(new FileWriter(path));
			for (Friend f : friends) {
				fw.write(String.format("%s,%s,%s\n", f.getGubun(), f.getName(), f.getTel()));
			}
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void open() {
		try {
			Scanner scanner = new Scanner(new File(path));
			while(true) {
				String str = scanner.next();
				if (str == null) break;
				String[] arr = str.split(",");
				friends.add(new Friend(arr[0], arr[1], arr[2]));
				
			}
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Override
	public void insert(Friend friend) {
		friends.add(friend);
		save();
		
	}

	@Override
	public void update(Friend friend) {
		 for (Friend f : friends) {
		 if (f.getName().equals(friend.getName())) {
		 f.setTel(friend.getTel());
		 save();
		 break;
		 }
		 }
		 
		
	}
		
	

	@Override
	public void delete(String name) {
		for (Friend f : friends) {
			if (f.getName().equals(name)) {   
			friends.remove(f);
			save();
			break;
			}
		}
		}
		
		

	@Override
	public ArrayList<Friend> selectAll() {
		return friends;
	}

	@Override
	public Friend selectOne(String name) {
		for (Friend f : friends) {
			if (f.getName().equals(name)) {   
				//equal은 완전 일치. contains는 포함. startWith ~로 시작하는 endWith ~로 끝나는
				return f;
			}
		}
		return null;
	}
	
	@Override
	public Friend findTel(String tel) {
		String result = null;
		for (Friend f : friends) {
			if (f.getName().equals(tel)) {
				return f;
			}
		}
		return null;
	}
	
	
	
	}

