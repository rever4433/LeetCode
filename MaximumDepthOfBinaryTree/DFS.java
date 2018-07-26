package MaximumDepthOfBinaryTree;
/**
 * 
 * @Title: DFS
 * @description: 
 * @author: gaoyakang
 * @date: 2018年7月26日 上午10:17:15
 *
 */
public class DFS {
	
	public static int DFSMaxdepth(TreeNode root){
		if(root==null)
			return 0;
		else{
			int i=DFSMaxdepth(root.right);
			int j=DFSMaxdepth(root.left);
			return (i<j)?j+1:i+1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tr=new TreeNode(1);
		TreeNode nodeB=new TreeNode(2);
		TreeNode nodeC=new TreeNode(3);
		TreeNode nodeD=new TreeNode(4);
		tr.left=nodeB;
		tr.left.left=nodeC;
		tr.left.right=nodeD;
		System.out.println(DFSMaxdepth(tr));
        
          
	}

}
 class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
    
}