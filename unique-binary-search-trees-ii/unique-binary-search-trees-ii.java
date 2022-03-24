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
    public List<TreeNode> generateTrees(int n) {
        if(n==0) return new LinkedList<TreeNode>();
        else{
            return constructTrees(1,n);
        }
        
    }
    private LinkedList<TreeNode> constructTrees(int start, int end) {
        LinkedList<TreeNode> allTrees = new LinkedList<>();
        if(start>end){
            allTrees.add(null);
            return allTrees;
        }
        for(int i=start; i<=end; i++){
            //choose each i as root

            //all left trees
            LinkedList<TreeNode> leftTrees = constructTrees(start, i-1);
            //all right trees
            LinkedList<TreeNode> rightTrees = constructTrees(i+1, end);

            //connect left and right trees to the root
            for(TreeNode l: leftTrees){
                for(TreeNode r: rightTrees){
                    TreeNode currentTreeNode = new TreeNode(i);
                    currentTreeNode.left = l;
                    currentTreeNode.right = r;
                    allTrees.add(currentTreeNode);
                }
            }
        }
        return allTrees;
    }
    
}