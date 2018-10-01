
public class MyFuelCost {
	

	public double smallCar(double mileage,double distance , double costPerKm) {
		double cost = mileage * distance * costPerKm;
		return cost;
	}

	public double SUV(double mileage, double distance, double costPerKm, double levy) {
		double cost = mileage * distance* costPerKm * levy;
		return cost;
	}

}
