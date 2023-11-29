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

public class Smoothie extends Beverage{
	
	private int numFruit;
	private boolean addProtein;

	
	public Smoothie(String name, SIZE size, int numFruit, boolean protPow) 
	{
		super(name, size);
		this.numFruit = numFruit;
		this.addProtein = protPow;
		setType(TYPE.SMOOTHIE);
	}


	@Override
	public double calcPrice() 
	{
		double valuePrice = this.getBasePrice() + getNumOfFruits() * 0.5;
		
		if(getAddProtein())
		{
			valuePrice += 1.5;
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
	
	
	

	@Override
	public String toString() 
	{
		return getBevName() + " "
				+ getSize()+ " " 
				+ getAddProtein() +" "
				+ calcPrice() + " "
				+ getNumOfFruits() ;
	}

	
	
	@Override
	public boolean equals(Object object) {
		
		Smoothie anotherSmth = (Smoothie) object;
		
		if (!super.equals(object))
		{
			return false;
		}
		
		if (numFruit != anotherSmth.numFruit)
		{
			return false;
		}
		
		if (addProtein != anotherSmth.addProtein)
		{
			return false;
		}
		
		return true;
	}


	public int getNumOfFruits() 
	{
		return this.numFruit;
	}

	
	public void setNumberFruits(int fruits) 
	{
		this.numFruit = fruits;
	}
	
	
	
	public void setProteinPowder(boolean proteinPowder) 
	{
		this.addProtein = proteinPowder;
	}
	
	
	public boolean getAddProtein() 
	{
		return addProtein;
	}

	

}