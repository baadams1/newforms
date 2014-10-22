package com.cs490;

public class OnlineForm {
	// Default Constructor
	private int id;
	//private String studentName;
	private String courseDept;
	private int courseNumber;
	private String semester;
	private int year;
	private String title;
	
	
	public OnlineForm(int id, String courseDept, int courseNumber, String semester, int year, String title)
	{
		this.id = id;
		//this.studentName = studentName;
		this.courseDept = courseDept;
		this.courseNumber = courseNumber;
		this.semester = semester;
		this.year = year;
		this.title = title;
	}
	
	public OnlineForm(String courseDept, int courseNumber, String semester, int year, String title)
	{
		id = 0;
		//this.studentName = studentName;
		this.courseDept = courseDept;
		this.courseNumber = courseNumber;
		this.semester = semester;
		this.year = year;
		this.title = title;
	}
	
	public String toString()
	{
		String result = "id: " + id + " Course dept: " + courseDept + "(" + courseNumber + ") " + "Semester: " + semester + "(" + year + ") " + "Title: " + title;
		return result;
	}
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) throws InputMismatchException{
	
		try{
			
			if(id < 0){
				System.out.println{"Error- Please enter a non-negative integer");
				
			}else{
			
				this.id = id;
			
			}
		}catch(InputMismatchException e){
		
			System.out.println("Error - Value to be set was not a Integer);
		}
		
	}
	
	/**
	public String getStudentName()
	{
		return studentName;
	}
	
	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}
	*/
	
	public String getCourseDept()
	{
		return courseDept;
	}
	
	public void setCourseDept(String courseDept) throws InputMismatchException{
	
		try{
		
			if(courseDept.equals(null) || courseDept != ""){
			
				System.out.println("Error - Invalid input.");
			
			}else{
			
				this.courseDept = courseDept;
			}
		}catch(InputMismatchException e){
		
			System.out.println("Error - Value to be set was not a String");
		
		}
		

	}
	
	public int getCourseNumber()
	{
		return courseNumber;
	}
	
	public void setCourseNumber(int courseNumber) throwsMismatchException{
	
		try{
		
			if(courseNumber < 100){
				
				System.out.println("Error - Invalid input");
			
			}else{
			
				this.courseNumber = courseNumber;
			
			}
		}catch(InputMismatchException e){
			
				System.out.println("Error- Value to be set was not above 100");
		}
		
	}
	
	public String getSemester()
	{
		return semester;
	}
	
	public void setSemester(String semester) throws InputMismatchException{
	
		try{	
		
			if(semester.equals{null} || semester != ""){
			
				System.out.println("Error - Invalid Input.");
			
			}else{
			
				this.semester = semester;
			}
			
		}catch(InputMismatchException e){
		
			System.out.println("Error-Value to be set was not a String");
		}
			
	
		
	}
	
	public int getYear() 
	{
		return year;
	}
	
	public void setYear(int year) throws InputMismatchException{
	
		try{
		
			if(year < 1900){
			
				System.out.println("Error - Invalid input");
			
			}else{
			
				this.year = year;
			}
		}catch(InputMismatchException e){
		
			System.out.println("Error-Value to be set was not above 1900");
		}
	
		
	}
	
	public String getTitle() 
	{
		return title;
	}
	
	public void setTitle(String title) throws InputMismatchException{
	
		try{
		
			if(title.eqausl(null) || title != ""){
			
				System.out.println("Error - Invalid input.");
			
			}else{
			
				this.title = title;
			}
		}catch(InputMismatchException e){
		
			System.out.println("Error- Value to be set was not a String.");
		}
	
		
	}
}
	
	
	