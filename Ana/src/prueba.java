import java.util.Scanner;

public class prueba {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		 //int tamaño=4; 
		
		//System.out.println("dime un número: "); 
		//tamaño=keyboard.nextInt();
		
        /* TRIÁNGULO
        for (int y = 0; y < tamaño; y++) {  
            for (int x = 0; x < y; x++) {  
                System.out.print("*"); 
            }
            System.out.println(); 
        }
        */
		 
		 /*TRIÁNGULO CENTRADO
        
        for (int i = 1; i <= tamaño; i++) {  
            System.out.print("a");  
            for (int j = 1; j <= tamaño - i; j++) {
                System.out.print("o");
            }
            
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");  
            }
            
            System.out.println();  
        }
		*/
		 
		 
			/* COPY THE CONTENT OF AN ARRAY IN ANOTHER 
			
			int [] original  = {3,5,7,9};
			int copy[] = new int [original.length];
			
			//copia del original a la copia
			for(int i=0; i<copy.length; i++){
				copy[i]=original[i];
			};
			
			//impresión de la copia
			System.out.println("copia: ");
			for(int i=0; i<copy.length; i++){
				System.out.print(copy[i] + " ");
			};
			
			
			System.out.println(" ");
			//cambio del original para ver si no se refieren a lo mismo
			for(int i=0; i<original.length; i++){
				original[i]=0;
			};
			
			System.out.println("original: ");
			//impresión original
			for(int i=0; i<original.length; i++){
				System.out.print(original[i] + " ");
			};
		*/

		
		/* MATRIX OF DECIMALS (WORKS)        
		        System.out.print("Enter the number of rows and columns: ");
		        int rows = keyboard.nextInt();
		        int columns = rows;

		        
		        float[][] table = new float[rows][columns];

		        //System.out.println("Enter the elements of the matrix (decimal values):");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < columns; j++) {
		                System.out.print("Give me the number r/c " + i + "/" + j + ": ");
		                table[i][j] = keyboard.nextFloat();
		            }
		        }

		        // Display the matrix row by row
		        System.out.println("The matrix is:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < columns; j++) {
		                System.out.print(table[i][j] + "  ");
		            }
		            System.out.println(" "); // Move to the next row
		        }
		 */
		
		
		
		
		      
				//System.out.print("Give me the number: ");
		        int size = 8;
		    		        
		        int[][] matrix = new int[size][size];
		        
		        for (int i = 0; i < size; i++) {
		            for (int j = 0; j < size; j++) {
		                if (i == j) {
		                    matrix[i][j] = 1; // Set 1 on the main diagonal
		                } else {
		                    matrix[i][j] = 0; // Set 0 elsewhere
		                }
		            }
		        }
		        

		        for (int i = 0; i < size; i++) {
		            for (int j = 0; j < size; j++) {
		                System.out.print(matrix[i][j] + " ");
		            }
		            System.out.println(); // Move to the next row
		        }
		    
		

		
		
		
		
		
		
		
		
		
		
	};
}
