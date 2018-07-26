/**
 * 
 */
package TrimABinarySearchTree;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/**
 * @Title: Solution
 * @description:
 * @author: gaoyakang
 * @date: 2018年5月18日 上午9:30:29
 * 
 */

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
		val = x;
	}
	List<String> list=new ArrayList<String>();
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		dfs(this);
		return this.list.toString();
	}
	private void dfs(TreeNode root) {
		if (root == null) {
			list.add("null");
			return;
		}
		list.add(String.valueOf(root.val));
		if (root.left == null && root.right == null) {
			return;
		}
		if (root.left != null && root.right == null) {
		//	list.add("null");
			dfs(root.left);
	
		}
		if (root.left == null && root.right != null) {
			list.add("null");
			dfs(root.right);
		}
		if (root.left != null && root.right != null) {
			dfs(root.left);
			dfs(root.right);
		}
	}
	
}

public class Solution {
	public static TreeNode node;
	public static TreeNode trimBST(TreeNode root, int L, int R) {
		if (root.left != null)
			root.left = trimBST(root.left, L, R);
		if (root.right != null)
			root.right = trimBST(root.right, L, R);
		if (root.val < L) {
			if (root.right != null && root.right.val >= L && root.right.val <= R) {
				root = trimBST(root.right, L, R);
			} else
				return null;
		}
		if (root.val > R) {
			if (root.left != null && root.left.val >= L && root.left.val <= R) {
				root = trimBST(root.left, L, R);
			} else
				return null;
		}
		return root;
	}

	
	@Test
	public void testing1() {
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		TreeNode result=trimBST(root, 2, 4);
		TreeNode expect=new TreeNode(2);
		System.out.println("Expect:"+expect.toString()+" , actual:"+result.toString());
		assertEquals(expect.toString(), result.toString());
	}
	@Test
	public void testing2() {
		TreeNode root = new TreeNode(3);
		root.left=new TreeNode(0);
		root.right = new TreeNode(4);
		root.left.right=new TreeNode(2);
		root.left.right.left=new TreeNode(1);
		TreeNode result=trimBST(root, 1, 3);
		
		TreeNode expect=new TreeNode(3);
		expect.left=new TreeNode(2);
		expect.left.left=new TreeNode(1);
		System.out.println("Expect:"+expect.toString()+" , actual:"+result.toString());
		assertEquals(expect.toString(), result.toString());
	}
	
	@Test
	public void testing3() {
		TreeNode root = new TreeNode(1);
		root.left=new TreeNode(0);
		root.right = new TreeNode(2);

		TreeNode result=trimBST(root, 1, 2);
		
		TreeNode expect=new TreeNode(1);
		expect.right=new TreeNode(2);

		System.out.println("Expect:"+expect.toString()+" , actual:"+result.toString());
		assertEquals(expect.toString(), result.toString());
	}
	@Test
	public void testR() {
		TreeNode root = new TreeNode(3);
		root.left=new TreeNode(2);
		root.left.left = new TreeNode(1);

		System.out.println("Expect:"+root.toString());
		
	}
	public TreeNode generateTree(TreeNode root,LinkedList<String> list) {
		if(list.size()==0) return null;
		if(!list.peek().equals("null")) {
			return new TreeNode(Integer.valueOf(list.poll()));
		}else return null;
	}
}
