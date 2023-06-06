package solutionStructures;

public class SolutionList {

	private Step head;
	private int size;
	
	
	// constructor for LinkedList
	public SolutionList()
	{
		head = null;
		size = 0;
	}
	
	// getter method for size
	public int getSize()
	{
		return size;
	}
	
	
	// getter method for the head
	public Step getHead()
	{
		return head;
	}

	
	// getter method for the last node 
	public Step getLastStep()
	{
		Step currentStep = head;
		if (size == 0)
		{
			return head;
		}
		// while a reference exists , keep iterating 
		while (currentStep.getNextStep() != null) 
		{
			currentStep = currentStep.getNextStep();
		}
		return currentStep;
	}
	
	
	// adding a node / step
	public void addStep()
	{
		// create a new node (step)
		Step newStep = new Step();
		if (size == 0)
		{
			head = newStep;
			
		}
		else
		{
			newStep.setPreviousStep(this.getLastStep());
			this.getLastStep().setNextStep(newStep);
			
		}
		size++;
		
	}
	
	
	// get a step at a certain index
	public Step getStep(int index)
	{
		Step currentStep = head;
		int i = 0;
		while (currentStep.getNextStep() != null && i < index) 
		{
			currentStep = currentStep.getNextStep();
			i++;
		}
		return currentStep;
		
	}
	
	
	
}
