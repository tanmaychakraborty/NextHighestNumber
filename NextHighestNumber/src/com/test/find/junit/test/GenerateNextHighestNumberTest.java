package com.test.find.junit.test;
import org.junit.Assert;
import org.junit.Test;

import com.test.find.GenerateNextHighestNumber;

public class GenerateNextHighestNumberTest {

	//General value test
	@Test
	public final void findNextHighestNumber() {
	    Assert.assertEquals("Pass","1243" ,GenerateNextHighestNumber.findNext("1234"));
	}
	
	//input is wrong test
	@Test
	public final void checkIfInputNoNumber() {
	    Assert.assertEquals("Pass","Input is not a number" ,GenerateNextHighestNumber.findNext("123S4"));
	}
	//already highest number in input
	@Test
	public final void checkIfHighestNoNotPossible() {
	    Assert.assertEquals("Pass","Not possible" ,GenerateNextHighestNumber.findNext("4321"));
	}
	
	
}
