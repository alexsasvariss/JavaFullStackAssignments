package com.ss.fs.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaCommaImpl {
	public static List<String> processValues(Integer[] values)
	{
		List<String> s = new ArrayList<String>();
		List<Integer> valueList = Arrays.asList(values);
		valueList.stream().forEach((val) -> {
			if (val % 2 == 0)
			{
				s.add("e" + val);
			}
			else
			{
				s.add("o" + val);
			}
		});
		
		return s;
		
	}

	public static void main(String[] args) {
		Integer[] values = {2, 23, 85, 52, 54, 47};
		List<String> processed = processValues(values);
		
		String.join(", ", processed);
		System.out.println(processed);
	}

}
