package Lec38;

import Lec38.Diameter_of_Binary_Tree.TreeNode;

public class Balanced_Binary_Tree {
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
		public boolean isBalanced(TreeNode root) {
			if (root == null) {
				return true;
			}

			boolean left = isBalanced(root.left);
			boolean right = isBalanced(root.right);
			boolean self = Math.abs(ht(root.left) - ht(root.right)) <= 1;
			return left && right && self;

		}

		public int ht(TreeNode root) {
			if (root == null) {
				return -1;
			}

			int lh = ht(root.left);
			int rh = ht(root.right);
			return Math.max(lh, rh) + 1;

		}
	}
}
