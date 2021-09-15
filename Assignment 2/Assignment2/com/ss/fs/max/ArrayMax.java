package com.ss.fs.max;

import java.util.Random;

public class ArrayMax {
	
	Integer rows = 10;
	Integer columns = 10;
	Integer max = 0;
	Integer maxX, maxY;
	Integer[][] array;
	

	public ArrayMax()
	{
		Random rand = new Random();
		this.array = new Integer[this.rows][this.columns];
		
		for (Integer i = 0; i < rows; i++)
		{
			for (Integer j = 0; j < columns; j++)
			{
				this.array[i][j] = rand.nextInt(101);
			}
		}
		
	}
	
	public void calculateMax()
	{
		for (Integer i = 0; i < rows; i++)
		{
			for (Integer j = 0; j < columns; j++)
			{
				if (this.array[i][j] > this.max)
				{
					this.max = this.array[i][j];
					maxX = i;
					maxY = j;
				}
			}
		}
	}
	
	public void displayArray()
	{
		System.out.println("Printing array...");
		System.out.println("*****************");
		for (Integer i = 0; i < rows; i++)
		{
			for (Integer j = 0; j < columns; j++)
			{
				System.out.print("[" + this.array[i][j] + "] ");
			}
			System.out.println();
		}
		System.out.println("*****************");
	}
	
	public void displayMax()
	{
		System.out.println("The maximum value of the array is: " + this.max + " at (" + maxX + ", " + maxY + ")");
	}
	
	public static void main(String[] args) {
		//Array values are randomly generated
		ArrayMax arr = new ArrayMax();
		arr.calculateMax();
		arr.displayArray();
		arr.displayMax();
	}

}
