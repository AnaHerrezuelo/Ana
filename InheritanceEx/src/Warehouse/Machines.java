package Warehouse;

public class Machines {
	private int id;
	private static  int  total=0;
	private char energyRating;
	private float Wconsumption;
	
	public Machines () {}
	
	public Machines(char energyRating, float wconsumption) {
		super();
		this.id = total++;
		this.energyRating = energyRating;
		Wconsumption = wconsumption;
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		
		this.id = id;
	}

	public char getEnergyRating() {
		return energyRating;
	}

	public void setEnergyRating(char energyRating) {
		this.energyRating = energyRating;
	}

	public float getWconsumption() {
		return Wconsumption;
	}

	public void setWconsumption(float wconsumption) {
		Wconsumption = wconsumption;
	}
	
	

	//PRINTERS
	public void printToString() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Machines [id=" + id + ", energyRating=" + energyRating + ", Wconsumption=" + Wconsumption + "]";
	}
	
	
	
	
}
