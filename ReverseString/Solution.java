/**
 * 
 */
package ReverseString;

/**
 * @Title: Solution
 * @description: 
 * @author: gaoyakang
 * @date: 2018年7月26日 上午10:41:10
 * 
 */
public class Solution {
    public String reverseString(String s) {
        char[] c=s.toCharArray();
        char temp;
        for(int i=0;i<c.length/2;i++){
            temp=c[i];
            c[i]=c[c.length-i-1];
            c[c.length-i-1]=temp;
        }
        s=String.valueOf(c);
        return s;
    }
}
