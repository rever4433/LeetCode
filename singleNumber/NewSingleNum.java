package singleNumber;
/**
 * 
 * @Title: NewSingleNum
 * @description: 
 * @author: gaoyakang
 * @date: 2018年7月26日 上午10:05:46
 *
 */
public class NewSingleNum {
  public static int singleNum(int[] nums){
	  int result=nums[0];
	  for(int i=1;i<nums.length;i++){		  
		  result=result^nums[i];	 
	  }
	return result;	 
  }
  public static void main(String[] args) {
		int[] test={1,3,1,2,4,4,2,3,7};
		System.out.println(singleNum(test));		
	}
}
