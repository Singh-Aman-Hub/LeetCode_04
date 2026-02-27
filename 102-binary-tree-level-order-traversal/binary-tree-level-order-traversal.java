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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue= new LinkedList<>();
        List<List<Integer>> list= new ArrayList<>();
        if(root==null)return list;
        queue.add(root);
            
            while(queue.size()>0){
                int denom= queue.size();
                List<Integer> inlist= new ArrayList<>(); 
                for(int i=0;i<denom;i++){
                    TreeNode node= queue.poll();
                    inlist.add(node.val);
                 
                    // System.out.print(d);

                    if(node.left!=null)queue.add(node.left);
                    if(node.right!=null) queue.add(node.right);
                }
                list.add(inlist);
                // System.out.println();

            }
        
        return list;
    }
}