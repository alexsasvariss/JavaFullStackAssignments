package com.ss.fs.lambda;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class JavaStreamTest {

	@Test
	public void testFilter()
	{
		List<String> test = Arrays.asList("asf", "ashdh", "abt", "hbfeuyb", "vbg", "acg");
		List<String> expected = Arrays.asList("asf", "abt", "acg");
		
		Assert.assertEquals(expected, LambdaStreamImpl.filterList(test));
	}
}
