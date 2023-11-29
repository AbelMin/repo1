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

public abstract class Beverage {
	
	private String name;
	private SIZE size;
	private TYPE type;
	private final double PRICE = 2;
	
	
	
	public Beverage(String name, SIZE size) 
	{
		this.name = name;
		this.size = size;
	}
	
	
	
	@Override
	public String toString() 
	{
		return "name is : "
				+ getName()
				+ " size : "
				+ getSize();
	}
	
	

	@Override
	public boolean equals(Object object) 
	{
		
		Beverage anotherBev = (Beverage) object;

		
		if (!name.equals(anotherBev.name)) 
		{
			return false;
		}
		
		if (size != anotherBev.size)
		{
			return false;
		}
		
		if (type != anotherBev.type)
		{
			return false;
		}
		
		return true;
	}
	
	
	
	public abstract double calcPrice(); 
	

	public String getName() 
	{
		return name;
	}
	

	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	
	public SIZE getSize() 
	{
		return size;
	}
	

	
	public void setSize(SIZE size) 
	{
		this.size = size;
	}
	
	
	
	public TYPE getType() 
	{
		return type;
	}
	
	
	
	public void setType(TYPE type) 
	{
		this.type = type;
	}
	
	
	public double getBasePrice() 
	{
		return PRICE;
	}
	
	
	
	public String getBevName() 
	{
		return name;
	}
	
}