package Methods;
import java.util.Scanner;

public class Act02 {
	public static void main (String [] arg) {
		Scanner keyboard = new Scanner(System.in);
		float num1;
		float num2;
		
		System.out.print("What method do u want to use?");
		int method = keyboard.nextInt();
		
		System.out.print("num1?");
		num1 = keyboard.nextFloat();
		
		System.out.print("num2?");
		num2 = keyboard.nextFloat();
		
		switch(method) {
		case 1:
			addition(num1,num2);
			break;
		case 2:
			subtraction(num1,num2);
			break;
		case 3:
			multi(num1,num2);
			break;
		case 4:
			break;

		}
	}// end main
	
	public static void addition (float num1, float num2) {
		float result = num1 + num2;

		System.out.print("the addition: " + result);
		
	}
	
	public static void subtraction (float num1, float num2) {
		float result = num1 - num2;
		
		System.out.print("the addition: " + result);
		
	}
	
	public static void multi (float num1, float num2) {
		float result = num1 * num2;
		
		System.out.print("the addition: " + result);
		
	}
	
}
