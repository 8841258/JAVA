package com.yedam.common;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.yedam.Employee;
import com.yedam.PersonDAO;

public class EmployeeExample {

	public static void main(String[] args) {
		PersonDAO dao = new PersonDAO();
		ArrayList<Employee> employee = dao.getList();

		employee.stream()
			.filter(t -> Integer.parseInt(t.getBirthDate().substring(2, 4)) >= 70)
			.forEach( t -> System.out.println(t) );
		
			
		
		
	}

}
