package question;

import java.util.ArrayList;
import java.util.Collections;

public class BinaryTreeZigzagLevelOrderTraversal {
	public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if (root == null)
			return res;
		ArrayList<TreeNode> a = new ArrayList<TreeNode>();
		a.add(root);
		int cur = 0;
		int b = 1;
		while (cur < a.size()) {
			int last = a.size();
			ArrayList<Integer> level = new ArrayList<Integer>();
			while (cur < last) {
				TreeNode t = a.get(cur);
				level.add(t.val);
				if (t.left != null)
					a.add(t.left);
				if (t.right != null)
					a.add(t.right);
				cur++;
			}
			if (level.isEmpty())
				break;
			else {
				if (b < 0)
					Collections.reverse(level);
				b = -b;
				res.add(level);
			}
		}
		return res;
	}
}
