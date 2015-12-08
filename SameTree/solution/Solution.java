package solution;

//import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

class TreeNode{
	   int val;
	        TreeNode left;
	       TreeNode right;
	        TreeNode(int x) { val = x; }
}
public class Solution {
       //�������Ƿ���ͬ
	 public static boolean isSameTree(TreeNode p, TreeNode q) {
		 if(p==null&&q==null)     return true;  //ͬʱ����Ҷ�ӽڵ�
		 else  if(p==null||q==null) return false;   //��ͬʱ����Ҷ������ͬ
		 if(p.val!=q.val) return false;  //�ڵ�ֵ��ͬ����ͬ
		 else return isSameTree(p.left, q.left)&&isSameTree(p.right, q.right); //�ݹ�
	           	            	       	      		        
	 }
	 //��������ת
	 public static TreeNode invertTree(TreeNode root){
	  if(root==null){
		  return null;
	  }
	  TreeNode right=root.right;
	  TreeNode left=root.left;
	  root.right= invertTree(left);
	  root.left= invertTree(right);
	  return root;
		 
	 }
	 public static void Print(TreeNode p){
		System.out.print(p.val);
		if(p.left==null&&p.right==null) return;
	    if(p.left!=null)
			Print(p.left);
		if(p.right!=null) {
			Print(p.right);
		}
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tr=new TreeNode(1);
		TreeNode nodeB=new TreeNode(2);
		TreeNode nodeC=new TreeNode(3);
		TreeNode nodeD=new TreeNode(4);
		tr.left=nodeB;
		tr.right=nodeC;
		tr.left.right=nodeD;
		
	//	TreeNode t1=new TreeNode(1);
	//	TreeNode nodeB1=new TreeNode(2);
		//TreeNode nodeC1=new TreeNode(3);
	//	TreeNode nodeD1=new TreeNode(4);
	//	t1.left=nodeB1;
	//	t1.left.left=nodeC1;
	//	t1.left.right=nodeD1;
		
		
	//	System.out.println(isSameTree(tr,t1));
		Print(tr);
		System.out.println();
		invertTree(tr);
		Print(tr);
	}

}
