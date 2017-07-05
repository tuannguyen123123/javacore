package threads;

public class RunnableDemo {

	public static void main(String args[]) {

		Thread55 thread55 = new Thread55();
		Thread thread = new Thread(thread55);
		Thread thread1 = new Thread(thread55);
		thread.setName("name 1");
		thread1.setName("name 2");
		thread.start();
		thread1.start();

	}
}

class Thread55 implements Runnable {
	private int MONEY = 1000;

	public synchronized void run() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(i);
				System.out.println(Thread.currentThread().getName() + " Thread 55   " + MONEY--);
				if (i == 9) {
					wait();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}

}
