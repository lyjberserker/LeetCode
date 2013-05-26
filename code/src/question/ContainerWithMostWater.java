package question;

public class ContainerWithMostWater {
	public int maxArea(int[] height) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int max = 0;
		int i = 0;
		int j = height.length - 1;
		while (i < j) {
			int tmp = Math.min(height[i], height[j]) * (j - i);
			if (tmp > max)
				max = tmp;
			if (height[i] > height[j])
				j--;
			else
				i++;
		}
		return max;
	}
}
