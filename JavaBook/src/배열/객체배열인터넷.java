package 배열;

public class 객체배열인터넷 {
	private String studentID;
	private String studentName;
	private String studentGender;
	private double studentCredit;
	
	//생성자
	public 객체배열인터넷(String studentID, String studentName, String studentGender, double studentCredit) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentGender = studentGender;
		this.studentCredit = studentCredit;
	}

	//setter, getter
	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public double getStudentCredit() {
		return studentCredit;
	}

	public void setStudentCredit(double studentCredit) {
		this.studentCredit = studentCredit;
	}
	
	public void show() {
		System.out.println("학생 번호" + studentID);
		System.out.println("학생 이름" + studentName);
		System.out.println("학생 성별" + studentGender);
		System.out.println("학생 학점" + studentCredit);
	}

	@Override
	public String toString() {
		return "객체배열인터넷 [studentID=" + studentID + ", studentName=" + studentName + ", studentGender=" + studentGender
				+ ", studentCredit=" + studentCredit + "]";
	}
	
	
}
