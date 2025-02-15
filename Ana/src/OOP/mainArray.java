package OOP;


public class mainArray {
	public static void main(String[] args) {
		array [] ej = new array [3];
		ej[0]=new array(2,"red");
		ej[1]=new array(45, "blue");
		ej[2]=new array(234, "green");
		
		for(int i=0; i < ej.length; i++) {
			ej[i].printToString();
		}
	}
}
