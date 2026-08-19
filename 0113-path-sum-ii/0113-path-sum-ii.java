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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
         List<List<Integer>> ans = new ArrayList<>();
         List<Integer> path = new ArrayList<>();
        
        findpath(root,targetSum,path,ans);
        return ans;
    }
    private void findpath(TreeNode root ,int targetSum , List<Integer> path,List<List<Integer>> ans){
        if(root == null){
            return  ;
        }

        path.add(root.val);
         targetSum-=root.val;


if(root.left==null && root.right==null){
    if(targetSum==0){
     ans.add(new ArrayList<>(path));
    }
}else{
    findpath(root.left,targetSum,path,ans);
     findpath(root.right,targetSum,path,ans);
    }

    // backtracking yha 
    path.remove(path.size()-1);

    }
}