package question;

import java.util.ArrayList;

public class PathSumII {
	public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		if (root != null)
			pathSum(res, ans, root, sum);
		return res;
	}

	public void pathSum(ArrayList<ArrayList<Integer>> res,
			ArrayList<Integer> ans, TreeNode root, int sum) {
		ans.add(root.val);
		sum -= root.val;
		if (root.right == null && root.left == null && sum == 0)
			res.add(ans);
		else {
			if (root.right != null)
				pathSum(res, new ArrayList<Integer>(ans), root.right, sum);
			if (root.left != null)
				pathSum(res, new ArrayList<Integer>(ans), root.left, sum);
		}
	}
}
