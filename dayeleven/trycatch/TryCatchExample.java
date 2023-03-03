//program to demonstrate try catch block
package com.tnsif.dayeleven.trycatch;

public class TryCatchExample {
	static void divide(int x, int y) {
		System.out.println("I am in method");
		int z;
		z = x / y;
		try {
			System.out.println("I am in try block");
			// exception occurred
			System.out.println("Result of z: " + z); // this message will not be printed
		} catch (ArithmeticException np) // catch block to handle the exception
		{
			System.err.println("I am in catch block" + np.getMessage());
		}
		/*
		 * float f=12.5f/0.0f; System.out.println(f);
		 */
	}
}
