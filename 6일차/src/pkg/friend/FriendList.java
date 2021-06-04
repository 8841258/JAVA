package pkg.friend;

import java.util.ArrayList;
import java.util.List;

public class FriendList implements FriendAccess {
	List<Friend> friends; //ArrayList도 가능.

	//리스트는 인터페이스, new 키워드로 생성할 수 없다.
	public FriendList () {
		friends = new ArrayList<Friend>();
	}
	
	
	
	@Override
	public void insert(Friend friend) {
		friends.add(friend);
		
	}

	@Override
	public void update(int idx, Friend friend) {
		friends.set(idx, friend);
	}
		
	

	@Override
	public void delete(String name) {
		for (Friend f : friends) {
			if (f.getName().equals(name)) {   
			friends.remove(f);
			break;
			}
		}
		}
		
		

	@Override
	public void selectAll() {
		for (Friend f : friends) {
			System.out.println(f);
		}
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
	
	
	
	}

