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
    public static int ans =0;
    public void calc(TreeNode root, String curr) {
        if(root.left ==null && root.right==null){
            String copy= curr;
            curr+= String.valueOf(root.val);
            // System.out.println(curr);
            int val= Integer.parseInt(curr,2);
            ans+= val;
            curr= copy;
            return;
        }
        curr+= String.valueOf(root.val);
        
        if(root.left!=null)calc(root.left,curr);
        
        if(root.right!= null )calc(root.right,curr);
    }
    
    public int sumRootToLeaf(TreeNode root) {
        ans=0;
        calc(root,"");
        return ans;

    }
}