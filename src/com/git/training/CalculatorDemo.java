package com.git.training;

public class CalculatorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Functions f = new Functions();
		System.out.println("Addition: "+f.add(1, 2));
		System.out.println("Subtraction: "+f.subtract(2, 1));
		System.out.println("Square: "+f.square(3));
		System.out.println("Multiply: "+f.multiply(2, 3));
		System.out.println("Power: "+f.raiseTo(2, 3));
	}

}
