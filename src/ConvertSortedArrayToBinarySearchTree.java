import java.util.Arrays;

// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/

public class ConvertSortedArrayToBinarySearchTree {
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

    public TreeNode sortedArrayToBST(int[] nums) {
        return formTreeNode(nums);
    }

    public TreeNode formTreeNode(int[] nums) {
        int numLen = nums.length;

        TreeNode root = null;
        if (numLen == 0) {
            return root;
        }
        if (numLen == 1) {
            return new TreeNode(nums[0]);
        }

        if (numLen % 2 == 0) {
            root = new TreeNode(nums[(numLen / 2) - 1]);
            root.left = formTreeNode(Arrays.copyOfRange(nums, 0, (numLen / 2) - 1));
            root.right = formTreeNode(Arrays.copyOfRange(nums, numLen / 2, numLen));
        } else {
            root = new TreeNode(nums[numLen / 2]);
            root.left = formTreeNode(Arrays.copyOfRange(nums, 0, numLen / 2));
            root.right = formTreeNode(Arrays.copyOfRange(nums, (numLen / 2) + 1, numLen));
        }

        return root;
    }
}
