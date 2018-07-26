package SingleNumberIII.bit;
import java.awt.image.SinglePixelPackedSampleModel;
import java.util.Hashtable;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;
/**
 * 
 * @Title: Solution
 * @description: 
 * @author: gaoyakang
 * @date: 2018年7月26日 上午10:38:09
 *
 */
public class Solution {
	 public static int[] singleNumber(int[] nums) {
		 int[] result=new int[nums.length];
		 int point=0;
		 result[point]=nums[0];	 
		  for(int i=1;i<nums.length;i++){
			  result[point]=result[point]^nums[i];
			  if(result[point]!=0){
			 	 point++;
		  }
		  }
		return result;        
	    }
	 public static int[] singleNumber3(int[] nums) {
	        int[] res = new int[2];
	        int result = nums[0];
	        for(int i=1;i<nums.length;i++){
	        	result = result^nums[i];
	        }
	        res[0] = 0;
	        res[1] = 0;
	        int n = result & (~(result-1));
	        System.out.println("R:"+result+" n:"+n+" ~result:"+~(result-1));
	        for(int i=0;i<nums.length;i++){
	            if((n & nums[i])!=0){
	                res[0] = res[0] ^ nums[i];
	            }else {
	                res[1] = res[1] ^ nums[i];
	            }
	        }
	        return res;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] a={4,4,1,1,3,5};
     
    	  System.out.print(singleNumber3(a)[0]+" "+singleNumber3(a)[1]);
       
	}

}
