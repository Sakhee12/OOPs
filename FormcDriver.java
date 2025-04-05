//CONSTRUCTOR CHAINING

class Formc
{
	String name;
	long phno;
	String dob;
	String email;
	long tele;
	String blood;

	Formc()
	{
		System.out.println("Cons1");
		System.out.println();
	}

	Formc(String name,long phno,String dob,String email)
	{	
		this.name = name;
		this.phno = phno;
		this.dob = dob;
		this.email = email;

		System.out.println("Cons2");
		System.out.println();
	}

	Formc(String name,long phno,String dob,String email,long tele)
	{
		this(name,phno,dob,email);
		this.tele = tele;
		
		System.out.println("Cons3");
		System.out.println();
	}

	Formc(String name,long phno,String dob,String email,long tele,String blood)
	{
		this(name,phno,dob,email,tele);
		this.blood = blood;
		
		System.out.println("Cons4");
		System.out.println();

	}

	Formc(String name,long phno,String dob,String email,String blood)
	{
		this(name,phno,dob,email);
		this.blood = blood;
		
		System.out.println("Cons5");
		System.out.println();
	}

	public void displayFormc()
	{
		System.out.println("Name: "+name);
		System.out.println("Phone No:"+phno);
		System.out.println("Date of Birth:"+dob);
		System.out.println("Email id:"+email);
		System.out.println("Blood Group:"+blood);
		System.out.println("TelePhone No:"+tele);
		System.out.println();
	}

}
class  FormcDriver
{
	public static void main(String[] args) 
	{
		Formc f1 = new Formc("Raju",561795212,"12/2/45","rani@gmail.com","AB+");
		f1.displayFormc();

		
	}
}
