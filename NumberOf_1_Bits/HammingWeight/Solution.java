package NumberOf_1_Bits.HammingWeight;

public class Solution {
    public static int hammingWeight(int n) {
    	 int count = 0;  
         
         while (n != 0) {  
             count += n & 1;  
             n = n >>> 1;  
         }  
         return count;  
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=00000000000000000000000000001011;
        System.out.println(hammingWeight(n)); 
	}

}
