package com.ss.fs.functionalthree;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class RemoveXTest {
	@Test
	public void testX()
	{
		List<String> in = Arrays.asList("xxax", "xbxbx", "xxcx");
		List<String> expected = Arrays.asList("a", "bb", "c");
		Assert.assertEquals(expected, RemoveX.remove(in));
	}
}
