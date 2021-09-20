package com.ss.fs.lambda;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class LambdaCommaTest {

	@Test
	public void testProcessed()
	{
		Integer[] values = {2, 23, 85, 52, 54, 47};
		List<String> expected = Arrays.asList("e2", "o23", "o85", "e52", "e54", "o47");
		
		Assert.assertEquals(expected, LambdaCommaImpl.processValues(values));
	}
}
