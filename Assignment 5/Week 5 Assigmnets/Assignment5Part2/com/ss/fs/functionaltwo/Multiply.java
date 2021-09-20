package com.ss.fs.functionaltwo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Multiply {
	public static List<Integer> multiply(List<Integer> val)
	{
		return val.stream().map((num) -> num * 2).collect(Collectors.toList());
	}
	
	public static void main(String[] args)
	{
		List<Integer> val = Arrays.asList();
		System.out.println(multiply(val));
		
	}
}
