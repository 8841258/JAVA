package co.yedam.emp;

public class EmployeeExample {

	public static void main(String[] args) {
		Employee emp0 = new Employee();
		System.out.println(emp0);
		
		Employee emp1 = new Employee(100, "홍길동");
		System.out.println(emp1);
		
		Employee emp2 = new Employee(101, "김유신", 50, "a@a.c");
		System.out.println(emp2);
		
		Employee emp3 = new Employee(102, "유관순", 20, 2500);
		System.out.println(emp3);
		
		Employee emp4 = new Employee(103, "윤지민", 10,  2800, "8841258@naver.com");
		System.out.println(emp4);
	}

}
