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
    /**
      1.if the tree is empty return null
      2.initialized the queue and insert the root node
      3. while queue is not empty
          -remove the front node
          -Swap the left and right children
          -if the left child exists, add it to the queue
          -if right child exist add to the queue
      4.After all nodes are processed, return the root as the inverted tree.

      Tc- O(n)
      Sc- O(n)
    */
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            TreeNode temp=node.left;
            node.left=node.right;
            node.right=temp;
            if(node.left != null){
                queue.offer(node.left);
            }if(node.right !=null){
                queue.offer(node.right);
            }
        }
        return root;
    }
}
