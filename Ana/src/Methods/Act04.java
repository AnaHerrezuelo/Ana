package Methods;
import java.util.Scanner;

public class Act04 {
	public static void main(String[] args) {
		multiplicationTable();
	}	
	
	public static void multiplicationTable () {
		Scanner keyboard = new Scanner (System.in);
			System.out.println("give me a number: ");
			int num = keyboard.nextInt();
			for(int i=1;i<11;i++){
				//System.out.println(i);
				System.out.println(num + "x" + i + " = " + (i*num));
			}
	}
}
