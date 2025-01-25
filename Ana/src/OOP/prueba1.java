package OOP;

public class prueba1 {
	int height, lenght, width;
	String brand, model;
	
	public prueba1(int h, int l, String b, String m){
		height=h;
		lenght=l;
		brand=b;
		model=m;
	}
	
	public void printPrinter() {
		System.out.println(this.toString());
	}
	

	
	public int getHeight() {
		return this.height;
	}

	@Override
	public String toString() {
		return "prueba [height=" + height + ", lenght=" + lenght + ", width=" + width + ", brand=" + brand + ", model="
				+ model + "]";
	}//end toString
	
	
	
}
