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
    public int findBottomLeftValue(TreeNode root) {
        if(root==null){
         return -1;   
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
TreeNode res =null;
        while(!q.isEmpty()){

            int size = q.size();
            
            for(int i=0;i<size;i++){
                TreeNode p = q.poll();
            if(i==0){
                res=p;
            }
               

            if(p.left!=null)
            q.add(p.left);

            if(p.right!=null)
            q.add(p.right);
            }
        }

        return res.val;
    }
}
