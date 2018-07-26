/**
 * 
 */
package UniqueMorseCodeWords;

import java.util.HashSet;

/**
 * @Title: Solution
 * @description: 
 * @author: gaoyakang
 * @date: 2018年5月10日 上午11:30:32
 * 
 */
public class Solution {
	final static String[] morse= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	public static int uniqueMorseRepresentations(String[] words) {
		HashSet<String> map=new HashSet<>();
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
			System.out.println(transferToMorseString(words[i]));
			map.add(transferToMorseString(words[i]));
		}
        return map.size();
    }
	
	public static String transferToMorseString(String word) {
		String result="";
		for(int i=0;i<word.length();i++) {
			result+=morse[(int)word.toCharArray()[i]-97];
		}
		return result;
	}
	public static void main(String[] args) {
		String[] s=  {"gin", "zen", "gig", "msg"};
		System.out.println(uniqueMorseRepresentations(s));
	}
}
