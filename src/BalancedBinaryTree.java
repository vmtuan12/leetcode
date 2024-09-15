// https://leetcode.com/problems/balanced-binary-tree/description/

public class BalancedBinaryTree {
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

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int leftDepth = getDepth(root.left, 1);
        int rightDepth = getDepth(root.right, 1);


        if (leftDepth == -1 || rightDepth == -1) {
            return false;
        }

        return Math.abs(leftDepth - rightDepth) <= 1;
    }

    public int getDepth(TreeNode node, int level) {
        if (node == null) {
            return level - 1;
        }

        int newLevel = level + 1;
        int leftDepth = getDepth(node.left, newLevel);
        int rightDepth = getDepth(node.right, newLevel);

        if (leftDepth == -1 || rightDepth == -1 || Math.abs(leftDepth - rightDepth) > 1) {
            return -1;
        }

        return Math.max(getDepth(node.left, newLevel), getDepth(node.right, newLevel));
    }

    public static void main(String[] args) {

    }
}