package com.yedam.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import com.yedam.Person;
import com.yedam.PersonDAO;

public class IteratorExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hong", "Park", "Choi"); //list.add 3줄반복 대신에 이렇게.
		
		Iterator<String> it = list.iterator(); //리스트 안에 있는 요소를 반복
		while (it.hasNext()) {
			String lastName = it.next();
			System.out.println(lastName.toUpperCase());
		}
		
		// stream 사용.
		System.out.println("<Stream>");
		Stream<String> stream = list.stream();
		stream.forEach(new Consumer<String>() {
			
			public void accept(String t) {
				System.out.println(t);
			}
			
		}
				);
		
		
		
		PersonDAO dao = new PersonDAO();
		ArrayList<Person> persons = dao.getPersonList();
		Stream <Person> pStream = persons.stream();
		
		long c = pStream/*.filter( (t) -> t.getAge() < 10 )//return 값이 true인 요소들만 통과. 필터.걸러준다.
		       .filter( (t) -> t.getName().startsWith("윤") )
			   .forEach( (t) -> System.out.println(t) );*/
			   .count();
		//stream은 병렬 처리가 가능하다. 코드가 훨씬 깔끔해진다.
		//filter의 predicate, forEach의 customer 모두 인터페이스이기 때문에
		//위처럼 매개변수로 올 경우 그 안에 반드시 구현을 해야 한다. 
		//원래라면 구현 클래스를 만들어야 하지만, 어차피 한 번만 쓰이므로 바로 익명 객체로 만들어서 구현.
		//그리고 거기에 람다식을 씀. 람다식을 쓰려면 인터페이스 추상메소드가 단 1개 뿐이어야 한다.

		System.out.println("최종 처리 건수 : " + c);
		
		
		
	}

}
