package com.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RPCalcTest {
	
	@Test
	public void addition()
	{
		CalculatorMain calc= new CalculatorMain();
	    double actual=calc.solve("3 3 +");
	    double expected=6;
	    assertEquals(expected, actual, 0.001);
	 	
	}
	
	@Test
	public void mixed()
	{
		CalculatorMain calc= new CalculatorMain();
	    double actual=calc.solve("3 2 + 9 6 - 14 7 / + -");
	    double expected=0;
	    assertEquals(expected, actual, 0.001);
	 	
	}

	@Test
	public void subtraction()
	{
		CalculatorMain calc= new CalculatorMain();
	    double actual=calc.solve("3 3 -");
	    double expected=0;
	    assertEquals(expected, actual, 0.001);
	 	
	}
}
