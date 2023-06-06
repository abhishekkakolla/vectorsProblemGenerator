package problemTypes;

import vectorParts.Vector;

import javax.swing.JComponent;
import components.*;
import main.Main;
import solutionStructures.*;

public class VectorOperations extends Problem {

	// variables associated with this problem type
	private Vector vectorA = new Vector();
	private Vector vectorB = new Vector();
	
	
	public VectorOperations() 
	{
		// generating problem
		int scalarA = (int) (Math.random() * 10) + 1; // random scalar from 1 to 10
		int scalarB = (int) (Math.random() * 10) + 1; 
		int operationPicker = (int) (Math.random() * 2) + 1; // randomly generate 1 or 2
		String operation;
		Vector answer;
		
		if (operationPicker == 1)
		{
			operation  = "+";
			answer = vectorA.multiply(scalarA).add(vectorB.multiply(scalarB));
		}
		else
		{
			operation = "-";
			answer = vectorA.multiply(scalarA).subtract(vectorB.multiply(scalarB));
		}
		
		
		
		String latexEquation = scalarA + "\\textbf {a}" + " " + operation + " " + scalarB + "\\textbf {b}";
		
		
		// Components on the page
		questionTitle = new Title("Solve: ", 100, 130, 800, 60, 20);
		problemButton = new NewProblemButton("vectorOperations");
		Formula equation = new Formula(latexEquation, 100, 150, 100, 100);
		Formula titleA = new Formula("\\textbf {a} = " + vectorA.getAlgebraicForm(), 300, 130, 300, 100);
		Formula titleB = new Formula("\\textbf {b} = " + vectorB.getAlgebraicForm(), 300, 170, 300, 100);

		/* Solution */
		solution = new SolutionList();
		
		
		// Step 1
		solution.addStep();
		solution.getLastStep().getSolutionParts().add(String.valueOf(scalarA));
		solution.getLastStep().getSolutionParts().add(vectorA.toString());
		solution.getLastStep().getSolutionParts().add(" " + operation + " ");
		solution.getLastStep().getSolutionParts().add(String.valueOf(scalarB));
		solution.getLastStep().getSolutionParts().add(vectorB.toString());
		solution.getLastStep().setPosition(new int[] {100, 140});
		
		
		// Step 2
		solution.addStep();
		solution.getLastStep().getSolutionParts().add(vectorA.multiply(scalarA).toString());
		solution.getLastStep().getSolutionParts().add(" " + operation + " ");
		solution.getLastStep().getSolutionParts().add(vectorB.multiply(scalarB).toString());
		solution.getLastStep().setPosition(new int[] {100, 170});
		
		
		// Step 3
		solution.addStep();
		solution.getLastStep().getSolutionParts().add(answer.toString());
		solution.getLastStep().setPosition(new int[] {100, 200});

		
		
		
		tracedStep = solution.getHead();
		// adding components to screen
		componentsList = new JComponent[] {problemButton, problemTitle, questionTitle, titleA.getLabel(), titleB.getLabel(), nextButton, prevButton, equation.getLabel()};
		for (JComponent component : componentsList)
		{
			Main.screen.add(component, Integer.valueOf(1));
		}
		
		
	}

}
