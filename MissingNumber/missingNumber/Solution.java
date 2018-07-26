package MissingNumber.missingNumber;
/**
 * 
 * @Title: Solution
 * @description: LeetCode 268. Missing Number
 * @author: gaoyakang
 * @date: 2018年7月26日 上午10:17:39
 *
 */
public class Solution {
	 public static int missingNumber(int[] nums) {
		   int key=0;
	        for(int i=0;i<nums.length;i++){
	        	key = key + i+1 - nums[i];	        	
	        }
	        return key;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] a={0,1,2,4,5};
      System.out.println(missingNumber(a));
	}
}