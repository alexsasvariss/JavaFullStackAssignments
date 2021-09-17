package com.ss.fs.unittest;

import org.junit.Test;
import org.junit.Assert;

public class LineTest {
	@Test
	public void slopeDivideByZero()
	{
		Line line = new Line(0.0, 5.0, 0.0, 5.0);
		Assert.assertThrows(ArithmeticException.class, line::getSlope);
	}
	
	@Test
	public void slopeZero()
	{
		Line line = new Line(5.0, 5.0, 0.0, 5.0);
		Assert.assertEquals(0.0, line.getSlope(), 0.0001);
	}
	
	@Test
	public void slopeTest()
	{
		Line line = new Line(1.0, 8.0, 5.0, 7.0);
		Assert.assertEquals(-0.25, line.getSlope(), 0.0001);
	}
	
	@Test
	public void distanceZero()
	{
		Line line = new Line(0.0, 0.0, 0.0, 0.0);
		Assert.assertEquals(0.0, line.getDistance(), 0.0001);
	}
	
	@Test
	public void distanceTest()
	{
		Line line = new Line(10.0, 0.0, 0.0, 0.0);
		Assert.assertEquals(10.0, line.getDistance(), 0.0001);
	}
	
	@Test
	public void parallelTrue()
	{
		Line line1 = new Line(1.0, 1.0, 2.0, 2.0);
		Line line2 = new Line(2.0, 2.0, 3.0, 3.0);
		Assert.assertTrue(line1.parallelTo(line2));
	}
	
	@Test
	public void parallelFalse()
	{
		Line line1 = new Line(1.0, 1.0, 2.0, 2.0);
		Line line2 = new Line(2.0, 2.0, 3.0, 4.0);
		Assert.assertFalse(line1.parallelTo(line2));
	}
}
