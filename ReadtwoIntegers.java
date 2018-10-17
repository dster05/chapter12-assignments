/*
 * Daniel J.Gallegos
 * 10/12/2018
 * 2013
 */

import java.util.*;
public class ReadtwoIntegers {
	
	private Integer numOne;
	private Integer numTwo;
	//Constructor
	public ReadtwoIntegers(Integer numOne, Integer numTwo) {
		this.numOne = numOne;
		this.numTwo = numTwo;
	}
	//displays the sum of Two Integer values
	public void displaySum(Integer one, Integer two) {
		Integer sum = one+ two;
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Integer uno= 0;
		Integer dos = 0;
		boolean continueInput =  true;
		do {
			try {//Throws a InputMismatchException if the wrong type is inputed
				System.out.println("Please enter first Integer");
				uno = input.nextInt();
				System.out.println("Please enter Second Integer");
				dos = input.nextInt();
				continueInput = false;
			}
			catch (InputMismatchException ex) {
				System.out.println("Try again. Incorrect input: Integer required");
				input.nextLine();
			}
		}while(continueInput);	
		
		ReadtwoIntegers hello = new ReadtwoIntegers(uno, dos);
		hello.displaySum(uno, dos);
	}

}
