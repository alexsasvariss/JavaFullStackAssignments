package com.ss.fs.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RightMostDigit {
	
	public static List<Integer> rightMost(List<Integer> val)
	{
		return val.stream().map((num) -> num % 10).collect(Collectors.toList());
	}
	
	public static void main(String[] args)
	{
		List<Integer> val = Arrays.asList(10, 0);
		System.out.println(rightMost(val));
		
	}
}
