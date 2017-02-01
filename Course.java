import java.util.ArrayList; 

public class Course
{
	//Instance fields - each course has its own version of these
	private ArrayList<Student> students; 
	private ArrayList<Double> grades; 
	private String title; 
	private String teacher; 
	
	//Constructors
	public Course()
	{
		this("No Class", "Teacher Nobody"); 
	}
	
	public Course(String title, String teacher)
	{
		this.title = title; 
		this.teacher = teacher; 
		students = new ArrayList<Student>(); 
		grades = new ArrayList<Double>(); 
	}
	
	//Methods
	public double averageGrade()
	{
		double sum = 0; 
		for (double x : grades)
		{
			sum += x; 
		}
		return sum/grades.size(); 
	}
	
	public void setGrade(Student s, double grade)
	{
		//look for it in array list 
		int indexInArray = students.indexOf(s); 
		
		//add that grade at corresponding index 
		grades.set(indexInArray, grade); 
	}
	
	public int getEnrollment()
	{
		return students.size(); 
	}
	
	public void enrollStudent(Student a)
	{
		students.add(a); 
		
		//also add a spot in the grades array list
		grades.add(0.0); 
	}
	
	//This is whatever index toString is called on 
	public String toString()
	{
		return "The class titled " + title + " has " + students.size() + " students with an average grade of " + this.averageGrade() * 100 + "%"; 
	}
	
	//Accessors 
	public ArrayList<Student> getStudents()
	{
		return students;
	}
	
	public ArrayList<Double> getGrades()
	{
		return grades;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getTeacher()
	{
		return teacher; 
	}
	
}