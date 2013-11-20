package question;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreePreorderTravseral {
	public ArrayList<Integer> preorderTraversal(TreeNode root) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<Integer> res = new ArrayList<Integer>();
		Stack<TreeNode> s = new Stack<TreeNode>();
		if (root == null)
			return res;
		s.push(root);
		while (!s.isEmpty()) {
			TreeNode t = s.pop();
			res.add(t.val);
			if (t.right != null)
				s.push(t.right);
			if (t.left != null)
				s.push(t.left);
		}
		return res;
	}
}
