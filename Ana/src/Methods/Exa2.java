package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class Exa2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int selection =0;
		String [] array = {"aaa", "fff", "ccc", "ddd", "eee"};
		
		do {
			System.out.println("Choose a option (1-3): ");
			System.out.println("1: Exit");
			System.out.println("2: Print Strings");
			System.out.println("3: Longest String");
			System.out.println("4: Search for an String");
			System.out.println("5: Renew a String");
			selection = keyboard.nextInt();
			keyboard.nextLine();
			switch(selection) {
			case 2:
				PrintStrings(array);
				break;
			case 3:
				longestString(array);
				break;
			case 4:
				searchString(array, keyboard);
				break;
			case 5:
				renewString(array, keyboard);
				break;
			}
		}while(selection != 1);
		
	}//end main
	
	public static void  PrintStrings (String [] array){
		System.out.println("Strings: ");
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
	}
	
	public static void  longestString (String [] array){
		Arrays.sort(array);
		
		System.out.println("The longest String is: " + array[array.length-1]);
	}
	
	
	public static String[] searchString (String [] array, Scanner keyboard){
		System.out.println("which string do u want to search?");
		String word = keyboard.nextLine();
		int pos=0;
		

		
		for(int i=0; i<array.length;i++) {			
			//System.out.println(word);
			if(array[i].equals(word)) {
				//System.out.println("Is in position " + i);
				pos=i;
			}
		}
		return array;
		
	}
	public static void showSearch (int pos){

		
		//return array;
		
	}
	
	
	public static void  renewString (String [] array, Scanner keyboard){
		System.out.println("which string do u want to renew?");
		String word = keyboard.nextLine();
		//keyboard.nextLine();
		
		System.out.println("with what?");
		String word2 = keyboard.nextLine();
		
		for(int i=0; i<array.length;i++) {
			if(array[i].equals(word)) {
				array[i]=word2;
//				System.out.println(array[i]);
//				System.out.println("pos" + i);
			}
		}
		//return array;
		
	}
	
	

}
