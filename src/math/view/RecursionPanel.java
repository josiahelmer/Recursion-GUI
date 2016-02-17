package math.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import math.controller.RecursionController;

public class RecursionPanel extends JPanel
{
	private RecursionController baseController;
	private JButton fibonacciButton;
	private JButton factoralButton;
	private JTextField inputField;
	private JTextArea resultArea;
	private SpringLayout baseLayout;
	
	
	
	public RecursionPanel(RecursionController baseController)
	{
		this.baseController = baseController;
		fibonacciButton = new JButton("Calculate the button");
		factoralButton = new JButton("");
		baseLayout = new SpringLayout();
		
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	private void setupPanel()
	{

		
	}
	private void setupLayout()
	{
		
	}
	private void setupListeners()
	{
		fibonacciButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String input = inputField.getText();
				if(checkInput(input))
				{
					resultArea.setText(baseController.doFibonacci(input));
				}
			}
		});
	

	}	
private boolean checkInput(String input)
{
	boolean isNumber = false;
	
	try
	{
	
	}
	catch(Exception numberException)
	{
		resultArea.setText("you must type in a number");
	}
	
	return isNumber;
}
}
