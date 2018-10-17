/*
 * Daniel J. Gallegos
 * 10/12/2018
 * 2013
 */

import java.util.*;
public class RandomArrayIntegers {

	public static void main(String[] args) {
		Integer temp =0;
		boolean continueInput = true;
		Scanner input = new Scanner(System.in);
		Integer[] myArray = new Integer[100];
		//creates random numbers 
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = (int)(Math.random()*1000)+1;
		}
	do {
		try {
			System.out.println("Please enter the index of the array you would like to see");
			temp = input.nextInt();
			System.out.println("The index value at "+ temp+" is "+myArray[temp]);
			continueInput = false;
		}catch(ArrayIndexOutOfBoundsException ex) {//catches ArrayIndexOutOfBoundsException
			System.out.println("Out of Bounds");
			System.out.println("");
		}
		
	}while(continueInput);
	}
}
