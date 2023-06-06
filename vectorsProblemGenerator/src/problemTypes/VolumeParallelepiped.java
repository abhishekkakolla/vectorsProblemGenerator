package problemTypes;

import vectorParts.Vector;

import javax.swing.JComponent;
import components.*;
import main.Main;
import solutionStructures.*;

public class VolumeParallelepiped extends Problem {

	// variables associated with this problem type
	private Vector vector1 = new Vector();
	private Vector vector2 = new Vector();
	private Vector vector3 = new Vector();
	
	
	
	public VolumeParallelepiped() 
	{
		// generating problem
		
		// Components on the page
		questionTitle = new Title("What is the volume of the parallelepiped created by the vectors?", 100, 130, 800, 60, 20);
		problemButton = new NewProblemButton("volumeParallelepiped");
		Formula titleA = new Formula("a = " + vector1, 100, 150, 500, 100);
		Formula titleB = new Formula("b = " + vector2, 100, 180, 500, 100);
		Formula titleC = new Formula("c = " + vector3, 100, 210, 500, 100);


		Vector cross = vector2.crossProduct(vector3);
		double answer = vector1.dotProduct(cross);
		
		
		System.out.println("volume = " + answer);
		
		/* Solution */
		solution = new SolutionList();
		
		
		// Step 1
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("V = |a * ({{\\textbf b} \\times {\\textbf c}})|");
		solution.getLastStep().setPosition(new int[] {100, 140});
		
		
		// Step 2
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("V = |" + vector1 + " * ({" + vector2 + "\\times " + vector3 + "})|");
		solution.getLastStep().setPosition(new int[] {100, 210});
		
		
		
		// Step 3
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("V = |" + vector1 + " * (" + cross + ")|");
		solution.getLastStep().setPosition(new int[] {100, 280});
		
		
		
		// Step 4
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("V = |" + answer + "|");
		solution.getLastStep().setPosition(new int[] {100, 350});

		// Step 5
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("V = " + Math.abs(answer));
		solution.getLastStep().setPosition(new int[] {100, 420});




		
		tracedStep = solution.getHead();
		// adding components to screen
		componentsList = new JComponent[] {problemButton, problemTitle, questionTitle, titleC.getLabel(), titleB.getLabel(), titleA.getLabel(), nextButton, prevButton};
		for (JComponent component : componentsList)
		{
			Main.screen.add(component, Integer.valueOf(1));
		}
		
		
	}

}
