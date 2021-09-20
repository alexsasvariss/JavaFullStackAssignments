package com.ss.fs.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaStreamImpl {

	public static List<String> filterList(List<String> in)
	{
		return in.stream().filter(s -> ((s.charAt(0) == 'a') && (s.length() == 3))).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		List<String> val = Arrays.asList("ads", "gfdm", "agA", "ahui", "rui9eh", "oisdu8h");
		val = filterList(val);
		val.stream().forEach((s) -> System.out.println(s));
	}

}
