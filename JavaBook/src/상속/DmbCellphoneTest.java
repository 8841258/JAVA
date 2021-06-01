package 상속;

public class DmbCellphoneTest {

	public static void main(String[] args) {
		DmbCellphone phone = new DmbCellphone();
		
		DmbCellphone dmbCellphone = new DmbCellphone("삼성", "white", 7);
		
		dmbCellphone.powerOn();
		dmbCellphone.bell();
		dmbCellphone.turnOnDmb();
		dmbCellphone.ChangeChannel(8);
		dmbCellphone.turnOffDmb();
		dmbCellphone.powerOff();

	}

}
