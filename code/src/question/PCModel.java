package question;

import java.util.ArrayList;
import java.util.List;

public class PCModel {
	public static void main(String[] args) {
		Storage s = new Storage();
		Producer p = new Producer(s);
		Consumer c = new Consumer(s);
		new Thread(p).start();
		new Thread(c).start();
	}
}

class Producer implements Runnable {
	private Storage storage;

	private Integer id = 1;

	public Producer(Storage s) {
		storage = s;
	}

	public void run() {
		while (true) {
			try {
				System.out.println("生产了产品" + id);
				storage.put(id++);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable {
	private Storage storage;

	public Consumer(Storage s) {
		storage = s;
	}

	public void run() {
		while (true) {
			try {
				System.out.println("消费了产品" + storage.take());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Storage {
	List<Integer> list = new ArrayList<Integer>();

	public synchronized Integer take() {
		while (list.isEmpty())
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		Integer i = list.get(0);
		list.remove(i);
		notify();
		return i;
	}

	public synchronized void put(Integer i) {
		while (!list.isEmpty())
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		list.add(i);
		notify();
	}

}
