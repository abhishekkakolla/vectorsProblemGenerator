package problemTypes;

import vectorParts.Vector;

import javax.swing.JComponent;
import components.*;
import main.Main;
import solutionStructures.*;

public class DotProduct extends Problem {

	// variables associated with this problem type
	private Vector vectorA = new Vector();
	private Vector vectorB = new Vector();
	
	
	public DotProduct() 
	{
		// generating problem
		double answer = vectorA.dotProduct(vectorB);
		
		
		
		String latexEquation = "\\textbf {a}" + "*" +  "\\textbf {b}";
		
		
		// Components on the page
		questionTitle = new Title("Calculate the dot product: ", 100, 130, 800, 60, 20);
		problemButton = new NewProblemButton("dotProduct");
		Formula equation = new Formula(latexEquation, 100, 150, 100, 100);
		Formula titleA = new Formula("\\textbf {a} = " + vectorA.getAlgebraicForm(), 350, 130, 300, 100);
		Formula titleB = new Formula("\\textbf {b} = " + vectorB.getAlgebraicForm(), 350, 170, 300, 100);

		/* Solution */
		solution = new SolutionList();
		
		// Step 1
		solution.addStep();
		solution.getLastStep().getSolutionParts().add(vectorA.toString());
		solution.getLastStep().getSolutionParts().add(" * ");
		solution.getLastStep().getSolutionParts().add(vectorB.toString());
		solution.getLastStep().setPosition(new int[] {100, 140});
		
		
		// Step 2
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("(" + (int) vectorA.getX() + "*" + (int) vectorB.getX() + ") + ");
		solution.getLastStep().getSolutionParts().add("(" + (int) vectorA.getY() + "*" + (int) vectorB.getY() + ") + ");
		solution.getLastStep().getSolutionParts().add("(" + (int) vectorA.getZ() + "*" + (int) vectorB.getZ() + ")");
		solution.getLastStep().setPosition(new int[] {100, 170});
		
		
		// Step 3
		solution.addStep();
		solution.getLastStep().getSolutionParts().add(String.valueOf((int) (vectorA.getX() * vectorB.getX())));
		solution.getLastStep().getSolutionParts().add(" + ");
		solution.getLastStep().getSolutionParts().add(String.valueOf((int) (vectorA.getY() * vectorB.getY())));
		solution.getLastStep().getSolutionParts().add(" + ");
		solution.getLastStep().getSolutionParts().add(String.valueOf((int) (vectorA.getZ() * vectorB.getZ())));
		solution.getLastStep().setPosition(new int[] {100, 200});
		
		
		// Step 4
		solution.addStep();
		solution.getLastStep().getSolutionParts().add(String.valueOf(answer));
		solution.getLastStep().setPosition(new int[] {100, 230});

		
		
		
		tracedStep = solution.getHead();
		// adding components to screen
		componentsList = new JComponent[] {problemButton, problemTitle, questionTitle, titleA.getLabel(), titleB.getLabel(), nextButton, prevButton, equation.getLabel()};
		for (JComponent component : componentsList)
		{
			Main.screen.add(component, Integer.valueOf(1));
		}
		
		
	}

}
