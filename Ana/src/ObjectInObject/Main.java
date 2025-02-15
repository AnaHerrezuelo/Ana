package ObjectInObject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
//		Object1 object = new Object1 ();
		Object2 object2 = new Object2 ("aa", "asdf");
//		Object1 object3 = new Object1 ("aa", "asdf", 34, object2);
		Object1 object4 = new Object1 ("aa", "asdf", 34);
//		object.printToString();
//		object3.printToString();
		object4.printToString();
		

	}// end public static void main(String[] args)
}// end public class Main
