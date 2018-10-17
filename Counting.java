import java.util.*;
import java.io.*;
/*
 * Daniel J. Gallegos
 * 10/9/2018
 * 2013
 */
public class Counting {
	private static int wordCounter;
	private static int lineCounter;
	private static int spaceCounter;
	
	public static void processData() {
		
		try(Scanner input = new Scanner("src/Lincoln.txt")){
			while(input.hasNextLine()) {
				String line = input.nextLine();
				lineCounter++;
				
				try(Scanner text = new Scanner(line)){
					while(text.hasNext()) {
						text.next();
						wordCounter++;
					}
					}
					
			}
			
		}
		System.out.println("Number of Lines:" + lineCounter);

		System.out.println("Number of Words: " + wordCounter);
		}
				
		

	
	public static void main(String[] args) {
		
		processData();
	}


}

