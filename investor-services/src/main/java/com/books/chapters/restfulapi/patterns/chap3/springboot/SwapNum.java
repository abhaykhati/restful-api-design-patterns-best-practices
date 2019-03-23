package com.books.chapters.restfulapi.patterns.chap3.springboot;

public class SwapNum {
	
	public static void main(String[] args)
	  {
	    int a=10;
	    int b=20;
	    a=a+b; //a=30
	    b=a-b;//b=10
	    a=a-b;//30-10=20 i.e. a=20
	    System.out.println("After Swapping value of a is : " + a);
	    System.out.println("After Swapping value of b is : "+ b);
	    
	    
	  }
}
