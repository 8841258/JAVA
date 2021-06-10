package com.yedam.common;

import java.util.List;
import java.util.OptionalDouble;
import java.util.function.ToIntFunction;

import com.yedam.Person;
import com.yedam.PersonDAO;

public class StreamExample {

	public static void main(String[] args) {
		List<Person> list = null;
		
		PersonDAO dao = new PersonDAO();
		list = dao.getPersonList();
		OptionalDouble avg = list.stream()  //스트림 생성.
		.filter(t -> t.getAge()> 20) //필터링
		.filter(t -> t.getId() > 900)
		//.forEach(t -> System.out.println(t));
		.mapToInt( p -> p.getAge() )
		.average();//나이 평균, 결과값은 OptionalDouble 타입으로 받는다.
		
		if (avg.isPresent()) {
		System.out.println("평균 나이는 " + avg.getAsDouble() + "입니다.");
		}
		else {
			System.out.println("만족하는 요소가 없습니다.");
		}
		
		Double sum = 0.0;
		PersonDAO dao2 = new PersonDAO();
		List<Person> list2 = dao.getPersonList();
		for (Person p : list2) {
			if (p.getAge() >20 && p.getId() >900) {
				sum += p.getAge();
			}
			else {
				sum = 0.0;
			}
		}
		Double avg2 = sum/list2.size();
		
		
		if (avg2 == 0.0) {
			System.out.println("출력된게 없습니다.");
		}
		else {
			System.out.println(avg2);
		}
		
		
	}

}
