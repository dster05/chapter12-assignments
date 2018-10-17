/*
 * Daniel J. Gallegos
 * 10/12/2018
 * 2013
 * got the code off Chegg.com
 */

import java.io.*;
import java.util.*;

public class CheckingFile {
	
	public static void main(String[] args) throws Exception {
		
		//Creating the file Object
		
		File obj = new File("Exercise12_15.txt");
		String [] numbers = null;
		int [] sortedArray = null;
		String line = null;
		
		//Checking existence of the file
		if(!obj.exists()) {
			PrintWriter output = new PrintWriter(new File("Exercise12_15.txt"));
			
			Random random = new Random();
			for(int i =0 ; i < 100 ; i++) {
				int randomValue = (int)(1+ Math.random()*300);
				
				output.print(randomValue + " ");
			}
			output.close();
		}
		Scanner input = new Scanner(new File("Exercise12_15.txt"));
		
		while(input.hasNext()) {
			String s1 = input.nextLine();
			
			numbers = s1.split(" ");
		}
		sortedArray = new int[numbers.length];
		
		for(int i =0 ; i < numbers.length; i++) {
			sortedArray[i] = Integer.parseInt(numbers[i]);
		}
		Arrays.sort(sortedArray);
		
		for(int i =0 ; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}
	}

}
