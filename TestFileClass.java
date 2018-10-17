import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class TestFileClass {
	public static void main(String[] args) throws FileNotFoundException {
		java.io.File file = new java.io.File("src/chivas.txt");
		/*System.out.println("Does is exist? " + file.exists());
		System.out.println("The file has " + file.length()+"bytes");
		System.out.println("Can it be read" + file.canRead());
		System.out.println("Can it be written" + file.canWrite());
		System.out.println("Is it a directory?" + file.isDirectory());
		System.out.println("Is it a file?"  + file.isFile());
		*/
		Scanner read = new Scanner(new File("src/chivas.txt"));
		
		String firstLine = read.nextLine();
		System.out.println(firstLine);
		
	}

}
