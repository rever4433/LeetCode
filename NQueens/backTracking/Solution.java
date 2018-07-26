package NQueens.backTracking;
/**
 * 
 * @Title: Solution
 * @description: Leetcode 51. N-Queens
 * @author: gaoyakang
 * @date: 2018年7月26日 上午10:20:22
 *
 */
public class Solution {
	//0:初始值,true:不安全,falese:安全
	  int[] C=new int[8];
	  int n=8;
      int count=0;
	  void solveNQueens(int cur) {
	  int i,j;
	  if(cur==n) count++;
	  else
	  {
		for( i=0;i<n;i++){
		    int ok=1;
			C[cur]=i;
			for( j=0;j<cur;i++){
				if(C[cur]==C[j]||cur-C[cur]==j-C[j]||cur+C[cur]==j+C[j])
			      {
						ok=0;
						break;
				}				
				} 
				if(ok==1) solveNQueens(cur+1);
			}
		}
	    }
	 public static int solveNQueensIn(int n){
		return n;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Solution s=new Solution();
      s.solveNQueens(0);
      System.out.println(s.count);
	}

}

