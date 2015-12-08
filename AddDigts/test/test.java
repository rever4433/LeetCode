package test;

import java.util.Scanner;

public class test {
	public static int Solution(int num){
		if(num%9==0&&num>9){
			return 9;
		}
		while(num>=10){
			num=num%9;
		}
		return num;
	}
  
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println(Solution(sc.nextInt()));
}}
