package μμ;

public class DmbCellphoneTest {

	public static void main(String[] args) {
		DmbCellphone phone = new DmbCellphone();
		
		DmbCellphone dmbCellphone = new DmbCellphone("μΌμ±", "white", 7);
		
		dmbCellphone.powerOn();
		dmbCellphone.bell();
		dmbCellphone.turnOnDmb();
		dmbCellphone.ChangeChannel(8);
		dmbCellphone.turnOffDmb();
		dmbCellphone.powerOff();

	}

}
