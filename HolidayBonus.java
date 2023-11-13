/*
 * Class: CMSC203 
 * Instructor: Prof Kuijt
 * Description: Calculating holiday bonus
 * Due: 11/12/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Abel Mintesnot
*/
public class HolidayBonus {


	public static double[] calculateHolidayBonus(double[][] data, double high,  double low, double other)
	{
		double[] holBonus = new double[data.length];
		
		for(int row = 0; row < data.length; row++)
		{
			for(int col = 0; col < data[row].length; col++)
			{
				
				if(data[row][col] > 0)
				{
					if(data[row][col] == data[TwoDimRaggedArrayUtility.getHighestInColumnIndex(data,col)][col])
					{
						holBonus[row] += high;
					}
					
					else if(data[row][col] == data[TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, col)][col])
					{
						holBonus[row] += low;
					}
					
					else
					{
						holBonus[row] += other;
					}
				
				}
			}
		}
		
		
		return holBonus;
	}
	
	
	public static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other)
	{
		
		double holTotal = 0;
		double[] holBonus = calculateHolidayBonus(data, high, low, other);
		
		for(int i=0; i < data.length;i++) 
		{
			
			holTotal += holBonus[i];
			
		}
		
		return holTotal;
	}
}
