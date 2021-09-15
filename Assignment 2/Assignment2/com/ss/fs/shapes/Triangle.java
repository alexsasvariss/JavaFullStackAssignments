package com.ss.fs.shapes;

public class Triangle implements Shape 
{
	Double area;
	Double base;
	Double height;
	
	public Triangle(Double base, Double height)
	{
		this.base = base;
		this.height = height;
	}
	
	@Override
	public void display()
	{
		try
		{
			System.out.println("The height of this triangle is: " + this.height);
			System.out.println("The base of this triangle is: " + this.base);
			System.out.println("The area of this triangle is: " + this.area);
		}
		catch (Exception e)
		{
			System.out.println("Area has not been calculated.");
		}
	}
	
	@Override
	public void calculateArea()
	{
		this.area = ((this.base*this.height)/2);
	}
}