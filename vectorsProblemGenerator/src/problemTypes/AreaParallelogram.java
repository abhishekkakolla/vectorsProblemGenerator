package problemTypes;

import vectorParts.Vector;

import javax.swing.JComponent;
import components.*;
import main.Main;
import solutionStructures.*;

public class AreaParallelogram extends Problem {

	// variables associated with this problem type
	private Vector vector1 = new Vector();
	private Vector vector2 = new Vector();
	
	
	
	public AreaParallelogram() 
	{
		// generating problem
		
		// Components on the page
		questionTitle = new Title("What is the area of the parallelogram created by the two vectors?", 100, 130, 800, 60, 20);
		problemButton = new NewProblemButton("areaParallelogram");
		Formula titleA = new Formula("a = " + vector1, 100, 150, 500, 100);
		Formula titleB = new Formula("b = " + vector2, 100, 180, 500, 100);
		double answer = vector1.crossProduct(vector2).getMagnitude();
		
		
		/* Solution */
		solution = new SolutionList();
		
		
		// Step 1
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("A = |{{\\textbf a} \\times {\\textbf b}}|");
		solution.getLastStep().setPosition(new int[] {100, 140});
		
		
		// Step 2
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("A = |{" + vector1 + " \\times " + vector2 + "}|");
		solution.getLastStep().setPosition(new int[] {100, 210});
		
		
		// Step 3
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("A = |{" + vector1.crossProduct(vector2) + "}|");
		solution.getLastStep().setPosition(new int[] {100, 280});
		
		
		// Step 4
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("A = " + answer); 
		solution.getLastStep().setPosition(new int[] {100, 350});


		
		tracedStep = solution.getHead();
		// adding components to screen
		componentsList = new JComponent[] {problemButton, problemTitle, questionTitle, titleB.getLabel(), titleA.getLabel(), nextButton, prevButton};
		for (JComponent component : componentsList)
		{
			Main.screen.add(component, Integer.valueOf(1));
		}
		
		
	}

}
