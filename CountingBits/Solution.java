/**
 * 
 */
package CountingBits;

/**
 * @Title: Solution
 * @description: Leetcode 338. Counting Bits
 * @author: gaoyakang
 * @date: 2018年7月26日 上午10:50:17
 * 
 */
public class Solution {
	   public int[] countBits(int num) {
		      int[] array=new int[num+1];
				 String [] strings=new String[num+1];	
			        for(int i=0;i<num+1;i++){
			        	strings[i]=Integer.toBinaryString(i);   	
			        	for(int j=0;j<strings[i].length();j++){
			        		if(strings[i].charAt(j)=='1'){
			        			array[i]++;
			        		}
			        	}
			        }
			        return array;
		    }
}
