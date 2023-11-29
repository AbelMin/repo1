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

public class Alcohol extends Beverage {

	private boolean isWeekend;
	
	
	public Alcohol(String name, SIZE size, boolean b) 
	{
		super(name,size);
		this.isWeekend = b;
		setType(TYPE.ALCOHOL);
	}
	
	
	
	@Override
	public double calcPrice() 
	{
		double priceValue = this.getBasePrice();
		
		if(isWeekend())
		{
			priceValue += 0.6;
		}
		
		if(getSize()==SIZE.MEDIUM)
		{
			priceValue += 1;
		}
		
		if(getSize() == SIZE.LARGE)
		{
			priceValue += 2;
		}
		
	 return priceValue;
	 
	}
	

	@Override
	public String toString() 
	{
		return getName() + " " + getSize() + " " + isWeekend() + " " + calcPrice(); 	
	}
	
	
	@Override
	public boolean equals(Object object) 
	{
		Alcohol temp = (Alcohol) object;

	
		if (!super.equals(object))
		{
			return false;
		}
		
		
		if (isWeekend != temp.isWeekend)
		{
			return false;
		}
		
		return true;
	}
	
	
	public void setOfferedWeekend(boolean isWeekend)
	{
		this.isWeekend = isWeekend;
	}
	
	public boolean isWeekend() 
	{
		return isWeekend;
	}


	
}