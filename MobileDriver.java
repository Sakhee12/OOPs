class Mobile
{
	String brand;
	String model;
	double price;
	int ram;
	int rom;
	String processor;
	int battery;
	int noOfCam;

	public void mobileDisplay()
	{
		System.out.println("Brand:"+brand);
		System.out.println("Model:"+model);
		System.out.println("Price:"+price);
		System.out.println("Ram:"+ram);
		System.out.println("Rom"+rom);
		System.out.println("Processor:"+processor);
		System.out.println("Battery:"+battery);
		System.out.println("No Of Camera:"+noOfCam);
		System.out.println("***************************************");
	}
}

class MobileDriver
{
	public static void main(String[] args) 
	{
		Mobile m1 = new Mobile();
		m1.mobileDisplay();
		m1.brand = "Apple";
		m1.model = "15 Pro";
		m1.ram = 16;
		m1.rom = 500;
		m1.processor = "SnapDragon";//diamonsity optacore
		m1.battery = 800;
		m1.noOfCam = 3;
		m1.mobileDisplay();

		Mobile m2 = new Mobile();
		m2.mobileDisplay();
		m2.brand = "SamSung";
		m2.model = "S25";
		m2.ram = 16;
		m2.rom = 600;
		m2.processor = "diamonsity";// optacore
		m2.battery = 600;
		m2.noOfCam = 5;
		m2.mobileDisplay();

		Mobile m3 = new Mobile();
		m3.mobileDisplay();
		m3.brand = "Vivo";
		m3.model = "V40";
		m3.ram = 16;
		m3.rom = 700;
		m3.processor = "optacore";
		m3.battery = 900;
		m3.noOfCam = 4;
		m3.mobileDisplay();

		
	}
}
