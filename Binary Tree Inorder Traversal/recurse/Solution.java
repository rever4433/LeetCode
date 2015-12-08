package recurse;
import java.util.ArrayList;
import java.util.HashSet;
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
	  		
	 public static List<Integer> inorderTraversal_inRecursion(TreeNode root) {
		 	if(root!=null) 	{
		 	
		 	inorderTraversal_inRecursion(root.left);
		 	res.add(root.val);
		 	inorderTraversal_inRecursion(root.right);
		 	}
		 	return res;
	 } 
	 public static List<Integer> inorderTraversal_inStack(TreeNode root) {
		          if(root==null)
		              return new ArrayList<>();
		          Stack<TreeNode> st = new Stack<TreeNode>();
		          HashSet<TreeNode> hs = new HashSet<TreeNode>();
		          
		          st.push(root);
		          while(!st.isEmpty())
		         {
		             TreeNode temp = st.pop();
		             if(hs.contains(temp))
		             {
		                 res.add(temp.val);
		                 continue;
		             }
		             hs.add(temp);
		             if(temp.right!=null)
		                 st.push(temp.right);
		             st.push(temp);
		             if(temp.left!=null)
		                 st.push(temp.left);
		         }
		         return res;
	 }
	 public static void main(String[] args) {
		 TreeNode tr=new TreeNode(1);
			TreeNode nodeB=new TreeNode(2);
			TreeNode nodeC=new TreeNode(3);
			//TreeNode nodeD=new TreeNode(4);
			tr.left=nodeB;
			tr.right=nodeC;
			//nodeB.right=nodeC;
			//nodeB.right=nodeD;
			inorderTraversal_inStack(tr);
			for(int  i=0;i<res.size();i++){   
			       System.out.print(res.get(i)+" "); 	      
			   }  
	}
}
