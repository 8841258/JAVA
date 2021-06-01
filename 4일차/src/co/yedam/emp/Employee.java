package co.yedam.emp;

public class Employee {
	int num;
	String name;
	int salary;
	
	Employee(int num, String name, int salary) {
		this.num = num;
		this.name = name;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Employee [num=" + num + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
