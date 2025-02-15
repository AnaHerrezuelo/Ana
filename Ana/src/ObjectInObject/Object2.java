package ObjectInObject;

public class Object2 {
	String editorial, address;
	Object1 object2;
	
	



	public Object2() {
	}

	public Object2(String editorial, String address) {
		super();
		this.editorial = editorial;
		this.address = address;
	}
	
	public Object2(String editorial, String address, Object1 object2) {
		super();
		this.editorial = editorial;
		this.address = address;
		this.object2 = object2;
	}
	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	//PRINTTERS
	
	public void printToString() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return " [editorial=" + editorial + ", address=" + address + "]";
	}
	
	
	
}
