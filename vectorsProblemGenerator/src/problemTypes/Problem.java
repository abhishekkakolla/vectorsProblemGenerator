package problemTypes;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import components.*;
import main.Main;
import solutionStructures.*;

public class Problem implements BaseProblem {

	// variables associated with a basic problem
	protected SolutionList solution;
	protected Step tracedStep;
	
	// Components of the problem page
	protected Title questionTitle;
	protected Title problemTitle;
	protected StepsButton nextButton;
	protected StepsButton prevButton;
	protected NewProblemButton problemButton;

	
	// list of components on the problem page
	protected static JComponent[] componentsList;
	
	
	
	public Problem() 
	{
		
		System.out.println("Generic problem generated.");
		
		// Components on the page
		problemTitle = new Title("Problem type: " + Main.currentProblem, 100, 55, 800, 60, 40);
		
		/* Solution */
		// Storing solution in a SolutionList (linked list)
		solution = new SolutionList();
		

		// tracer buttons
		nextButton = new StepsButton("next", solution);
		prevButton = new StepsButton("previous", solution);
		
		
		
		// click events for both buttons
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (tracedStep.getNextStep() != null) {
					tracedStep.renderStep();
					tracedStep = tracedStep.getNextStep();
				}
				else {
					tracedStep.renderStep();
					nextButton.setVisible(false);
				}

				prevButton.setVisible(true);
			}
		});
		
		
		
		
		prevButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (tracedStep.getFormulaLabel() != null) {
					tracedStep.deRenderStep();
					
				}
				else if (tracedStep.getPreviousStep() != null)
				{
					
					tracedStep = tracedStep.getPreviousStep();
					tracedStep.deRenderStep();
				}
				nextButton.setVisible(true);
				if (tracedStep.getPreviousStep() == null) prevButton.setVisible(false);
			}
		});
		
	
		
	}
	
	



	@Override
	public void closeQuestion() {
		// TODO Auto-generated method stub
		
		// close the components
		for (JComponent component : componentsList)
		{
			component.setVisible(false);
			Main.screen.remove(component);
		}
		
		// close the formulas when the question is closed
		for (int i = 0; i < solution.getSize(); i ++)
		{
			if (solution.getStep(i).getFormulaLabel() != null) // if the step is visible, derender it
			{
				solution.getStep(i).deRenderStep();
			}
		}
		
		
		
	}

}
