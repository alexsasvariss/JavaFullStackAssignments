package com.ss.fs.functionaltwo;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class MultiplyTest {
	@Test
	public void testMultiply()
	{
		List<Integer> in = Arrays.asList(6, 8, 6, 8, -1);
		List<Integer> expected = Arrays.asList(12, 16, 12, 16, -2);
		Assert.assertEquals(expected, Multiply.multiply(in));
	}
}
