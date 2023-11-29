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

public class Coffee extends Beverage {
	

	private boolean extraCoffe, extraSyrup;
	
	
	public Coffee(String name, SIZE size, boolean extraCoffe, boolean extraSyrup) 
	{
		super(name, size);
		this.extraCoffe = extraCoffe;
		this.extraSyrup = extraSyrup;
		setType(TYPE.COFFEE);
	}


	@Override
	public String toString() {
		return getName() + " "
				+ calcPrice()+ " " 
				+ getSize() + " "
				+ getExtraShot() + " "
				+ getExtraSyrup(); 
	}

	
	@Override
	public boolean equals(Object object) 
	{
		Coffee another = (Coffee) object;

		
		if (extraCoffe != another.extraCoffe)
		{
			return false;
		}
		
		if (extraSyrup != another.extraSyrup)
		{
			return false;
		}
		
		return true;
	}

	
	@Override
	public double calcPrice() 
	{
		double valuePrice = this.getBasePrice();
		
		if(getExtraShot())
		{
			valuePrice += 0.5;
		}
		
		if(getExtraSyrup())
		{
			valuePrice +=  0.5;
		}
		
		if(getSize() == SIZE.MEDIUM)
		{
			valuePrice += 1;
		}
		
		if(getSize() == SIZE.LARGE)
		{
			valuePrice += 2;
		}
		
	 return valuePrice;
	}
	
		
	public void setExtraCoffe(boolean extraCoffe) 
	{
		this.extraCoffe = extraCoffe;
	}
	
	

	public void setxtraSyrup(boolean extraSyrup)
	{
		this.extraSyrup = extraSyrup;
	}


	

	public boolean getExtraSyrup()
	{
		return extraSyrup;
	}

	


	public boolean getExtraShot() 
	{

		return extraCoffe;
	}
	
	

}

