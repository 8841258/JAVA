package 쓰레드;

public class Print10000 implements Runnable {

	@Override
	public void run() {
		for (int i=10000; i<10101; i++) {
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
