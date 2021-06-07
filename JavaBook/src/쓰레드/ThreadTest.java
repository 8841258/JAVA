package 쓰레드;

public class ThreadTest {

	public static void main(String[] args) {

		Thread thread1 = new Thread(new Print10000());
		thread1.start();

		Thread thread2 = new Thread(new Print1000());
		thread2.start();

		// 익명 객체
		Thread thread3 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 2000; i < 2101; i++) {
					System.out.println(i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		});
		thread3.start();

		// 람다식 : 익명 객체 -> 구현 클래스 구현 메서드가 1개 뿐일때
		Thread thread4 = new Thread(() -> {
			for (int i = 3000; i < 3101; i++) {
				System.out.println(i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		thread4.start();
	}

}
