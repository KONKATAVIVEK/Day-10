package com.codegnan.controlstatements;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number :");
		int number=scanner.nextInt();
		int count=0;
	    while (number!=0) {
		number/=10;
		count++;
	    }
	System.out.println("count the digits of a given number :" +count);
}
}
