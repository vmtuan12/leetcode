// https://leetcode.com/problems/maximum-depth-of-binary-tree/description/

public class MaximumDepthOfBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public int maxDepth(TreeNode root) {
        return getDepth(root, 1);
    }

    public int getDepth(TreeNode node, int level) {
        if (node == null) {
            return level - 1;
        }

        int newLevel = level + 1;
        return Math.max(getDepth(node.left, newLevel), getDepth(node.right, newLevel));
    }

    public static void main(String[] args) {

    }
}
