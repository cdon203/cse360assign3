/** 
 * @author Cooper McDonald
 * @author ID: 1214581524
 * Assignment 3
 *  This class inherits the AddingMachine class. It adds several more methods that have no
 *  return value, however take in an value. There is a method for multiplication, division,
 *  and raising total to the power of the value. In the case where 0 is entered in for 
 *  division or power, there is an if else statement to keep things accurate.
 */

package cse360assign3;

public class Calculator extends AddingMachine {

	/**
	 * Multiplies the total variable by value
	 * @param value
	 */
	public void mult (int value) {
		total = total * value;
		
		equation = equation + " * " + value;
	}
	
	/**
	 * Divides total by value. If value is 0, set total to 0, else div by value.
	 * @param value
	 */
	public void div (int value) {
		if (value == 0) {
			total = 0;
		}
		else {
			total = total / value;	
		}
				
		equation = equation + " / " + value;
		
	}
	
	/**
	 * Raises total to the power of value. If value is 0, set total to 0. Else raise to power of total.
	 * @param value
	 */
	public void power (int value) {		
		if (value == 0) {
			total = 0;
		}
		else {
			total = total ^ value;	
		}
			
		equation = equation + "^" + value;
		
	}
	
}
