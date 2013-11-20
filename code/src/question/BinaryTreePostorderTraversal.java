package question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class BinaryTreePostorderTraversal {
	public ArrayList<Integer> postorderTraversal(TreeNode root) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<Integer> res = new ArrayList<Integer>();
		Stack<TreeNode> s = new Stack<TreeNode>();
		if (root == null)
			return res;
		TreeNode t = root;
		while (!s.isEmpty() || t != null) {
			if (t != null) {
				res.add(t.val);
				s.push(t);
				t = t.right;
			} else {
				t = s.pop();
				t = t.left;
			}
		}
		Collections.reverse(res);
		return res;
	}
}
