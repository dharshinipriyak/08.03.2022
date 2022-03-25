package com.stringBufferFeatures;

public class capacityMethod {

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("Learn Programming");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		StringBuffer sb1=new StringBuffer("");
		System.out.println("**********");
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
	}

}
