//Program to demonstrate Multiple catch block
package com.tnsif.dayeleven.multiplecatch;

import java.util.Scanner;

public class Division {
	public static void divide() {
		int a, b, c;
		int[] arr = { 40, 60 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		
		try {
			a = sc.nextInt(); //to check whether valid input is accepted or not
			b = sc.nextInt();
			c = a / b;
			System.out.println("Division is " + c);
			System.out.println(arr[c]);
		
		}catch (ArithmeticException |ArrayIndexOutOfBoundsException e) {
			System.out.println("Error Occurred.." + e.getMessage());
		
		} 
		
		catch (Exception e) {
			System.out.println("Error Occurred.." + e.getMessage());
			sc.close();
	}
		

}
}
