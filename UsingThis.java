class This
{
	//TAKING BIKE FEATURES

	String brand;
	String name;
	double mileage;
	String engineType;
	String maxPower;
	int fuelCap;
	String bodyType;

	public void displayBike()
	{
		String brand = "Royal Enfield";
		String name = "Name"; //LOCAL VARIABLE HAVE MORE REFERENCE

		System.out.println("Brand:"+brand);
		System.out.println("Name:"+this.name);
		System.out.println("Mileage(kmpl):"+mileage);
		System.out.println("Engine Type:"+engineType);
		System.out.println("Maximum Power:"+maxPower);
		System.out.println("Fuel Capacity(L):"+fuelCap);
		System.out.println("Body Type:"+bodyType);
		System.out.println("***************************************");
		System.out.println();
	}
}

class UsingThis 
{
	public static void main(String[] args) 
	{
		This bike1 = new This();
		bike1.name = "Classic 350";
		bike1.mileage = 41.55;
		bike1.engineType = "4 Stroke, Air-Oil Cooled Engine, Spark Ignition, Single Cylinder";
		bike1.maxPower = "20.21 PS @ 6100 rpm";
		bike1.fuelCap = 13;
		bike1.bodyType = "Cruiser Bikes";
		bike1.displayBike();

		This bike2 = new This();
		bike2.name = "Meteor 350";
		bike2.mileage = 41.88;
		bike2.engineType = "Single-Cylinder, 4 Stroke, Air-Oil Cooled Engine";
		bike2.maxPower = "20.4 PS @ 6100 rpm";
		bike2.fuelCap = 15;
		bike2.bodyType = "Cruiser Bikes,Roadster Bikes";
		bike2.displayBike();

		
		This bike3 = new This();
		bike3.name = "Hunter 350";
		bike3.mileage = 36.2;
		bike3.engineType = "Single cylinder, 4 stroke, SOHC Engine";
		bike3.maxPower = "20.4 PS @ 6100 rpm";
		bike3.fuelCap = 13;
		bike3.bodyType = "Cruiser Bikes";
		bike3.displayBike();

	}
}
