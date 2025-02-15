package OOP;

public class array {
	int num;
	String color;
	array(){
		
	}
	array (int num, String color){
		this.num=num;
		this.color=color;
	}
	
	
	
	//PRINT
	public void printToString() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "array [num=" + num + ", color=" + color + "]";
	}

	
}
