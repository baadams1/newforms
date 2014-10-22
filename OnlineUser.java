package com.cs490;

public class OnlineUser {
	// Default Constructor
	private int id;
	private String userName;
	private String user_firstName;
	private String user_lastName;
	private String user_email;
	private String user_password;
	private Boolean user_inactive = true;
	
	public OnlineUser(int id, String userName, String user_firstName, String user_lastName, String user_email, String user_password, Boolean user_inactive)
	{
		setId(this.id);
		setUserName(this.userName);
		this.user_firstName = user_firstName;
		this.user_lastName = user_lastName;
		this.user_email = user_email;
		this.user_password = user_password;
		this.user_inactive = user_inactive;
	}
	
	public OnlineUser(String userName, String user_firstName, String user_lastName, String user_email, String user_password)
	{
		
		setUsername(this.userName);
		setFirstName(this.user_firstNamet);
		setLastName(this.user_lastName);
		setEmail(this.user_email);
		setUserPassword(this.user_password);
		
	}
	
	public String toString()
	{
		String result = "id: " + id + " username: " + userName + " user firstname: " + user_firstName + "user lastname: " + user_lastName + "user email: " + user_email + "user password: " + user_password + "user inactive: " + user_inactive;
		return result;
	}
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) throws InputMismatchException{
		
		try{
			
			if(id < 0){
				
				System.out.println("Error - Please enter a non-negative integer.");
				
			}else{
			
				this.id = id;
			}
		}catch(InputMismatchException e){
		
			System.out.println("Error - Value to be set was not a Integer. Please enter a Integer (i.e. 1,2,3).");
			
		}
	}
	
	public String getUsername()
	{
		return userName;
	}
	
	public void setUsername(String userName) throws InputMismatchException{
	
		try{
			
			if(userName.equals(null) || userName!= ""){
				
				System.out.println("Error - Invalid input.");
				
			}else{
			
				this.userName = userName;
			}
		}catch(InputMismatchException e){
			
			System.out.println("Error - Value to be set was not a String. Please enter a String (i.e. Carl_name, Sam_here)");
		}	
	}
	
	public String getFirstName()
	{
		return user_firstName;
	}
	
	public void setFirstName(String user_firstName) throws InputMismatchException{
	
		try{user_firstName.equals(null) || user_firstName != ""){
			
				System.out.println("Error - invalid input.");
			}else{
				
				this.user_firstName = user_firstName;
			}
		}catch(InputMismatchException e){
		
			System.out.println("Error-Value to be set was not a String");
		}
			
		
	}
	
	public String getLastName()
	{
		return user_lastName;
	}
	
	public void setLastName(String user_lastName) throws InputMismatchException{
	
		try{
		
			if(user_lastName.equals(null) || user_lastName != ""){
			
				System.out.println("Error-Invalid input.");
			
			}else{
			
				this.user_lastName = user_lastName;
			}
		}catch(InputMismatchException e){
		
			System.out.println("Error- Value to be set was not a String");
			
		}
	
		
	}
	
	public String getEmail()
	{
		return user_email;
	}
	
	public void setEmail(String user_email) throws InputMismatchException{
	
		try{
		
			if(user_email.equals(null) || user_email != "") {
			
				System.out.println("Error - Invalid input.");
			
			}else{	
				
				this.user_email = user_email;
			
			}
		}catch(InputMismatchException e){
			
			System.out.println("Error - Value to be set was not a String");
		}
	}
	
	public String getPassword()
	{
		return user_password;
	}
	
	public void setPassword(String user_password) throws InputMismatchException{
		
			try{
			
				if(user_password.equals(null) || user_password != ""){
					
					System.out.println("Error - Invalid input.");
				
				}else{
					
					this.user_password = user_password;
				
				}
			}catch(InputMismatchException e{
				
				System.out.println("Error- Value to be set was not a String");
			}
			
	
	}
	
	public Boolean getInactive() 
	{
		return user_inactive;
	}
	
	public void setInactive()
	{
		if(user_inactive)
		{
			user_inactive = false;
		}
		else
		{
			user_inactive = true;
		}
	}	
}
	
	
	