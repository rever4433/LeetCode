package PreorderTraversal;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
 class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
public class Solution {
	  static  List<Integer> res = new ArrayList<>();
	  static  Stack<TreeNode> stack = new Stack<>();
	  //只要是递归就能用栈来还原递归过程
	  public static List<Integer> preorderTraversal_inStack(TreeNode root) {
		  if(root == null) return new ArrayList<Integer>();
	        stack.push(root);
	        while(!stack.isEmpty()){
	            TreeNode tr = stack.pop();
	            res.add(tr.val);
	            if(tr.right!=null){
	                stack.push(tr.right);
	            }
	            if(tr.left!=null){
	                stack.push(tr.left);
	            }
	        }
	        return res; 
	    }
	  public static List<Integer> preorderTraversal_inRecursion(TreeNode root) {
		  if(root==null) return new ArrayList<Integer>();
		  res.add(root.val);
		  while(root.right!=null||root.left!=null){
			  preorderTraversal_inRecursion(root.right);
			  preorderTraversal_inRecursion(root.left);
		  }
		  return res;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tr=new TreeNode(1);
		TreeNode nodeB=new TreeNode(2);
		TreeNode nodeC=new TreeNode(3);
	//	TreeNode nodeD=new TreeNode(4);
		tr.right=nodeB;
		nodeB.left=nodeC;
	//	tr.right=nodeC;
	//	tr.left.right=nodeD;
		 preorderTraversal_inStack(tr);
		for(int  i=0;i<res.size();i++){   
		       System.out.print(res.get(i)+" "); 	      
		   }  
	}
}