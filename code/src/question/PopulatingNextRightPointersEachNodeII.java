package question;

import java.util.ArrayList;

public class PopulatingNextRightPointersEachNodeII {
	public void connect(TreeLinkNode root) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (root == null)
			return;
		ArrayList<TreeLinkNode> a = new ArrayList<TreeLinkNode>();
		a.add(root);
		int cur = 0;
		while (cur < a.size()) {
			int last = a.size();
			ArrayList<TreeLinkNode> layer = new ArrayList<TreeLinkNode>();
			while (cur < last) {
				TreeLinkNode t = a.get(cur);
				layer.add(t);
				if (t.left != null)
					a.add(t.left);
				if (t.right != null)
					a.add(t.right);
				cur++;
			}
			for (int i = 0; i < layer.size() - 1; i++) 
				layer.get(i).next = layer.get(i + 1);			
		}
	}
}
