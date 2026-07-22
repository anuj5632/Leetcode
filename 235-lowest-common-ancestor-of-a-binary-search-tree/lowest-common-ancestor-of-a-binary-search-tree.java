/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        TreeNode curr1 = root;
        while(curr1 != null){
            if(p.val > curr1.val && q.val > curr1.val){
                curr1 = curr1.right;
            }
            else if(p.val < curr1.val && q.val < curr1.val){
                curr1 = curr1.left;
            }
            else{
                return curr1;
            }
        }
        return null;
    }
}