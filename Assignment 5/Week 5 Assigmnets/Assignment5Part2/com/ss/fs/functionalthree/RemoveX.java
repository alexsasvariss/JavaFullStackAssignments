package com.ss.fs.functionalthree;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveX {
	public static List<String> remove(List<String> val)
	{
		return val.stream().map((str) -> str.replaceAll("x", "")).collect(Collectors.toList());
	}
	
	public static void main(String[] args)
	{
		List<String> val = Arrays.asList("x");
		System.out.println(remove(val));
		
	}
}
