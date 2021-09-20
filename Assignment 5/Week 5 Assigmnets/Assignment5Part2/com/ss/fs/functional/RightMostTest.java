package com.ss.fs.functional;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class RightMostTest {
	@Test
	public void testDigit()
	{
		List<Integer> expected = Arrays.asList(0, 0);
		List<Integer> in = Arrays.asList(10, 0);
		Assert.assertEquals(expected, RightMostDigit.rightMost(in));
	}
}
