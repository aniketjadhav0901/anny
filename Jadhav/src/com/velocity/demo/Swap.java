package com.velocity.demo;

public class Swap {
	
	public static void main(String[] args) {
		int temp;
		int num1=10;
		int num2=20;
		
		System.out.println("before swaapping ");
		System.out.println("num1 is "+num1);
		System.out.println("num2 is "+num2);
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("after swapping");
		System.out.println("num1 is "+num1);
		System.out.println("num2 is "+num2);
		
	}

}
