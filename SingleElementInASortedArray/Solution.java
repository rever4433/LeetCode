package SingleElementInASortedArray;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;

/**
 * @Title: Solution
 * @description: 
 * @author: gaoyakang
 * @date: 2018年5月25日 上午10:47:24
 * 
 */
public class Solution {
	  public int singleNonDuplicate(int[] nums) {
		  int result=0;
		  Set<Integer> set=new HashSet<Integer>();
	        for(int i=1;i<nums.length-1;i++) {
	        
	        	if(set.contains(nums[i])&&set.size()==1) {
	        		set.remove(nums[i]);
	        	}else
	        	set.add(nums[i]);
	        }
	        Iterator it = set.iterator();  
	        return (int)it.next();
	    }
	  public int binarySearch(int[] nums,int start,int end,int point) {
		  if(start==end) return 0;
		//  if(nums[])
		  if(point>nums[(end+start)/2+1]) {
			  binarySearch(nums, (end+start)/2+1, end, point);
		  }else  binarySearch(nums, start, (end+start)/2, point);
		  return 0;
	  }
	  @Test
		public void test() {
			int[] nums= {1,1,2,3,3,4,4,8,8};
			System.out.println(singleNonDuplicate(nums));
			assertEquals(2,singleNonDuplicate(nums));
		}
	  
	  @Test
		public void test1() {
			int[] nums= {3,3,7,7,10,11,11};
			System.out.println(singleNonDuplicate(nums));
			assertEquals(10,singleNonDuplicate(nums));
		}
	  
	  @Test
		public void test2() {
			int[] nums= {1,1,2};
			System.out.println(singleNonDuplicate(nums));
			assertEquals(2,singleNonDuplicate(nums));
		}
}
