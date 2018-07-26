/**
 * 
 */
package JewelsAndStones;

import java.util.HashMap;

/**
 * @Title: Solution
 * @description: 
 * @author: gaoyakang
 * @date: 2018年5月10日 上午10:55:02
 * 
 */
public class Solution {
    public static int numJewelsInStones(String J, String S) {
        HashMap<Character,Integer> stones=new HashMap<Character,Integer>();
        int result=0;
        S.chars().forEach(s->{
        	if(stones.containsKey((char)s)) {
        		stones.put((char)s, stones.get((char)s)+1);
        	}else {
        		stones.put((char)s, 1);
        	}
        });
      
        for(int i=0;i<S.length();i++) {
        	char key=S.charAt(i);
        	if(stones.containsKey(key)) {
        		stones.put(key, stones.get(key)+1);
        	}else {
        	stones.put(key,1);
        	}
        }
       System.out.println( stones.toString());
        for(int j=0;j<J.length();j++) {
        	char point=J.charAt(j);
        	if(stones.containsKey(point)) {
        		result+=stones.get(point);
        	}
        }
        return result;
    }
    public static void main(String[] args) {
		String J="aA";
		String S="aAABBBBB";
		System.out.println(numJewelsInStones(J,S));
	}
}
