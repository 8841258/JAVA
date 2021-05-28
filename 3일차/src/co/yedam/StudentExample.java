package co.yedam;

public class StudentExample {

	public static void main(String[] args) {
		StudentApp app = new StudentApp();
		Student student = app.createStudent();
		student.print();

	}

}
