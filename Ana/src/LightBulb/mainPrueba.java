package LightBulb;

public class mainPrueba {
	
	public static void main(String[] args) {
		pruebaApp first = new pruebaApp(67,54,32);
		pruebaApp second = new pruebaApp();
		
//		first.printToString();
//		second.printToString();
		
		pruebaApp2 values1 = new pruebaApp2("red", "in red", first); 
		pruebaApp2 values2 = new pruebaApp2("blue", "in blue", first); 
		values1.printToString();
		values2.printToString();
		
		
		pruebaAppArray [] array = new pruebaAppArray[5];
		array[0]=new pruebaAppArray();
		
		
		
		
	}
}
