package Methods;

import java.util.Scanner;

public class Exa1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int selection = 0;
		int ticket = -1;
		int servwin=0;
		boolean a = false;
		int size=1;
		int [] list1 = new int [size];
		int [] list2 = new int [size];
		
		do {
			System.out.println("Choose a option (1-3): ");
			System.out.println("1: Take a ticket number");
			System.out.println("2: print the list");
			System.out.println("3: Exit");
			
			selection = keyboard.nextInt();
			if(selection>4 || selection < 0 && a == false) {
				System.out.println("the selection must be between 1 and 3!!!");
			}else {
				a= true;
				if(selection == 1) {
					System.out.println("What Service do u want to use? (0-9: ");
					servwin=keyboard.nextInt();
						
					while(servwin>10 || servwin<-1) {
						System.out.println("What Service do u want to use must be between 0-9: ");
						System.out.println("What Service do u want to use? (0-9: ");
						servwin=keyboard.nextInt();
					}
					if(ticket>100) {
						ticket=0;
						//size++;
						list1[0] = servwin;
						list1[0] = ticket;
						//System.out.println();
					}else if(ticket<100){
						ticket++;
						//size++;
						list1[0] = servwin;
						list2[0] = ticket;
					}//if ticket
				
				}else if(selection == 2){
					//System.out.println("Service Windows: " + servwin + " Ticket: " + ticket);
					for(int i=0; i<size; i++) {
						System.out.println("Service Windows: " + list1[i] + " Ticket: "+ list2[i]);
						
					}
				}//if selection
			}
			

		
		}while(selection  != 3);
		

	}//end main
	

}//end class
