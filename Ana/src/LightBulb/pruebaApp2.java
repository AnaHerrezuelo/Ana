package LightBulb;

public class pruebaApp2 {	
	String color, title;
	pruebaApp values;
	
	pruebaApp2(){
//		this.color=color;
//		this.title=title;
	}
	
	pruebaApp2(String color, String title){
		this.color=color;
		this.title=title;

	}
	pruebaApp2(String color, String title, 	pruebaApp values){
	this.color=color;
	this.title=title;
	this.values = values; 
}


	
//	pruebaApp2(String color, String title, int one, int two, int three){
//		this.color=color;
//		this.title=title;
//		this.app1 = new pruebaApp1(one, two,three); 
//	}


	public void printToString() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "pruebaApp2 [color=" + color + ", title=" + title + ", values=" + values + "]";
	}
	
	




    
    
	
	
}
