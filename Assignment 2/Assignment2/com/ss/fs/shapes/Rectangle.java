package com.ss.fs.shapes;

public class Rectangle implements Shape
{
	Double area;
	Double length;
	Double width;
	
	public Rectangle(Double length, Double width)
	{
			this.length = length;
			this.width = width;
	}
	
	@Override
	public void display()
	{
		try
		{
			System.out.println("The length of this rectangle is: " + this.length);
			System.out.println("The width of this rectangle is: " + this.width);
			System.out.println("The area of this rectangle is: " + this.area);
		}
		catch (Exception e)
		{
			System.out.println("Area has not been calculated.");
		}
		
	}
	
	@Override
	public void calculateArea()
	{
		this.area = (this.length*this.width);
	}
}
