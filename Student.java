public class Student
{
	//Instance fields
	private String name; 
	private int age; 
	
	//Static fields - each student doesn't need to know this
	private static int oldestStudent = 0;
	
	//Methods
	public String toString()
	{
		return "The student, " + name + " , is " + age + " years old."; 
	}
	
	public int hasBirthday()
	{
		age++; 
		if (age > oldestStudent)
			oldestStudent = age; 
		return age; 
	}
	
	//Constructors
	public Student()
	{	
		this("No Name Given", 0); 
	}
	
	public Student(String name)
	{
		this(name, 0); 
	}
	
	public Student(int age)
	{
		this("No Name Given", age); 
	}
	
	public Student(String name, int age)
	{
		this.name = name; 
		this.age = age; 
		if (this.age > oldestStudent)
			oldestStudent = this.age; 		
	}
	
	//Accessors
	public String returnName()
	{
		return name; 
	}
	
	public int returnAge()
	{
		return age; 
	}
	
	//Static field --> static accessor
	public static int returnOldest()
	{
		return oldestStudent; 
	}
}