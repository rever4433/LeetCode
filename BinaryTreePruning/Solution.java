/**
 * 
 */
package BinaryTreePruning;

/**
 * @Title: Solution
 * @description:
 * @author: gaoyakang
 * @date: 2018年5月11日 上午10:26:28
 * 
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
	   public static TreeNode pruneTree(TreeNode root) {
	     dfs(root);
	     print(root);
	     return root;
	    }
	   public static TreeNode dfs(TreeNode root) {
		   if(root.left!=null) root.left=dfs(root.left);	
		   if(root.right!=null) root.right=dfs(root.right);	   
		   if(root.left==null&&root.right==null&&root.val==0) root=null;
		   
		   return root;
	   }
	   
	   public static void print(TreeNode root) {
		   System.out.print(root.val+" ");
		  
		   if(root.left!=null&&root.right==null) {
			   System.out.print("null ");
			   print(root.left);
		   }
		   if(root.left==null&&root.right!=null) {
			   System.out.print("null ");
			   print(root.right);
		   }
		   if(root.left!=null&&root.right!=null) {
			   print(root.left);
			   print(root.right);
		   }
		   if(root.left==null&&root.right==null) {
			   return;
		   }
		
	   }

	  public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.right=new TreeNode(0);
		root.right.left=new TreeNode(0);
		root.right.right=new TreeNode(1);
		print(root);
		System.out.println();
		pruneTree(root);
	}
}
