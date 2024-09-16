package easy;// https://leetcode.com/problems/binary-tree-inorder-traversal/description/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BinaryTreeInorderTraversal {
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

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        if (root.left != null) {
            list = Stream.concat(list.stream(), inorderTraversal(root.left).stream())
                    .collect(Collectors.toList());
        }
        list.add(root.val);
        if (root.right != null) {
            list = Stream.concat(list.stream(), inorderTraversal(root.right).stream())
                    .collect(Collectors.toList());
        }

        return list;
    }

    public static void main(String[] args) {

    }
}
