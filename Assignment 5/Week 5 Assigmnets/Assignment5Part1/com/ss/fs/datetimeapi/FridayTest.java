package com.ss.fs.datetimeapi;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;
import java.time.Year;

public class FridayTest {

	@Test
	public void testIsTrue()
	{
		LocalDate d = Year.now().atMonth(8).atDay(13);
		Assert.assertTrue(d.query(new FridayQuery()));
	}
	
	@Test
	public void testIsFalse()
	{
		LocalDate d = Year.now().atMonth(8).atDay(14);
		Assert.assertFalse(d.query(new FridayQuery()));
	}
}
