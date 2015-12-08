package romeNumber;
/*
 * 1.The rule of Rome number is to add every character in one column,then that is the decimal number
 * 2.I(1) V(5) C(10)
 */
public class Solution { 
	public static int romanToInt(String s) {
		char[] c=s.toCharArray();
		int sum=0;
        for(int i=0;i<c.length;i++){
          if(c[i]=='I') {
        	  if(i<c.length-1&&c[i+1]!='I'){
        	  sum=sum-1;
        	  }
        	  else
        	  sum=sum+1;
          }
          else if(c[i]=='C'){
        	  if(i<c.length-1 && (c[i+1]=='M' || c[i+1]=='D'))
            	  sum=sum-100;
            	  else
            	  sum=sum+100;
          }
          else if(c[i]=='X'){
        	  if(i<c.length-1&& (c[i+1]=='L' || c[i+1]=='M' || c[i+1]=='D' || c[i+1]=='C'))
            	  sum=sum-10;
              else
            	  sum=sum+10;
          }
          else if(c[i]=='M'){
        	  sum+=1000;
          }
          else if(c[i]=='L'){
        	  sum+=50;
          }
          else if(c[i]=='V'){
        	 
        		  sum+=5;
          }
          else if(c[i]=='D'){
        	  sum+=500;
          }
        	  System.out.println(sum);
        }
        return sum;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="MDCCCLXXXIV";
		System.out.println(romanToInt(s));

	}

}
