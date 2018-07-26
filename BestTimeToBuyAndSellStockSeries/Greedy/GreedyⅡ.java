package BestTimeToBuyAndSellStockSeries.Greedy;

import java.util.Scanner;

public class Greedy¢ò {
	 public static int maxProfit(int[] prices) {
		 int ans=0;
	        if(prices.length==0) return 0;
	        for(int i=1;i<prices.length;i++){
	        	if(prices[i]>prices[i-1]){
	        		ans+=prices[i]-prices[i-1];
	        	}
	        }
	        return ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
   Scanner sc =new Scanner(System.in);
   n=sc.nextInt();
   int[] a=new int[n];
      for(int i=0;i<a.length;i++){
    	  a[i]=sc.nextInt();
      }
     System.out.println(maxProfit(a)); 
	}

}
