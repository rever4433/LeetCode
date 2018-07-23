/**
 * 
 */
package max_Increase_to_Keep_City_Skyline;


/**
 * @Title: Solution
 * @description: 
 * @author: gaoyakang
 * @date: 2018年5月11日 上午9:43:03
 * 
 */
public class Solution {
public static int maxIncreaseKeepingSkyline(int[][] grid) {
		int len=grid.length;
        int rowMax[]=new int[len];
        int colMax[]=new int[len];
        for(int i=0;i<len;i++) {
        	for(int j=0;j<len;j++) {
        		rowMax[i]=Math.max(rowMax[i],grid[i][j]);
        		colMax[j]=Math.max(colMax[j], grid[i][j]);
        	}
        }
        int res=0;
        for(int i=0;i<len;i++) {
        	for(int j=0;j<len;j++) {
        		res+=Math.min(rowMax[i], colMax[j])-grid[i][j];
        		grid[i][j]=Math.min(rowMax[i], colMax[j]);
        	}
        }
        arrayPrint(grid);
        return res;
    }
public static void arrayPrint(int[] arr) {
    for(int a=0;a<arr.length;a++) {
    	System.out.print(arr[a]+" ");
    }
    System.out.println();
}
public static void arrayPrint(int[][] arrs) {
    for(int i=0;i<arrs.length;i++) {
    	for(int j=0;j<arrs.length;j++) {
    		System.out.print(arrs[i][j]+" ");
    	}
    	System.out.println();
    }
}
public static void main(String[] args) {
	int[][] a= {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
	System.out.println(maxIncreaseKeepingSkyline(a));
	
}
}
