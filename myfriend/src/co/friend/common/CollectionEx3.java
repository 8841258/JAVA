package co.friend.common;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import co.friend.model.Friend;

public class CollectionEx3 {


	
	
	
	public static void main(String[] args) {
		Map <String, Friend> map = new HashMap<>();
		
		map.put("반장", new Friend("1반", "티거", "1111"));
		map.put("평범", new Friend("1반", "피글렛", "2222"));
		map.put("선생님", new Friend("1반", "크리스토프", "3333"));
		map.put("반장", new Friend("1반", "가짜티거", "4444"));
		
		System.out.println(map.get("선생님"));
		
		Set<String> a = map.keySet();
		System.out.println(a);
		Iterator<String> iter = a.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			Friend val = map.get(key);
			System.out.println("key: " + key + ", value: " + val );
		}
		
		// Friend : key, Integer : value
		
		Map<Friend, Integer> scores = new HashMap<>();
		
		scores.put(new Friend("1반", "푸", "1111"), 20);
		scores.put(new Friend("1반", "티거", "4444"), 40);
		scores.put(new Friend("1반", "피글렛", "3333"), 60);
		scores.put(new Friend("1반", "이요르", "2222"), 70);
		
		Set<Entry<Friend, Integer>> ent = scores.entrySet();
		
		Iterator<Entry<Friend, Integer>> eiter = ent.iterator();
		
		while (eiter.hasNext()) {
			Entry<Friend, Integer> e = eiter.next();
			System.out.println(e.getKey() + ", " + e.getValue());
		}
		
		
		
		
		
		
	}

}
