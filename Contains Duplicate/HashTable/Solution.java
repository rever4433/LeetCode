package HashTable;
import java.awt.FontFormatException;
import java.util.HashMap;
import java.util.Hashtable;
public class Solution {
	//排序法求解
	    public static boolean containsDuplicate(int[] nums) {
	   for(int i=0;i<nums.length;i++){  //冒泡
		   for(int j=1;j<=i;j++){
			   int temp;
			   if(nums[i]>nums[j]){
				    temp=nums[j];
				    nums[j]=nums[i];
				    nums[i]=temp;
			   }
		   }
	   }
	   for(int i=0;i<nums.length-1;i++){		 
			   if(nums[i]==nums[i+1])
				  return true;	
	   }
	   return false;
	}
	    public static boolean containsDuplicate1(int[] nums) {
	    	HashMap<Integer, Integer> hm=new HashMap<>();   
	    	for(int i=0;i<nums.length;i++){
	    		if(hm.containsKey(nums[i])){    //如果hashmap中存在值则说明此值重复
	    			return true;
	    		}
	    		hm.put(nums[i], i);
	    	}
			return false;
	    	
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int [] a={1,2,2,1};
        System.out.println(containsDuplicate1(a));  
	}

}
