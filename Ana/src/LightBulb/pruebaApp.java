package LightBulb;

public class pruebaApp {
	int one, two, three;
	int four;
	
	pruebaApp(){
		this.one=1;
		this.two=2;
		this.three=3;
	}
	pruebaApp(int one, int two, int three){
		this.one=one;
		this.two=two;
		this.three=three;
	}
	

	public int getOne() {
		return one;
	}


	public void setOne(int one) {
		this.one = one;
	}


	public int getTwo() {
		return two;
	}


	public void setTwo(int two) {
		this.two = two;
	}


	public int getThree() {
		return three;
	}


	public void setThree(int three) {
		this.three = three;
	}
	
	public void printToString() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "pruebaApp [one=" + one + ", two=" + two + ", three=" + three + "]";
	}
	
	

}
