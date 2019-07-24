package com.amdocs;

import java.util.Stack;

public class CalculatorMain {

	Stack<Double> number=new Stack<Double>();
	
	private double firstOperand,secondOperand,result;
	public double solve(String expression)
	{
		Operation myObject; 
		String [] tokens=expression.split(" ");
        for(String token:tokens)
        {
        	
        	if(token.equals("+")) 
        	{
        		firstOperand=number.pop();
        		secondOperand=number.pop();
        		myObject=new Addition();
        		result=myObject.getResult(firstOperand,secondOperand);
        		number.push(result);
        	}
        	else if(token.equals("-"))
        	{
        		firstOperand=number.pop();
        		secondOperand=number.pop();
        		myObject=new Subtraction();
        		result=myObject.getResult(firstOperand,secondOperand);
        		number.push(result);
        	}
        	else if(token.equals("*"))
        	{
        		firstOperand=number.pop();
        		secondOperand=number.pop();
        		myObject=new Multiplication();
        		result=myObject.getResult(firstOperand,secondOperand);
        		number.push(result);
        	}
        	else if(token.equals("/"))
        	{
        		firstOperand=number.pop();
        		secondOperand=number.pop();
        		myObject=new Division();
        		result=myObject.getResult(firstOperand,secondOperand);
        		number.push(result);
        	}
        	else
        	{
        		number.push(Double.parseDouble(token));
        	}
        }
		return number.pop();
	}

}
