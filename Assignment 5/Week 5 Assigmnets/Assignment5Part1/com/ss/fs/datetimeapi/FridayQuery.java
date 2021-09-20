package com.ss.fs.datetimeapi;

import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;
import java.lang.Boolean;

public class FridayQuery implements TemporalQuery<Boolean>{
	
	public Boolean queryFrom(TemporalAccessor temporal) {
		
		return ((temporal.get(ChronoField.DAY_OF_MONTH) == 13) && (temporal.get(ChronoField.DAY_OF_WEEK) == 5));
	}
}
