public class Runner
{
	public static void main(String[] args)
	{
		//Runner for Student Class
		Student tom = new Student("Tom", 16); 
		Student jem = new Student("Jem", 12); 
		Student newborn = new Student("Drew"); 
		
		System.out.println(tom); 
		System.out.println(jem); 
		System.out.println(newborn);
		
		System.out.println("Jeremy had a birthday!"); 
		jem.hasBirthday(); 
		
		System.out.println("Drew had two birthdays!"); 
		newborn.hasBirthday(); 
		newborn.hasBirthday(); 
		
		System.out.println("Jeremy is now " + jem.returnAge() + " years old."); 
		System.out.println("Drew is now " + newborn.returnAge() + " years old."); 
		
		System.out.println("The age of the oldest student is: " + Student.returnOldest()); 
		
		//Runner for Course Class
		Course math = new Course("Math", "Thomson");  
		
		//Put students into math class
		math.enrollStudent(tom); 
		math.enrollStudent(jem);  
		
		//Add a grade for a student within a course
		math.setGrade(tom, .95); 
		math.setGrade(jem, .93); 
		
		System.out.println("After adding grades to the gradebook, Tom's grade is " + (math.getGrades()).get(0) * 100 + "%"); 
		System.out.println("After adding grades to the gradebook, Jem's grade is " + (math.getGrades()).get(1) * 100 + "%"); 
		
		
		
		System.out.println(math); //Calling toString		
		
	}
}