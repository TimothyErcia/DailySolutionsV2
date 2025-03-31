/**
 * 110. Balance Binary Tree
 * Given a binary tree, determine if it is height-balanced.
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int treeTraversal(TreeNode root) {
        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;
        
        int left = 0, right = 0;
        if(leftNode != null) {
            left = treeTraversal(leftNode);
        }
        
        if(rightNode != null) {
            right = treeTraversal(rightNode);
        }

        System.out.println(left+" "+right);
        if(Math.abs(left - right) > 1) {
            //to check if either left or right node has more child node
            //height-balance is accepted if child nodes is less than equal to 1
            return -1;
        }

        //returns depth
        return Math.max(left, right)+1;
    }

    public boolean isBalanced(TreeNode root) {
        if(root != null) {
            int count = treeTraversal(root);
            if(count == -1) {
                return false;
            }
        }
        return true;
    }
}