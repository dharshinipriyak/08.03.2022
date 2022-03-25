package com.stringBufferFeatures;

public class indexOfMethod 
{

	public static void main(String[] args) 
	{
		//returns the index number
		StringBuffer sb=new StringBuffer("Welcome to kerala");
		System.out.println(sb.indexOf("to"));
		System.out.println("***********");
		StringBuffer sb1=new StringBuffer("Welcome to Kerala, Welcome to pondy");
		System.out.println(sb1.indexOf("to ",10));
	}

}
