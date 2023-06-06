package solutionStructures;


import java.util.ArrayList; // import arraylist 

import javax.swing.JLabel;

import components.Formula;
import main.Main;


public class Step {

	// data of the node
	private ArrayList<String> solutionParts;
	Formula formula;
	JLabel formulaLabel;
	private int[] position = new int[2];
	
	
	// pointer to next node
	private Step nextStepPointer; 
	private Step previousStepPointer;
	
	// node constructor
	public Step()
	{
		solutionParts = new ArrayList<String>();
		formula = null;
		nextStepPointer = null;
		previousStepPointer = null;
	}
	
	// set position of the formula
	public void setPosition(int[] coords)
	{
		position[0] = coords[0]; // x coordinate
		position[1] = coords[1]; // y coordinate
	}
	
	
	// getter for node data
	public ArrayList<String> getSolutionParts()
	{
		return solutionParts;
	}
	
	
	// getter for next node pointer
	public Step getNextStep()
	{
		return nextStepPointer;
	}
	
	// getter for previous node pointer
	public Step getPreviousStep()
	{
		return previousStepPointer;
	}
	
	
	// method to set next pointer
	public void setNextStep(Step other) 
	{
		nextStepPointer = other;
	}
	
	// method to set previous pointer
	public void setPreviousStep(Step other)
	{
		previousStepPointer = other;
	}
	
	
	
	// add all the objects in the solution ArrayList and print it as a string
	public String getPrintedStep()
	{
		String temp = "";
		for (String part : solutionParts)
		{
			temp += part + " ";
		}
		
		return temp;
	}
	
	public void renderStep()
	{
		formula = new Formula(this.getPrintedStep(), position[0], position[1], 1200, 300);
		formulaLabel = formula.getLabel();
		Main.screen.add(formulaLabel, Integer.valueOf(1));
	}
	
	
	public void deRenderStep()
	{
		formulaLabel.setVisible(false);
		Main.screen.remove(formulaLabel);
		formulaLabel = null;
		
	}
	
	public JLabel getFormulaLabel()
	{
		return formulaLabel;
	}
	
	
}
