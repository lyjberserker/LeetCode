package question;

import java.util.ArrayList;

public class UniqueBinarySearchTreesII {
	public ArrayList<TreeNode> generateTrees(int n) {
		// Start typing your Java solution below
		// DO NOT write main() function
		return generateTrees(1, n);
	}

	public ArrayList<TreeNode> generateTrees(int b, int e) {
		// TODO Auto-generated method stub
		ArrayList<TreeNode> res = new ArrayList<TreeNode>();
		if (b > e)
			res.add(null);
		else if (b == e)
			res.add(new TreeNode(b));
		else
			for (int i = b; i <= e; i++) {
				ArrayList<TreeNode> left = generateTrees(b, i - 1);
				ArrayList<TreeNode> right = generateTrees(i + 1, e);
				for (TreeNode tL : left)
					for (TreeNode tR : right) {
						TreeNode t = new TreeNode(i);
						t.left = tL;
						t.right = tR;
						res.add(t);
					}
			}
		return res;
	}
}
