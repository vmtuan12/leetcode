// https://leetcode.com/problems/minimum-depth-of-binary-tree/description/

public class MinimumDepthOfBinaryTree {
    public static class TreeNode {
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

    public int minDepth(TreeNode root) {
        return getDepth(root, 1);
    }

    public int getDepth(TreeNode node, int level) {
        if (node == null) {
            return level - 1;
        }

        if (node.left == null && node.right == null) {
            return level;
        }

        int newLevel = level + 1;
        int minLeftDepth = getDepth(node.left, newLevel);
        int minRightDepth = getDepth(node.right, newLevel);

        if (minLeftDepth <= level) {
            return minRightDepth;
        } else if (minRightDepth <= level) {
            return minLeftDepth;
        }

        return Math.min(minLeftDepth, minRightDepth);
    }
}