package math.controller;

import math.model.RecursionTool;
import math.view.RecursionFrame;

public class RecursionController
{
	private RecursionFrame baseFrame;
	private RecursionTool mathTool;
	private String calculatedValue;
	
	public RecursionController()
	{
		mathTool = new RecursionTool();
		baseFrame = new RecursionFrame(this);
		calculatedValue = "";
		
	}
	
	public void start()
	{
	
	}
	
	public String doFibonacci(String input)
	{
		calculatedValue = "TheFibonacci sequence at " + input + "is:" +
					Double.toString(mathTool.fibonacciNumber(Double.parseDouble(input)));
					
		return calculatedValue;
	}
	public String doFacotrial(String input)
	{
		calculatedValue = "TheFibonacci sequence at " + input + "is:" +
					Integer.toString(mathTool.factorialNumber(Integer.parseInt(input)));
					
		return calculatedValue;
	}
}