package threads;

public class ThreadsDemo extends Thread {

	public synchronized void run() {
		int NUMBER = 1000;
		int count = 0;
		while (count < 10) {
			try {
				Thread.sleep(100);
				System.out.println(Thread.currentThread().getName() + "    " + count + "    " + NUMBER--);
				count++;

			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}

			// if (count == 10) {
			//
			// Thread.interrupted();
			//
			// }

		}

	}

	public static void main(String args[]) throws InterruptedException {
		ThreadsDemo threadsDemo = new ThreadsDemo();
		ThreadsDemo threadsDemo2 = new ThreadsDemo();
		ThreadsDemo threadsDemo3 = new ThreadsDemo();
		System.out.println("check thread" + threadsDemo.isAlive());
		
		Thread  thread = new Thread(threadsDemo);
		Thread  thread2 = new Thread(threadsDemo);
		thread.start();
		thread2.start();
		

		// threadsDemo.join();
		// threadsDemo2.join();
	}

}
