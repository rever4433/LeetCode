/**
 * 
 */
package HammingDistance;

/**
 * @Title: Solution
 * @description: 
 * @author: gaoyakang
 * @date: 2018��7��26�� ����10:45:38
 * 
 */
public class Solution {
	   public int hammingDistance(int x, int y) {
	    	int res=0;
	    	int exc=x^y;
	    	for(int i=0;i<32;i++){
	    		if( ( exc & 1)!= 0 )
	    			res++;
	    		exc>>=1;
	    	
	    }
			return res;
	     }
}
