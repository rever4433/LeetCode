package Array;
public class Solution {
	 public static int[] productExceptSelf(int[] nums) {
		 int [] product=new int[nums.length];	
		 for(int i=0;i<nums.length;i++){
			 product[i]=1;
			 for(int j=0;j<nums.length;j++){
				 if(j!=i)
				 product[i]*=nums[j];
			 }
		 }
	        return product;
	    }
	 public static int[] productExceptSelf1(int[] nums) {
		int[] res=new int[nums.length];
		res[res.length-1]=1;
		for(int i=nums.length-2;i>=0;i--){
			res[i]=res[i+1]*nums[i+1];
		}
		/*
		 * res[3]=need  *1*2*3
		 * res[2]=res[3]*nums[3];==res[3]*nums[3]   4  need *1*2
		 * res[1]=res[2]*nums[2];==res[3]*nums[3]*nums[2];   ¡Ì4*3     need   *1
  		 * res[0]=res[1]*nums[1];==res[3]*nums[3]*nums[2]*nums[1] ¡Ì  4*3*2      finish
		 */
		int[] right=new int[nums.length];
		right[0]=1;
		/*
		 * res[1]*nums[0]
		 * res[2]*nums[0]*nums[1]
		 * res[3]*nums[0]*nums[1]*nums[2]
		 */
		for(int i=1;i<nums.length;i++){
			right[i]=right[i-1]*nums[i-1];
			res[i]*=right[i];
		}    	
		 return res;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a={1,2,3,4,5,1,2};
        for(int i=0;i<productExceptSelf1(a).length;i++){
       System.out.print(productExceptSelf1(a)[i]+" ");  
	}
	}
}
