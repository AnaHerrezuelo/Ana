package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class examen {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		int selection = 0;
		boolean value1 = false;
		String[] array = null;

		do {
			System.out.println("choose an option: ");
			System.out.println("1: Insert values");
			System.out.println("2: Print the copy");
			System.out.println("3: Create Copy in reverse");
			System.out.println("4: Show the larguest character");
			System.out.println("5: How many times appear the the character");
			System.out.println("6: Exit");
			selection = keyboard.nextInt();
			
					if(selection<1 || selection>6) {
						System.out.println("You must choose and existing option!! ");
					}else if(selection != 1 && value1==false) {
						System.out.println("You must choose the option 1 first!! ");
					}else{
						value1=true;
						switch (selection) {
						case 1:
							array = one(keyboard);
						break;
						case 2:
							two(array);
						break;
						case 3:
							three(array);
						break;
						case 4:
							four(array);
							break;
						case 5:
							five(array, keyboard);
							break;
						}//end switch
					}//end ifs
					
					
			
		}while(selection!=6);
	}//end main
	
	public static String [] one (Scanner keyboard) {

		
		System.out.println("how many values?: ");
		int size = keyboard.nextInt();
		keyboard.nextLine();
		String [] array  = new String [size];
		
		for(int i=0;i<array.length;i++) {
			System.out.println("Insert values into the array " + i);
			array[i] = keyboard.nextLine();
		}
		
//		for(int i=0;i<array.length;i++) {
//			System.out.println(array[i]);
//
//		}
		return array;
		
	}//end one
	
	public static void two (String [] array){
		
        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemento " + i + ": " + array[i]);
        }
        //return array;
	}
	
	public static void three (String [] array){
		String [] arrayCopy  = new String [array.length];
		
			int i=array.length-1;
			for (int j = 0; j < arrayCopy.length; j++) {
				arrayCopy[j]=array[i];
				i--;
			}
		
		for (int j = 0; j < array.length; j++) {
			System.out.println("array og: " + array[j]);

		}
		for (int j = 0; j < arrayCopy.length; j++) {

			System.out.println("array reverse: " + arrayCopy[j]);
		}
		
		//return array;
	}
	
	public static void four (String [] array){
		Arrays.sort(array);

		System.out.println(array[array.length-1]);

		
		//return array;
	}
	
	public static void five (String [] array, Scanner keyboard){
		System.out.println("which character: ");
		String pos=keyboard.next();
		int count=0;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length();j++) {
			//array[i].charAt(i);
			//System.out.print(array[i].charAt(j));
				if(pos.charAt(0) == array[i].charAt(j) ) {
					count++;
				}
			}
		}
		System.out.println("the character " + pos.charAt(0) + " appears: " + count + " times");
		
		
		//return array;
	}
	

}
