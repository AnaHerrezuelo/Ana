package Warehouse;

public class appliances_App {
	public static void main(String[] args) {
		
		final int  MAX=6;
		Machines[] machine = new Machines[MAX];
		machine[0]=new Machines('a',34);
		machine[1]=new Machines('a',34);
		machine[2]=new WaterWasters('a',34,45);
		machine[3]=new WaterWasters('a',34,56);
		machine[4]=new Refrigerator('a',34,true);
		machine[5]=new Refrigerator('a',34,false);
		
		for(int i=0; i<machine.length; i++) {
			System.out.println(machine[i].toString());
		};
		
		machine[0]=null;
		machine[2]=null;
		machine[4]=null;
		
		System.out.println(" - - - - - -");
		
		for(int i=0; i<machine.length; i++) {
			System.out.println(machine[i].toString());
		};
		



	}//end public static void main(String[] args) 
}// end appliances_App
