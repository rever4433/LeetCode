package InvertTree;
class TreeNode{
	   int val;
	        TreeNode left;
	       TreeNode right;
	        TreeNode(int x) { val = x; }
}
public class invertTree {
	 //¶þ²æÊ÷·­×ª
	 public static TreeNode invertTree(TreeNode root){
	  if(root==null)	  return null;	 
	  TreeNode right=root.right;
	  TreeNode left=root.left;
	  root.right= invertTree(left);
	  root.left= invertTree(right);
	  return root;		 
	 }
	 public static void Print(TreeNode p){
		if(p==null) return;
		System.out.print(p.val);
	    if(p.left!=null) Print(p.left);
		if(p.right!=null) 	Print(p.right);
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
		Print(tr);
		System.out.println();
		invertTree(tr);
		Print(tr);
	}
}
