package 클래스;

public class RobotTest {
	public static void change(int a) {
		a += 10;
	}
	
	public static void change(Robot robot) {
		robot.setArm(5);
	}
	
	
	
	public static void main(String[] args) {
		Robot r = new Robot(2,4);
		change(r);
		r.getArm();
	}

}
