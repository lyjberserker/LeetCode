package question;

import java.util.ArrayList;
import java.util.Collections;

public class RecoverBinarySearchTree {
	private TreeNode t1;
	private TreeNode t2;
	private TreeNode pre;

	public void recoverTree(TreeNode root) {
		// Start typing your Java solution below
		// DO NOT write main() function
		t1 = null;
		t2 = null;
		pre = null;
		inOrderTraversal(root);
		int tmp = t1.val;
		t1.val = t2.val;
		t2.val = tmp;
	}

	public void inOrderTraversal(TreeNode root) {
		if (root == null)
			return;
		inOrderTraversal(root.left);
		if (pre == null)
			pre = root;
		else {
			if (pre.val > root.val) {
				if (t1 == null)
					t1 = pre;
				t2 = root;
			}
			pre = root;
		}
		inOrderTraversal(root.right);
	}

	public void recoverTree2(TreeNode root) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<TreeNode> treeList = new ArrayList<TreeNode>();
		ArrayList<Integer> valList = new ArrayList<Integer>();
		inOrderTraversal2(root, treeList, valList);
		Collections.sort(valList);
		for (int i = 0; i < treeList.size(); i++)
			treeList.get(i).val = valList.get(i);
	}

	public void inOrderTraversal2(TreeNode root, ArrayList<TreeNode> treeList,
			ArrayList<Integer> valList) {
		if (root == null)
			return;
		inOrderTraversal2(root.left, treeList, valList);
		treeList.add(root);
		valList.add(root.val);
		inOrderTraversal2(root.right, treeList, valList);
	}
}
