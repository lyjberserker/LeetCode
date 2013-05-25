package question;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
	public ArrayList<Integer> inorderTraversal(TreeNode root) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<Integer> res = new ArrayList<Integer>();
		Stack<TreeNode> s = new Stack<TreeNode>();
		if (root == null)
			return res;
		TreeNode t = root;
		while (!s.isEmpty() || t != null) {
			if (t != null) {
				s.push(t);
				t = t.left;
			} else {
				t = s.pop();
				res.add(t.val);
				t = t.right;
			}
		}
		return res;
	}
}
