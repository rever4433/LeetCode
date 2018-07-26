package ExcelSheetColumnNumber.Math;

public class Solution {
	 public static int titleToNumber(String s) {
		 char[] c=new char[1000];
		 s.toCharArray();
		 int sum=0;
		 int n=0;
		 for(int i=s.length()-1;i>=0;i--,n++){
		//	 System.out.print(s.toCharArray()[i]+" ");
			sum+=(int)(s.toCharArray()[i]-64)*Math.pow(26, n);
			System.out.println(sum);
		 }
		return sum;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s="AAA";
       //  System.out.println(titleToNumber(s)); 
          titleToNumber(s);
	}

}
