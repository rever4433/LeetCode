/**
 * 
 */
package ToLowerCase;

/**
 * @Title: Solution
 * @description: 
 * @author: gaoyakang
 * @date: 2018年7月26日 上午10:44:43
 * 
 */
public class Solution {
	  public String toLowerCase(String str) {
	        char[] chars=str.toCharArray();
	        StringBuffer result=new StringBuffer();
	        for(int i=0;i<chars.length;i++){
	            if(chars[i]>64&&chars[i]<92)
	                chars[i]+=32;
	            result.append(chars[i]);
	        }
	        return result.toString();
	    }
}
