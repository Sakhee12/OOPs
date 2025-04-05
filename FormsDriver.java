//CONSTRUCTOR OVERLOADING

class Forms
{
	String name;
	long phno;
	String dob;
	String email;
	long tele;
	String blood;

	Forms()
	{
		System.out.println("Cons1");
	}//Pascal Case

	Forms(String name,long phno,String dob,String email)
	{
		this.name = name;
		this.phno = phno;
		this.dob = dob;
		this.email = email;
		System.out.println("Cons2");
	}

	Forms(String name,long phno,String dob,String email,long tele)
	{
		this.name = name;
		this.phno = phno;
		this.dob = dob;
		this.email = email;
		this.tele = tele;
		System.out.println("Cons3");
	}

	Forms(String name,long phno,String dob,String email,long tele,String blood)
	{
		this.name = name;
		this.phno = phno;
		this.dob = dob;
		this.email = email;
		this.tele = tele;
		this.blood = blood;
		System.out.println("Cons4");
	}

	Forms(String name,long phno,String dob,String email,String blood)
	{
		this.name = name;
		this.phno = phno;
		this.dob = dob;
		this.email = email;
		this.blood = blood;
		System.out.println("Cons5");
	}

	public void displayForms()
	{
		System.out.println("Name: "+name);
		System.out.println("Phone No:"+phno);
		System.out.println("Date of Birth:"+dob);
		System.out.println("Email id:"+email);
		System.out.println("Blood Group:"+blood);
		System.out.println("TelePhone No:"+tele);
	}
}

class  FormsDriver
{
	public static void main(String[] args) 
	{
		
		Forms f1 = new Forms();
		f1.displayForms();

		Forms f2 = new Forms("Raju",561795212,"12/2/45","rani@gmail.com");
		f2.displayForms();

		//new Forms().displayForms();
	}
}
