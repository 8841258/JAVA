package co.yedam.emp;

public class Employee {
	int employeeId; //사번
	String name; //이름
	int departmentId; //부서번호
	String departmentName;
	int salary; //급여
	String email; //이메일
	

	Employee() {}
	
	Employee (int employeeId, String name) {
		this(employeeId, name, 0, 0, null);
	}
	
	Employee (int employeeId, String name, int departmentId, String email) {
		this(employeeId, name, 0, 0, email);
	}
	
	Employee (int employeeId, String name, int departmentId, int salary) {
		this(employeeId, name, departmentId, salary, null);
	}
	
	Employee (int employeeId, String name, int departmentId, int salary, String email) {
		this.employeeId = employeeId;
		this.name = name;
		
		if (departmentId == 0) {
			this.departmentId = 30;
		}
		
		if (departmentId == 10) {
			this.departmentName = "인사";
		} else if (departmentId == 20) {
			this.departmentName = "개발";
		} else {
			this.departmentName = "영업";
		}
		
		this.salary = salary;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", departmentId=" + departmentId
				+ ", departmentName=" + departmentName + ", salary=" + salary + ", email=" + email + "]";
	}


	
	
	
	
	
}
