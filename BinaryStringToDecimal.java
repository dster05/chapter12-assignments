/*
 * Daniel J. Gallegos
 * 10/12/2018
 * 2013
 */

import java.util.*;
public class BinaryStringToDecimal {
	//turns 
	public static void bin2Decimal(String s){
		boolean continueInput= true;
		do {
		try {
			Integer decimal = Integer.parseInt(s, 2);
			System.out.println(decimal.intValue());
			continueInput = false;
		}catch(NumberFormatException nfe) {
			throw  new NumberFormatException("a binary number consist of 0's or 1");
			//System.out.println("This is practice");
		}
		}while(continueInput);
	}
	
	public static void main(String[] args){
		//testing
		String a = "1010";
		String b = "iudjfh";
		bin2Decimal(a);
		System.out.println("");
		bin2Decimal(b);
		
		//
	}

}
