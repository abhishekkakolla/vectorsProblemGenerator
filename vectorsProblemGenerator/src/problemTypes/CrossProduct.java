package problemTypes;

import vectorParts.Vector;

import javax.swing.JComponent;
import components.*;
import main.Main;
import solutionStructures.*;

public class CrossProduct extends Problem {

	// variables associated with this problem type
	private Vector vectorA = new Vector();
	private Vector vectorB = new Vector();
	
	
	public CrossProduct() 
	{
		// generating problem
		Vector answer = vectorA.crossProduct(vectorB);
		String latexEquation = "\\textbf {a}" + "\\times " +  "\\textbf {b}";
		
		
		// Components on the page
		questionTitle = new Title("Calculate the cross product: ", 100, 130, 800, 60, 20);
		problemButton = new NewProblemButton("crossProduct");
		Formula equation = new Formula(latexEquation, 100, 150, 100, 100);
		Formula titleA = new Formula("\\textbf {a} = " + vectorA.getAlgebraicForm(), 350, 130, 300, 100);
		Formula titleB = new Formula("\\textbf {b} = " + vectorB.getAlgebraicForm(), 350, 170, 300, 100);

		/* Solution */
		solution = new SolutionList();
		
		System.out.println(vectorA.crossProduct(vectorB).toString());
		
		// Step 1
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("(a_1 , a_2, a_3)");
		solution.getLastStep().setPosition(new int[] {100, 140});
	
		// Step 2
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("(b_1 , b_2, b_3)");
		solution.getLastStep().setPosition(new int[] {100, 170});
		
		
		// Step 3
		solution.addStep();
		solution.getLastStep().getSolutionParts().add(vectorA.toString());
		solution.getLastStep().setPosition(new int[] {100, 200});
		
		// Step 4
		solution.addStep();
		solution.getLastStep().getSolutionParts().add(vectorB.toString());
		solution.getLastStep().setPosition(new int[] {100, 230});
		
		// Step 5
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("x = ");
		solution.getLastStep().getSolutionParts().add("(a_2) (b_3) - (a_3) (b_2) = ");
		solution.getLastStep().getSolutionParts().add((int) vectorA.getY() + "*" + (int) vectorB.getZ() + " - " + (int)  vectorA.getZ() + "*" + (int) vectorB.getY());
		solution.getLastStep().setPosition(new int[] {100, 270});
		
		// Step 6
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("y = ");
		solution.getLastStep().getSolutionParts().add("(a_3) (b_1) - (a_1) (b_3) = ");
		solution.getLastStep().getSolutionParts().add((int) vectorA.getZ() + "*" + (int) vectorB.getX() + " - " + (int) vectorA.getX() + "*" + (int) vectorB.getZ());
		solution.getLastStep().setPosition(new int[] {100, 300});
			
		// Step 7
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("z = ");
		solution.getLastStep().getSolutionParts().add("(a_1) (b_2) - (a_2 ) (b_1) = ");
		solution.getLastStep().getSolutionParts().add((int) vectorA.getX() + "*" + (int) vectorB.getY() + " - " + (int) vectorA.getY() + "*" + (int) vectorB.getX());
		solution.getLastStep().setPosition(new int[] {100, 330});
		
		// Step 8
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("= ");
		solution.getLastStep().getSolutionParts().add(answer.toString());
		solution.getLastStep().setPosition(new int[] {100, 360});
				
		
		
		tracedStep = solution.getHead();
		// adding components to screen
		componentsList = new JComponent[] {problemButton, problemTitle, questionTitle, titleA.getLabel(), titleB.getLabel(), nextButton, prevButton, equation.getLabel()};
		for (JComponent component : componentsList)
		{
			Main.screen.add(component, Integer.valueOf(1));
		}
		
		
	}

}
