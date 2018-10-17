/*
 * Daniel J. Gallegos
 * 10/12/2018
 * 2013
 */
import java.util.*;
public class OutOfMemory {
	
	public static void main(String[] args) {
		int[] myArray; 
		try {
			myArray = new int[2000000000];
		}
		catch(Error ex) {
			System.out.println("The program throws a Out Memory Error");
		}
	}

}
