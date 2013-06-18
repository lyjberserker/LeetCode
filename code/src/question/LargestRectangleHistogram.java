package question;

import java.util.Stack;

public class LargestRectangleHistogram {
	public int largestRectangleArea(int[] height) {
		// Start typing your Java solution below
		// DO NOT write main() function
		Stack<Integer> s = new Stack<Integer>();
		int max = 0;
		int[] h = new int[height.length + 1];
		for (int i = 0; i < height.length; i++)
			h[i] = height[i];
		h[height.length] = 0;
		for (int i = 0; i < h.length; i++) {
			if (s.isEmpty() || h[i] > h[s.peek()])
				s.push(i);
			else {
				int tmp = s.pop();
				max = Math.max(max, h[tmp]
						* (s.isEmpty() ? i : i - s.peek() - 1));
				i--;
			}
		}
		return max;
	}

	public int largestRectangleArea2(int[] height) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int b = 0;
		int max = 0;
		while (b < height.length) {
			int e = height.length - 1;
			for (int i = b + 1; i <= e; i++)
				if (height[i] < height[i - 1]) {
					e = i - 1;
					break;
				}
			int min = height[e];
			for (int i = e; i >= 0; i--) {
				min = Math.min(min, height[i]);
				int area = min * (e - i + 1);
				max = Math.max(max, area);
			}
			b = e + 1;
		}
		return max;
	}
}
