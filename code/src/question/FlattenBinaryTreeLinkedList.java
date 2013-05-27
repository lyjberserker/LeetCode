package question;

import java.util.Stack;

public class FlattenBinaryTreeLinkedList {
	public void flatten(TreeNode root) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (root == null)
			return;
		TreeNode pre = new TreeNode(-1);
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);
		while (!s.isEmpty()) {
			TreeNode t = s.pop();
			if (t.right != null)
				s.push(t.right);
			if (t.left != null)
				s.push(t.left);
			t.left = null;
			pre.right = t;
			pre = pre.right;
		}
	}
}
