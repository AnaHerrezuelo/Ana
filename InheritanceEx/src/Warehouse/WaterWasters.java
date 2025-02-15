package Warehouse;

public class WaterWasters extends Machines{
	int avgWaterConsumption;

	public WaterWasters(char energyRating, float wconsumption, int avgWaterConsumption) {
		super(energyRating, wconsumption);
		this.avgWaterConsumption = avgWaterConsumption;
	}

	public int getAvgWaterConsumption() {
		return avgWaterConsumption;
	}

	public void setAvgWaterConsumption(int avgWaterConsumption) {
		this.avgWaterConsumption = avgWaterConsumption;
	}

	@Override
	public String toString() {
		return  "WaterWasters [avgWaterConsumption=" + avgWaterConsumption + "] " + super.toString();
	}
	
	
	
	
	
}
