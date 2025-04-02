//STATIC BLOCK

class Shoe
{
	String name = "HNike";
	double price;
	int size;
	String color;
	String type;
	{
		System.out.println("OBJECT LOADING");
		if (name.charAt(0)=='N')
		{
			price=1000.0;
		}
		else
			price=500.0;

		size = 7;
		color = "White";
		type = "Sports";
	}

	public void displayShoe()
	{
		System.out.println(name);
		System.out.println(price);
		System.out.println(size);
		System.out.println(color);
		System.out.println(type);
	}
}

class ShoeDriver
{
	public static void main(String[] args) 
	{
		Shoe s1 = new Shoe();
		s1.displayShoe();
	}
}
