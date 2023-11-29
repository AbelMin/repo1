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
import java.util.Random;

public class Order implements OrderInterface, Comparable {
	
	private int OrderTime;
	private DAY OrderDay;
	private int OrderNum;
	private Customer customer;
	private ArrayList<Beverage> beverages; 
	

	public Order(int OrderTime, DAY day, Customer customer) 
	{
		this.OrderTime = OrderTime;
		this.OrderNum = random();
		this.OrderDay = day;
		this.customer = new Customer(customer);
		this.beverages = new ArrayList<Beverage>();
	}
	
	
	
	public int random()
	{
		Random rand = new Random();
		return rand.nextInt(90000)+10000;
	}
	
	 
	
	
	@Override
	public String toString() 
	{
		return this.getOrderNo() + " "
				+ getOrderTime() + " "
				+ getOrderDay() + " " 
				+ getCustomer() + " "
				+ beverages + " " 
				+ calcOrderTotal();
	}
	
	
	@Override
	public boolean isWeekend()
	{
		if(this.OrderDay == DAY.SATURDAY || this.OrderDay == DAY.SUNDAY)
		{
			return true;
		}
		
		return false;
	}

	
	
	@Override
	public Beverage getBeverage(int itemNo) 
	{
		
		if(this.beverages.size() == 0) 
		{
			return null;
		}
		
		return beverages.get(itemNo);
	}
	
	
	
	@Override
	public void addNewBeverage(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) 
	{
		this.beverages.add(new Coffee(bevName,size,extraShot, extraSyrup));
	}


	
	@Override
	public void addNewBeverage(String bevName, SIZE size) 
	{
		this.beverages.add(new Alcohol(bevName,size, isWeekend()));

	}
	

	
	@Override
	public void addNewBeverage(String bevName, SIZE size, int numOfFruits, boolean addPRotien) 
	{
		this.beverages.add(new Smoothie(bevName, size, numOfFruits, addPRotien));

	}

	
	
	@Override
	public double calcOrderTotal()
	{
		double total = 0;
		
		for(int i = 0; i < beverages.size(); i++) 
		{
			total += beverages.get(i).calcPrice();
		}
		
		return total;
	}

	
	
	@Override
	public int findNumOfBeveType(TYPE type) 
	{
		
		int  count = 0;
		
		for(int i = 0; i<beverages.size(); i++)
		{
			if(beverages.get(i).getType() == type)
			{
				count++;
			}
		}
		
		return count;
		
	}

	
	
	@Override
	public int compareTo(Object object)
	{
		
		Order another = (Order) object;
		
		if (this.OrderNum > another.OrderNum)
		{
			return 1;
		}
		
		if(this.OrderNum < another.OrderNum)
		{
			return -1;
		}
		
		return 0;
	}
	
	
	
	public int getOrderNo() 
	{
		return OrderNum;
	}
	
	
	
	public void setOrderNum(int OrderNum) 
	{
		this.OrderNum = OrderNum;
	}
	
	
	public int getOrderTime() 
	{
		return OrderTime;
	}
	
	
	
	public void setOrderTime(int OrderTime)
	{
		this.OrderTime = OrderTime;
	}
	
	
	public DAY getOrderDay() 
	{
		return OrderDay;
	}
	

	
	public void setOrderDay(DAY OrderDay) 
	{
		this.OrderDay = OrderDay;
	}
	

	public Customer getCustomer()
	{
		return new Customer(this.customer);
	}

	
	
	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}
	

	public ArrayList<Beverage> getBeverages()
	{
		return beverages;
	}
	

	public void setBeverages(ArrayList<Beverage> beverages) 
	{
		this.beverages = beverages;
	}
	
	
	public int getTotalItems() 
	{
		
		if(beverages.size() == 0)
		{
			return 0;
		}
		
		return beverages.size();
	}
	
	

}