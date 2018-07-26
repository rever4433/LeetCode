/**
 * 
 */
package PerfectNumber;

import org.junit.Test;

/**
 * @Title: Solution
 * @description:
 * @author: gaoyakang
 * @date: 2018年5月24日 下午4:09:54
 * 
 */
public class Solution {
	public boolean checkPerfectNumber(int num) {
		int result = 1;
		if (num == 1)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				result += i + (i * i == num ? 0 : num / i);
				// result+=i;
			}
		}
		return result == num;
	}
	public boolean checkPerfectNumber1(int num) {
		int result = 1;
		if (num == 1)
			return false;
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				result += i;
				// result+=i;
			}
		}
		return result == num;
	}
	@Test
	public void test() {
		Long startTime = System.nanoTime();
		for (int i = 1; i < 1000; i++) {
			if (checkPerfectNumber(i)) {
				System.out.println(i);
			}
		}
		long endTime = System.nanoTime();
		System.out.println("运行时间:" + (endTime - startTime) + "ns");

	}
}
