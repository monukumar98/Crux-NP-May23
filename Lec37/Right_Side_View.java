package Lec37;

import java.util.ArrayList;
import java.util.List;

public class Right_Side_View {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		int maxLevel = 0;

		public List<Integer> rightSideView(TreeNode root) {
			List<Integer> ll = new ArrayList<>();
			rightView(root, 1, ll);
			return ll;
		}

		public void rightView(TreeNode root, int curr_level, List<Integer> ll) {
			if (root == null) {
				return;
			}
			if (curr_level > maxLevel) {
				ll.add(root.val);
				maxLevel = curr_level;
			}

			rightView(root.right, curr_level + 1, ll);
			rightView(root.left, curr_level + 1, ll);

		}

	}
}
