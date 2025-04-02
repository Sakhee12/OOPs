class Mango
{
	double price;
	String name;
	String origin;

	public Mango printPrice()
	{
		System.out.println(price);
		return this;
	}

	public Mango printName()
	{
		System.out.println(name);
		return this;
	}

	public Mango printOrigin()
	{
		System.out.println(origin);
		return this;
	}
}

class MangoDriver 
{
	public static void main(String[] args) 
	{
		Mango m1 = new Mango();
		m1.price = 2000.0;
		m1.name = "Hapus";
		m1.origin = "Rantangiri";

		m1.printPrice().printName().printOrigin();
	}
}
