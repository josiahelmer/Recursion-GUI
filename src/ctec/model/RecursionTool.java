package ctec.model;

public class RecursionTool
{
	public double fibonacciNumber(Double position)
	{
		//Bounds Check
		if (position < 0)
		{
			return Integer.MIN_VALUE;
		}
		
		//Base Case
		if(position == 0 || position == 1)
		{
			return 1;
		}
		else //Recursive case
		{
			return fibonacciNumber(position - 1) + fibonacciNumber(position - 2);
		}
		
	}

	public int FactorialNumber(int position)
	{
		//Bounds Check
		if (position < 0)
		{
			return Integer.MIN_VALUE;
		}
		
		//Base Case
		if(position == 0 || position == 1)
		{
			return 1;
		}
		else //Recursive case
		{
			return position * FactorialNumber(position - 1);
		}
	}

	public int getFibNumber(int i)
	{

		return 0;
	}
}