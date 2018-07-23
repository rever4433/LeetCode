/**
 * 
 */
package find_All_Duplicates_in_an_Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

/**
 * @Title: Solution
 * @description:
 * @author: gaoyakang
 * @date: 2018年5月25日 上午10:17:23
 * 
 */
public class Solution {
	public List<Integer> findDuplicates(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
				list.add(nums[i]);
			} else
				map.put(nums[i], 1);
		}
		return list;
	}

	@Test
	public void test() {
		int[] nums= {4,3,2,7,8,2,3,1};
		List<Integer> list=findDuplicates(nums);
		list.stream().forEach(System.out::println);
	}
}
