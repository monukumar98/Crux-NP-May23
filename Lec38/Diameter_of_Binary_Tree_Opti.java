package Lec38;

public class Diameter_of_Binary_Tree_Opti {
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
		public int diameterOfBinaryTree(TreeNode root) {
			return diameter(root).dia;
		}

		public DiaPair diameter(TreeNode root) {
			if (root == null) {
				return new DiaPair();
			}
			DiaPair ldp = diameter(root.left);// (h,d)
			DiaPair rdp = diameter(root.right);// (h,d)
			int sd = ldp.ht + rdp.ht + 2;// khud se pass hone wala diameter
			DiaPair sdp = new DiaPair();
			sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;
			sdp.dia = Math.max(sd, Math.max(rdp.dia, ldp.dia));
			return sdp;

		}

	}

	class DiaPair {
		int ht = -1;
		int dia = 0;
	}

}
