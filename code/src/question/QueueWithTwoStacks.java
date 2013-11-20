package question;

import java.util.Stack;

public class QueueWithTwoStacks {
	private Stack<Integer> s1 = new Stack<Integer>();

	private Stack<Integer> s2 = new Stack<Integer>();

	public void enqueue(int v) {
		s1.push(v);
	}

	public Integer dequeue() {
		if (!s2.isEmpty())
			return s2.pop();
		while (!s1.isEmpty())
			s2.push(s1.pop());
		return s2.pop();
	}
}
