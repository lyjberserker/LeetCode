package question;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class PCModelB {
	public static void main(String[] args) {
		BlockingQueue<Integer> q = new ArrayBlockingQueue<Integer>(10);
		ProducerB p = new ProducerB(q);
		ConsumerB c = new ConsumerB(q);
		new Thread(p).start();
		new Thread(c).start();
	}
}

class ProducerB implements Runnable {
	private final BlockingQueue<Integer> queue;

	private Integer id = 1;

	public ProducerB(BlockingQueue<Integer> q) {
		queue = q;
	}

	public void run() {
		while (true) {
			try {
				System.out.println("生产了产品" + id);
				queue.put(id++);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

class ConsumerB implements Runnable {
	private final BlockingQueue<Integer> queue;

	public ConsumerB(BlockingQueue<Integer> q) {
		queue = q;
	}

	public void run() {
		while (true) {
			try {
				System.out.println("消费了产品" + queue.take());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}