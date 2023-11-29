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

import java.util.ArrayList;


public class BevShop implements BevShopInterfce {
	
	
	private int alcoholNum; 
	public ArrayList<Order> orders = new ArrayList<Order>(); 
	
	

	
	@Override
	public boolean validTime(int time) 
	{
		if(time >= MIN_TIME && time <= MAX_TIME)
		{
			return true; 
		}
		
		return false;
	}
	

	
	@Override
	public boolean eligibleForMore() 
	{
		if(this.alcoholNum == MAX_ORDER_FOR_ALCOHOL)
		{	
			return false;
		}
		
		return true;
	}


	
	@Override
	public boolean validAge(int age) 
	{
		if(age > MIN_AGE_FOR_ALCOHOL)
		{	
			return true;
		}	
		
		return false;
	}
	
	@Override
	public String toString() 
	{
		return orders + " " + totalMonthlySale();
	}
	


	@Override
	public void startNewOrder(int time, DAY day, String customerName, int customerAge) 
	{
		
		this.alcoholNum = 0;
		
		this.orders.add(new Order(time, day, new Customer(customerName,customerAge)));
	
	}
	

	
	

	@Override
	public void processCoffeeOrder(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) 
	{
		
		getCurrentOrder().addNewBeverage(bevName, size, extraShot, extraSyrup);
		
	}


	
	@Override
	public void processAlcoholOrder(String bevName, SIZE size) 
	{
		
		if(alcoholNum<=getMaxOrderForAlcohol()) 
		{
			
			getCurrentOrder().addNewBeverage(bevName, size);
			
			this.alcoholNum++;
			
		}
		
	}
	
	
	
	
	@Override
	public void processSmoothieOrder(String bevName, SIZE size, int numOfFruits, boolean addProtien)
	{
		getCurrentOrder().addNewBeverage(bevName, size, numOfFruits, addProtien);
	}


	
	@Override
	public int findOrder(int orderNo) 
	{
		
		for(int index = 0; index < this.orders.size(); index++) 
		{
			if(this.orders.get(index).getOrderNo() == orderNo) 
			{
				return index; 
			}
		}
		
		return -1;
	}


	
	@Override
	public double totalOrderPrice(int orderNo)
	{
		for(int index = 0; index < this.orders.size(); index++)
		{
			if(this.orders.get(index).getOrderNo() == orderNo)
			{
				return this.orders.get(index).calcOrderTotal();
			}
		}
		return 0;
	}
	

	
	@Override
	public double totalMonthlySale() 
	{
		double sum = 0;
		
		for(int index = 0; index < this.orders.size(); index++) 
		{
			sum += this.orders.get(index).calcOrderTotal();
		}
		
		return sum;
	}


	
	@Override
	public void sortOrders() 
	{

		for (int index = 0; index < this.orders.size(); index++) 
		{
	          for (int k = this.orders.size() - 1; k > index; k--) 
	          {
	              if (this.orders.get(index).compareTo(this.orders.get(k)) == 1) 
	              {
	            	  Order temp = this.orders.get(index);
	            	  
	                  this.orders.set(index,this.orders.get(k)) ;
	                  
	                  this.orders.set(k,temp);
	              }
	          }
	     }
		
	}


	
	@Override
	public Order getOrderAtIndex(int index) 
	{
		return this.orders.get(index);
	}


	
	public Order getCurrentOrder() 
	{
		
		return this.orders.get(this.orders.size()-1);
	}
	

	
	public int getMaxOrderForAlcohol() 
	{
		
		return MAX_ORDER_FOR_ALCOHOL;
	}
	

	
	public int getMinAgeForAlcohol() 
	{
		
		return MIN_AGE_FOR_ALCOHOL;
	}

	
	
	public int getNumOfAlcoholDrink() 
	{
		return alcoholNum;
	}
	

	
	
	public boolean isMaxFruit(int numOfFruits) 
	{
		
		if(numOfFruits > MAX_FRUIT)
		{
			return true;
		}
		
		return false;
	}
	
	
	
	public int totalNumOfMonthlyOrders() 
	{
		return this.orders.size();
	}


	

}