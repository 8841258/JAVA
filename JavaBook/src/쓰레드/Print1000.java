package 쓰레드;

public class Print1000 implements Runnable{

	public void run() {
		for (int i=1000; i<1101; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}