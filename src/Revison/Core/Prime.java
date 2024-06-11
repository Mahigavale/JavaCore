package Revison.Core;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
    
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("please enter the number you want to check :");
		int num=sc.nextInt();
		boolean flag=true;
		
		for(int j=2;j<num;j++)
		{
			if(num%j==0)
			{
				flag=false;
			}
		}
		if(flag)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("non Prime");
		}
	}

}
