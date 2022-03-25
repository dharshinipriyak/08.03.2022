package com.stringBufferFeatures;

public class insertMethod {

	public static void main(String[] args) 
	{
		//insert at any particular place 
		StringBuffer sb= new StringBuffer("Welcome kerala");
		System.out.println(sb.insert(8,"to "));
		
		System.out.println(sb.insert(10, " Gods own country ",0,17));
	}

}
