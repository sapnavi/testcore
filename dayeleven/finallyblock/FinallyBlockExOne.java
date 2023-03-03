//program to demonstrate finally block

package com.tnsif.dayeleven.finallyblock;

public class FinallyBlockExOne {
	public static void divide(int a, int b) {
		int c;
		try {
			System.out.println("-------Within Try Block-----------");
			c = a / b;
			System.out.println("Result: " + c);
			System.exit(0);

		} catch (ArithmeticException ae) {
			System.out.println("Exception Caught..." + ae.getMessage());

		} finally {

			System.out.println("Finally block....");

		}
		System.out.println("Statement after finally block");

	}
}
