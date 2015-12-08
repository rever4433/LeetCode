package BFS;
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class Solution {
	 public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		 if(root==null) return null;
		 if(root==p||root==q) return root;
		 TreeNode L=lowestCommonAncestor(root.left,p,q);
		 TreeNode R=lowestCommonAncestor(root.right,p,q);
		 if(L!=null&&R!=null) return root;
		return L!=null?L:R;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tr=new TreeNode(1);
		TreeNode nodeB=new TreeNode(2);
		TreeNode nodeC=new TreeNode(3);
		TreeNode nodeD=new TreeNode(4);
		TreeNode nodeE=new TreeNode(5);
		tr.left=nodeB;
		tr.right=nodeC;
		tr.left.right=nodeD;	
		tr.left.left=nodeE;	
		System.out.print(lowestCommonAncestor(tr, nodeC, nodeE).val);
	}

}
