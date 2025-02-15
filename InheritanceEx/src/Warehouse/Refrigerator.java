package Warehouse;

public class Refrigerator extends Machines{
	boolean froze=false;

	public Refrigerator(char energyRating, float wconsumption, boolean froze) {
		super(energyRating, wconsumption);
		this.froze = froze;
	}

	public boolean isFroze() {
		return froze;
	}

	public void setFroze(boolean froze) {
		this.froze = froze;
	}

	@Override
	public String toString() {
		return "Refrigerator [froze=" + froze + "] " + super.toString();
	}
	
	
	

}
