package singleNumber;

import java.util.Vector;

/**
 * 
 * @Title: SingleNum
 * @description:
 * @author: gaoyakang
 * @date: 2018年7月26日 上午10:06:05
 *
 */
public class SingleNum {
	public static int singleNumber(int[] nums) {
		Vector<Integer> vbook = new Vector<Integer>();
		int count = 0;
		int a = 0;
		for (int i = 0; i < nums.length; i++) {
			count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j])
					count++;
			}
			if (count == 1) {
				a = nums[i];
			}
		}
		return a;
	}

	public static void main(String[] args) {
		int[] test = { 1, 3, 1, 2, 4, 4, 2, 3, 7 };
		System.out.println(singleNumber(test));
	}
}
