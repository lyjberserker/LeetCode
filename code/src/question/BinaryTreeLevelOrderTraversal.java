package question;

import java.util.ArrayList;

public class BinaryTreeLevelOrderTraversal {
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if (root == null)
			return res;
		ArrayList<TreeNode> a = new ArrayList<TreeNode>();
		a.add(root);
		int cur = 0;
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
			else
				res.add(level);
		}
		return res;
	}
}
