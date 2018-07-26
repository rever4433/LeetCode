/**
 * 
 */
package EncodeAndDecodeTinyURL;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title: Solution
 * @description: Leetcode 535. Encode and Decode TinyURL
 * @author: gaoyakang
 * @date: 2018年7月26日 上午10:47:44
 * 
 */
public class Solution {
	static Map<Integer,String> map=new HashMap<Integer, String>();
	static String host="http://tinyurl.com/";
	 public static String encode(String longUrl) {
		 int key=longUrl.hashCode();
	    	map.put(key,longUrl);
	    	  return host+key;
	      
	    }

	    // Decodes a shortened URL to its original URL.
	    public static String decode(String shortUrl) {
	    	int key=Integer.parseInt(shortUrl.replace(host, ""));
	       return map.get(key); 
	    }
}
