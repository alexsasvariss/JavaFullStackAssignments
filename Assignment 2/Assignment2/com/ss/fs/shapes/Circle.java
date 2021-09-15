package com.ss.fs.shapes;

public class Circle implements Shape
{
	Double area;
	Double radius;
	
	public Circle(Double radius)
	{
		this.radius = radius;
	}
	
	@Override
	public void display()
	{
		try
		{
			System.out.println("The radius of this circle is: " + this.radius);
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
		this.area = (Math.PI*this.radius*this.radius);
	}
}