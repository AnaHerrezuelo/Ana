package Methods;
import java.util.Scanner;

public class Act01 {
	public static void main(String[] args) {
		Float number = readNumber();
		System.out.print(number);
		
	}// public void
	
	public static float readNumber () {
		Scanner keyboard = new Scanner(System.in);
//		System.out.print("give me a number: ");
//		float num=keyboard.nextFloat();
		//System.out.print(num);
		
		float num=0;
		boolean correct = false;

        while (!correct) {
            System.out.print("Please enter a real number: ");
            if (keyboard.hasNextFloat()) {
                num = keyboard.nextFloat();
                correct = true;
            } else {
                System.out.println("Invalid input. Please enter a valid real number.");
                keyboard.next(); // Limpiar la entrada no válida
            }
        }
        
		return num;
	}
}//public class
