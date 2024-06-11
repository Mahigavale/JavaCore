package Revison.Core;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		
		int[] demo=new int[3];
		int[] demo2= {45,78,98};
		 Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<demo.length;i++)
		{
			System.out.println("please enter the"+i +"element");
			demo[i]=sc.nextInt();
		}
   
		//System.out.println(demo);
	

	
	for(int j:demo)
	{
		System.out.print(j+" ");
	}
}
}
