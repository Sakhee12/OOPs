//USING PARAMTERIZED & NO ARGUMENT CONSTRUCTOR

class Student
{
	String name;
	int age;
	String coll;
	String degree;
	int roll;


	
	{
		System.out.println("Non Static Block");
	}
	
	static 
	{
		System.out.println("Static Block");
	}

	Student()
	{
		System.out.println("No Argument Constructor Starts");
		System.out.println(this);
		System.out.println("No Arg Con Ends");
		System.out.println();
	}

	Student(String name,int age,String coll,String degree,int roll)
	{
		System.out.println("Para Con Starts");
		this.name = name;
		this.age = age;
		this.coll = coll;
		this.degree = degree;
		this.roll = roll;
		System.out.println("Para Con Ends");
		System.out.println();
	}
	public void displayStudent()
	{
		String name = "Mighty Raju";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(this);
		System.out.println(age);
		System.out.println(coll);
		System.out.println(degree);
		System.out.println(roll);
		System.out.println();
	}
}

class  StudentDriver
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		Student s1 = new Student("Raju",21,"FC","BE",101);
		
		s1.displayStudent();

		Student s3 = new Student();
	
		Student s2 = new Student("Teju",22,"MG","BCA",102);
		
		s2.displayStudent();
		System.out.println("Main Ends");
		System.out.println();
		}
}
