package com.niit;

import java.util.Scanner;

public class InputProcessing 
{

	
	public static void main(String str[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the query string ");
		
		String inputqry = input.nextLine();
		
		QueryParser qp = new QueryParser();
		qp.splitQuery(inputqry);
	
	/*
		QueryParser1 qp1 = new QueryParser1();
		qp1.splitQuery(inputqry);*/
	}
}
