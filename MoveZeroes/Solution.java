package MoveZeroes;
import java.util.Stack;
public class Solution {
	 public static void moveZeroes(int[] nums) {
		 Stack<Integer> sk = new Stack<Integer>();  
		 int count=0;
	        for(int i=0;i<nums.length;i++){
	        	if(nums[i]!=0){ 
	        		sk.push(nums[i]);
	        	}
	        	else{
	        		count++;
	        	}
	        }
	        for(int i=nums.length-1;i>=0;i--){
	        	if(count==0){
	        		nums[i]=sk.pop();
	        	}
	        	else{
	        	nums[i]=0;
	        	count--;
	        	}
	        	
	        }
	    }
	 public static void main(String[] args) {
		int[] numbers={0,0,0,1,8,0,2,3,11};
		moveZeroes(numbers);
		for(int i=0;i<numbers.length;i++){
			System.out.print(numbers[i]+" ");
		}
	}
}
