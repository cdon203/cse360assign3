/** 
 * @author Cooper McDonald
 * @author ID: 1214581524
 * Assignment 3
 *  This program creates an AddingMachine object that contains a int total. This class has methods
 * that will manipulate this value such as getting, adding, subtracting, clearing, and setting to 
 * a string.
 */

package cse360assign3;

public class AddingMachine {

	// Variables
	protected int total = 0;				// total value that will be manipulated by methods. Initially set to 0
	protected String equation = "0";		// equation to be printed in toString. Begins the equation with a "0" to show initial value.
	
	/**
	 * Main object method. Nothing is changed
	 */
	public AddingMachine () {}
	
	/**
	 * Returns the int total
	 * @return total
	 */
	public int getTotal () {
		return total;			// Returning total
	}
	
	/**
	 * Adds value to total and appends variable 'equation'
	 * @param value
	 */
	public void add (int value) {
		total = total + value; 						// Adding the entered value to the current total
		
		equation = equation + " + " + value;		// Appending a string to equation so that it prints correctly in toString()
	}
	
	/**
	 * Subtracts value from total
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;						// Subtracting the entered value from the current total
		
		equation = equation + " - " + value;		// Appending a string to equation so that it prints correctly in toString()
	}
	
	/**
	 * Converts total to a string and returns
	 */
	public String toString () {
		return equation;			// Returning equation
	}

	/**
	 * Resets total to value of 0 and clears equation
	 */
	public void clear() {
		total = 0;				// Setting total back to 0
		equation = "0";			// Setting equation back to "0"
	}
		 	
}
