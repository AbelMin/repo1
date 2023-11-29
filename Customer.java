/*
 * Class: CMSC203 
 * Instructor:
 * Description: Making a program for drink purchase
 * Due: 12/03/2023
 * Platform/compiler:
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Abel Mintesnot
*/

public class Customer {
	private String name;
	private int age;
	

	
	public Customer(String name, int age) {
		this.age = age;
		this.name = name;
	}

	
	public Customer(Customer customer) {
		this.age = customer.age;
		this.name = customer.name;
	}

	
	
	@Override
	public String toString() {
		return getName() + " " + getAge() ;
	}

	
	
	public void setName(String name) {
		this.name = name;		
	}


	
	public void setAge(int age) {
		this.age = age;
		
	}


	
	public String getName() {
		return this.name;
	}
	

	
	public int getAge() {
		return this.age;
	}

}

