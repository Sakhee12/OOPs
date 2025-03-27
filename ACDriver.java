class AC
{
	String brand;
	double price;
	double ton;
	int maxtemp;
	int mintemp;
	int ambtemp;

	public void displayAC()
	{
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
		System.out.println("Ton:"+ton);
	}

	public void maxTemp()
	{
		System.out.println("Maximun Temperature:"+maxtemp);
	}

	public void minTemp()
	{
		System.out.println("Minimum Temperature:"+mintemp);
	}

	public void ambTemp()
	{
		System.out.println("Ambient Temperature:"+ambtemp);
	}
}

class ACDriver 
{
	public static void main(String[] args) 
	{
		AC a1 = new AC();
		a1.brand = "BlueStar";
		a1.price = 30000;
		a1.ton = 1.5;
		a1.maxtemp = 35;
		a1.mintemp = 14;
		a1.ambtemp = 25;
		
		//CALLING SPECIFIC METHOD FOR SPECIFIC TERM

		a1.displayAC();

		a1.maxTemp();

		a1.minTemp();

		a1.ambTemp();
	}
}
