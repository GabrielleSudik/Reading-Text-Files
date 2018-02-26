import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//those imports got added by using menus as you typed code below.

//you created a text doc on your desktop, filled it with words.
//copy the filepath, but you'll need to re-do the slashes

public class Application {

	// this opening line is a little different
	// see the "throws" bit?
	// you added that via menu options when you added the new Scanner object
	// it will help catch errors with missing docs.
	public static void main(String[] args) throws FileNotFoundException {

		String fileName = "C:/Users/Gabri/Desktop/ExampleDocForJavaLesson.txt";

		File textFile = new File(fileName);
		// you'll have to import a statement above (left click error dot)

		Scanner in = new Scanner(textFile);
		// ditto. AND:
		// left click and THROW FileNotFound exception.
		// it gets added above.

		// this loop will print each of the text doc.
		while (in.hasNextLine()) {
			String line = in.nextLine();
			System.out.println(line);
		}

		// this code will...
		//well, it's supposed to print the ints
		//but you're having trouble and can't figure out why
		while (in.hasNextInt()) {
			int value = in.nextInt();
			System.out.println("Read value: " + value);
		}
		
		in.close();
		
		//anyway, you learned about Reading and Scanning classes
	}

}

//you can drag and drop files into your eclipse/project root directory
//instead of specifying the whole path, you just need to include the doc's name

