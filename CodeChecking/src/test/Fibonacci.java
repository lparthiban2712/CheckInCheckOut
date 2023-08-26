package test;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		int fact=1;
		for(int i=num;i>1;i--)
		{
			fact=fact*i;
		}
		System.out.println("factorial of the number is"+fact);
	}

}
