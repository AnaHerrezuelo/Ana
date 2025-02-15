package Methods;

import java.util.Scanner;

public class StringsNotes {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		
//		String words [] = new String [2];
//		words[0]="hola";
//		words[1]="adiós";
		

		
//		String [] words = {"primera", "segunda", "tercera"};
//		
//		for(int i=0; i<words.length;i++) {
//			System.out.println(words[i]);
//		}
		
		
		
		
//		String word ="únicaa";
		/* charAt 
		word.charAt(position of the letter)
		
			//print "u"
				System.out.println(word.charAt(0));
			
			//print the entire word
					for(int i=0; i<word.length(); i++) {
						System.out.print(word.charAt(i));
					}
		
			//print the word in reverse
				for(int i=word.length()-1; i>=0; i--) {
					System.out.println(word.charAt(i));
				}
		
		//print how many times the letter appears
				System.out.println("give me a character: ");
				String character = keyboard.nextLine();
				int count = 0;
				for(int i=0; i<word.length(); i++) {
					if(word.charAt(i)==character.charAt(0)){
						count++;
					};
				}
				System.out.println(count + " veces sale");
		*/		
		 
		
		
		/* Boolean equals 
		(case sensitive) 
		
			String word1="Days";
			String word2="Días";
			
//			String sol= word1.equals(word2);
			
			if(word1.equals(word2)) {
				System.out.println("same");
			}else {
				System.out.println("not the same");
			}
		*/
		
		
		
		/* Boolean equals 
		(case NOT sensitive) 
		
			String word1="DÍAS";
			String word2="Días";
			
			if(word1.equalsIgnoreCase(word2)) {
				System.out.println("same");
			}else {
				System.out.println("not the same");
			}
		
		*/
		
		
		
		/* indexOf(int ch, int from Index) 
			String sentence = "Frase para buscar";
			char letter = 'a';
			int pos;
			
			pos = sentence.indexOf(letter,0);
			System.out.println(pos);
		*/
		
		

			
		/* int compareTo(String)		
			String word1="Días";
			String word2="Días";
			int value;
			
			value = word1.compareTo(word2);
			System.out.println(value);
		*/
		
		
		
		
		/* int compareTo(String)
		//Case is not taken in count
			
			String word1="DÍAS";
			String word2="Días";
			int value;
			
			value = word1.compareToIgnoreCase(word2);
			System.out.println(value);
		*/
		
		
		
		/* String toLowerCase/toUpperCase  
		String word="HELLO WOLRD";
		String word2="Bye World";
		word=word.toLowerCase();
		System.out.println(word);
		
		word2=word2.toUpperCase();
		System.out.println(word2);
		*/
		
		/* Type Conversions */
		
		
		

	}//end main

}
