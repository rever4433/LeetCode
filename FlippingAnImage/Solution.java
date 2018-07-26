/**
 * 
 */
package FlippingAnImage;

/**
 * @Title: Solution
 * @description: Leetcode 832. Flipping an Image
 * @author: gaoyakang
 * @date: 2018年7月26日 上午10:36:21
 * 
 */
public class Solution {
	   public int[][] flipAndInvertImage(int[][] A) {
	          int[][] result=new int[A.length][];
	        for(int i=0;i<A.length;i++){
	            int[] temp=A[i];

	            for(int j=0;j<temp.length/2;j++){
	                int tem=temp[j];
	                temp[j]= temp[temp.length-j-1];
	                temp[temp.length-j-1]=tem;
	            }
	            for(int k=0;k<temp.length;k++){
	                temp[k]=temp[k]^1;
	            }
	            result[i]=temp;

	        }
	        return  result;
	    }
}
