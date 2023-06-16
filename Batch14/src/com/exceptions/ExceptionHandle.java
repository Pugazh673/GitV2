package com.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandle {

	public void checkAge(int age) {
		if (age < 0) {

			// throw new IllegalArgumentException("Age cannot be negative");
		}
		// Rest of the method code
	}

	public static void main(String[] args) throws IllegalArgumentException, ArithmeticException {
		// new ExceptionHandle().checkAge(0);

		ExceptionHandle ex = new ExceptionHandle();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value A:");
		// try {
		int a = sc.nextInt();
		System.out.println("Enter Value B:");
		int b = sc.nextInt();

		int c = a / b;
		System.out.println("Output " + c);
		// } catch (ArithmeticException e) {
		System.out.println("Check your Inputs");
		// } catch (InputMismatchException e) {
		System.out.println("Enter Vaild Data");
		// } finally {
		System.out.println("Completed");
		sc.close();
		// }
		ex.checkAge(-1);
	}

}
