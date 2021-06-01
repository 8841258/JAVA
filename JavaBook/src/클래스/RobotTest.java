package 클래스;

public class RobotTest {

	public static void main(String[] args) {
		Robot robot0 = new Robot();

		Robot robot = new Robot(2, 2);

		System.out.println(robot.getArm());
		System.out.println(robot.getLeg());
		robot0.print();
		System.out.println();
		robot.print();
		System.out.println();
		Robot robot1 = new Robot("푸");
		System.out.println(robot1.getName());
		
		robot1.setName("티거");
		System.out.println(robot1.getName());
	}

}
