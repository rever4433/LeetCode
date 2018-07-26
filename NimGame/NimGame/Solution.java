package NimGame.NimGame;

import java.util.Scanner;
/**
 * 
 * @Title: Solution
 * @description: 
 * @author: gaoyakang
 * @date: 2018年7月26日 上午10:22:16
 *
 */
public class Solution {
	public static  boolean NimGame(int n){
		 if(n%4==0) return false;
		else return true;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if( NimGame(n)==true)   System.out.println("You win!");
   	else   System.out.println("You lose!");
	}
}
