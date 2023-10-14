package Lec39;

public class Valid_Bst {
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
		public boolean isValidBST(TreeNode root) {
			return ValidBST(root).isbst;

		}

		public BstPair ValidBST(TreeNode root) {
			if (root == null) {
				return new BstPair();
			}

			BstPair lbstp = ValidBST(root.left);
			BstPair rbstp = ValidBST(root.right);
			long min = Math.min(lbstp.min, Math.min(rbstp.min, root.val));
			long max = Math.max(lbstp.max, Math.max(rbstp.max, root.val));
			boolean isbst = lbstp.isbst && rbstp.isbst && lbstp.max < root.val && rbstp.min > root.val;
			BstPair sbstp = new BstPair();
			sbstp.min = min;
			sbstp.max = max;
			sbstp.isbst = isbst;
			return sbstp;

		}
	}

	class BstPair {
		boolean isbst = true;
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;

	}
}
