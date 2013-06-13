package question;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (root == null)
			return true;
		Queue<TreeNode> lq = new LinkedList<TreeNode>();
		Queue<TreeNode> rq = new LinkedList<TreeNode>();
		lq.add(root.left);
		rq.add(root.right);
		while (!lq.isEmpty() && !rq.isEmpty()) {
			TreeNode l = lq.poll();
			TreeNode r = rq.poll();
			if (l == null && r == null)
				continue;
			if (l == null || r == null)
				return false;
			if (l.val != r.val)
				return false;
			lq.add(l.left);
			lq.add(l.right);
			rq.add(r.right);
			rq.add(r.left);
		}
		return true;
	}

	public boolean isSymmetric2(TreeNode root) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (root == null)
			return true;
		return isSymmetric2(root.left, root.right);
	}

	private boolean isSymmetric2(TreeNode a, TreeNode b) {
		if (a == null && b == null)
			return true;
		if (a == null || b == null)
			return false;
		if (a.val != b.val)
			return false;
		if (!isSymmetric2(a.left, b.right))
			return false;
		if (!isSymmetric2(a.right, b.left))
			return false;
		return true;
	}
}
