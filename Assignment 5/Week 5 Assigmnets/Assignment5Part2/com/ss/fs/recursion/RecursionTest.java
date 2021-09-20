package com.ss.fs.recursion;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class RecursionTest {
	@Test
	public void testResolveDuplicates()
	{
		List<Integer> expected = Arrays.asList(1, 2, 9, 4, 5);
		List<Integer> input = Arrays.asList(1, 2, 3, 3, 3, 4, 5);
		Assert.assertEquals(expected, RecursionSum.resolveDuplicates(input));
	}
}
