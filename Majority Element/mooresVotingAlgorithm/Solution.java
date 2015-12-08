package mooresVotingAlgorithm;
import java.util.ArrayList;
import java.util.List;
public class Solution {
    public static int majorityElement(int[] nums) {
      int count=0;
      int candidate=0;
      for(int i=0;i<nums.length;i++){
    	  if(count==0){
    		  candidate=nums[i];
    		  count=1;
    	  }
    	  else
    		 if(nums[i]==candidate)
    			 count++;
    		 else {
				count--;
			}
      }
      return candidate;
    }
    public static void main(String[] args) {
		int[] a={1,1,2,3,1,3,3,4,3,3,3};
		System.out.println(majorityElement(a));
	}
}