/*
 * Class: CMSC203 
 * Instructor: Prof Kuijt
 * Description: Obtaining information from a text file
 * Due: 11/12/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Abel Mintesnot
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {
	
	
	public static double[][] readFile(File file) throws FileNotFoundException
	{
		
		//double [][] data = new double[10][];
				
		//2D array of row size 10
		String [][] arrTemp = new String[10][];
		
		//Scanner that reads from the file
		Scanner inputRead = new Scanner(file);
		
		int row = 0;
		
		//loops through the each number in the text file until the end
		while(inputRead.hasNext())
		{
			//String is created to hold any text in the first line
			String text = inputRead.nextLine();
			
			//1D array created with the size arrTemp, so it can carry all the values
			arrTemp[row]= text.split(" ");
			
			row++;
		}
		
		double [][] arrData = new double[row][];

		//loop through each element of the array
		for(int index = 0; index < row; index++)
		{
			
			arrData[index] = new double[arrTemp[index].length];
			
			for(int i = 0; i < arrTemp[index].length; i++) 
			{
				//converts each element from string to s double
				arrData[index][i] = Double.parseDouble(arrTemp[index][i]);
				
			}
			
		}
			
		//this closes the file
		inputRead.close();
		
		return arrData;
	}

	
	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException
	{
		
		//This will print out any text to the file
		PrintWriter fileOut = new PrintWriter(outputFile);
		
		//String builder to make the file to hold the data, change it
		StringBuilder sb = new StringBuilder();
		
		for(int index = 0; index < data.length; index++)
		{
			for(int i = 0; i < data[index].length; i++)
			{
				
				sb.append(data[index][i]+ " ");
				
			}
			
			sb.append("\n");
		}
		
		fileOut.print(sb.toString());
		fileOut.close();
	}
	
	
	public static double getAverage(double[][] data)
	{
 
		int elem = 0;
		double avg;
		double sum = 0;
		
		for(int index = 0; index < data.length; index++)
		{
			for(int i = 0; i < data[index].length; i++)
			{
				sum += data[index][i];
				++elem;
			}
		}
		
		avg = sum/elem;
		
		return avg;
	}
	
	public static double getColumnTotal(double[][] data, int col)
	{
		double total = 0;
		
		for(int index = 0; index < data.length; index++)
		{
			if(col < data[index].length)
			{	
				total += data[index][col];
			}
		}
				
		return total;		
	}
	
	public static double getHighestInArray(double[][] data)
	{
		
		double highInArr =  0;
		
		
		for(int row = 0; row < data.length; row++)
		{
			
			for(int col = 0; col < data[row].length; col++)
			{
				
				if(data[row][col] > highInArr)
				{
					highInArr = data[row][col];
				}
				
			}
		}
		
		return highInArr;	
		
	}
	
	public static double getHighestInColumn (double[][] data, int col)
	{
		
		double highCol = 0;
		
		
	    for (int index = 0; index < data.length; index++) 
	    {
	    	if(col < data[index].length)
	    	{
	    		if(data[index][col] > highCol) 
	    		{
	    			highCol = data[index][col];
	  	     	}
	    	}
	    }
	    
	    return highCol;
			
	}
	
	public static int getHighestInColumnIndex(double[][] data, int col)
	{
		
		double highInCol = Integer.MIN_VALUE;
		int index = 0;

		for(int row = 0; row < data.length; row++)
		{
			if(col < data[row].length)
			{
				if(data[row][col] > highInCol)
				{
					highInCol = data[row][col];
					index = row;
				}
			}
		}
		
		return index;
	}
	
	
	public static double getHighestInRow(double [][] data, int row) {

		double highVal = Double.MIN_VALUE;
		
		for (int i = 0; i < data[row].length; i++)
		{
			if (data[row][i] > highVal)
			{
				highVal = data[row][i];
			}
			
		}
		
		return highVal;
	
	}
	
	
	public static int getHighestInRowIndex(double[][] data, int row) 
	{
	    
		double highInRow = Integer.MIN_VALUE;
		int index = 0;
		
	    for (int i = 0; i < data[row].length; i++) 
	    {
	    	if (data[row][i] > highInRow)
	    	{
	    		highInRow = data[row][i];
	    		index = i;
	    	}
	    }
	    
	    return index;

	}
	
	public static double getLowestInArray(double[][] data)
	{
		
	    double lowInArr = Double.MAX_VALUE;
	    
		for(int index = 0; index < data.length; index++)
		{
			for (int i = 0; i < data[index].length; i++)
			{
				if(data[index][i] < lowInArr)
				{
					lowInArr = data[index][i];
				}
			}
		}
		
		return lowInArr;
	}
	
	public static double getLowestInColumn(double[][] data, int col)
	{
		
		double lowInCol =  Double.MAX_VALUE;
		
		
		for(int k = 0; k < data.length; k++)
		{
			if(col < data[k].length)
			{	
				if(data[k][col] < lowInCol)
				{
					lowInCol = data[k][col];
				}
			}
		}
		
		return lowInCol;
	}

	public static int getLowestInColumnIndex(double[][] data, int col)
	{
		double lowColIndex = Integer.MAX_VALUE;
		int index = 0;
		
		for(int row = 0; row < data.length; row++)
		{
			if(col < data[row].length)
			{
				if(data[row][col] < lowColIndex)
				{
					lowColIndex = data[row][col];
					index = row;
				}
			}
		}
		
		return index;
	}
	
	public static double getLowestInRow(double[][] data, int row)
	{
		double low = Double.MAX_VALUE;
		
		for (int col = 0; col < data[row].length; col++)
		{
			if (data[row][col] < low)
			{
				low = data[row][col];
			}
			
		}
		
		return low;
		
	}
	
	public static int getLowestInRowIndex(double[][] data, int row)
	{
		double low = Integer.MAX_VALUE;
		int index = 0;
		
		for(int i = 0; i < data[row].length; i++)
		{
			if(data[row][i] < low)
			{
				low = data[row][i];
				index = i;
			}
		}
		
		return index;
		
	}


	public static double getRowTotal(double[][] data, int row){
		
	    double sumRow = 0;
	    
	    for (int i = 0; i < data[row].length; i++) 
	    {
	        sumRow += data[row][i];
	    }
	    
	    return sumRow;
	}
	
	public static double getTotal(double[][] data)
	{
	    double sum = 0;
	    
	    for (int row = 0; row < data.length; row++) 
	    { 
	    	for (int col = 0; col < data[row].length; col++) 
	    	{
	    		
	    		sum += data[row][col];
	        
	    	}
	    }
	    
	    return sum;
	}
	
	
	
	
}