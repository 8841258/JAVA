package co.yedam.emp;

import java.util.Scanner;

public class EmployeeApp {
	Scanner scanner = new Scanner(System.in);
	Employee[] arrays = new Employee[10];
	int cnt = 0;
	
	
	//사원 수 입력
	void init() {
		System.out.println("사원수 입력>");
		scanner.nextInt();
}
	
	void input() {
		System.out.print("사번>");
		int num = scanner.nextInt();
		System.out.print("이름>");
		String name = scanner.next();
		System.out.print("급여>");
		int salary = scanner.nextInt();
		arrays[cnt++] = new Employee(num, name, salary);
		
	}
	
	void print() {
		for (int i=0; i<cnt; i++) {
			System.out.println(arrays[i]);
	}
	}
	
	void search() {
		String name;
		System.out.print("검색할 사번>");
		int no = scanner.nextInt();
		for (int k=0; k<cnt; k++) {
			if (no == arrays[k].num) {
				name = arrays[k].name;
				System.out.println("이름은 "+ name);
			}
			else {
				System.out.println("일치하는 사번이 없습니다.");
			}
			}

			}
	
	int sum() {
		int sum = 0;
		for (int i=0; i<arrays.length; i++) {
			if (arrays[i] != null) {
				sum += arrays[i].salary;
			}
			
		}
		return sum;
	}





	
}