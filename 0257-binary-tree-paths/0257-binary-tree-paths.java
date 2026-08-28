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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
         if(root==null){
            return paths ;
        }
       

        solve(root,paths,"");
        return paths;
    }
    private void solve( TreeNode root ,List<String> paths , String path){
        if(root==null){
            return ;
        }
         if(!path.isEmpty()){
            
            path +="->";
        }
        path+=root.val;

     if(root.left==null && root.right==null){
        paths.add(path);
        return ;
     }
        solve(root.left,paths,path);
        solve(root.right,paths,path);
    }
}