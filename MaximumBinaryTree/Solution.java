/**
 * 
 */
package MaximumBinaryTree;

import org.junit.Test;

/**
 * @Title: Solution
 * @author: ykgao
 * @description: 
 * @date: 2017-11-13 œ¬ŒÁ02:58:15
 */
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
public class Solution {
	 public static TreeNode constructMaximumBinaryTree(int[] nums){
		 return constructor(nums,0,nums.length-1);
	 }
	 public static TreeNode constructor(int[] nums,int left,int right){
		 if (left>right)
			 return null;
		
		 int max=MaxArrayIndex(nums, left, right);
		 TreeNode root=new TreeNode(nums[max]);
		 if(left==right) System.out.println("max: "+max+" left: "+left);
		 root.left=constructor(nums,left,max-1);
		 root.right=constructor(nums, max+1, right);
		 return root;
	 }
	 public static int MaxArrayIndex(int[] nums,int left,int right){
		 int point=nums[left];
		 int max_index=left;
		 for(int i=left+1;i<=right;i++){
			 if(nums[i]>point){
				 point=nums[i];
				 max_index=i;
			 }else continue;
		 }
		 return max_index;
	 }

	 //±È¿˙TreeNode
	 public static void dfs(TreeNode root){
		 if(root==null) return;
		 dfs(root.left);
		 System.out.print(root.val);	 
		 dfs(root.right);
	 }
	 @Test
	 public static void test() {
		 int[] a= {3,2,1,6,0,5,7,8};
		 TreeNode root=constructMaximumBinaryTree(a);
		 dfs(root);
	}

}
