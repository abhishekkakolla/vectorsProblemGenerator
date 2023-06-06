package problemTypes;

import vectorParts.Vector;

import javax.swing.JComponent;
import components.*;
import main.Main;
import solutionStructures.*;

public class VolumeTetrahedron extends Problem {

	// variables associated with this problem type
	private Vector vector1 = new Vector();
	private Vector vector2 = new Vector();
	private Vector vector3 = new Vector();
	
	
	
	public VolumeTetrahedron() 
	{
		// generating problem
		
		// Components on the page
		questionTitle = new Title("What is the volume of the tetrahdron created by the vectors?", 100, 130, 800, 60, 20);
		problemButton = new NewProblemButton("volumeTetrahedron");
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
		solution.getLastStep().getSolutionParts().add("V = {\\frac 1 6}|a * ({{\\textbf b} \\times {\\textbf c}})|");
		solution.getLastStep().setPosition(new int[] {100, 170});
		
		
		// Step 2
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("V = {\\frac 1 6}|" + vector1 + " * ({" + vector2 + "\\times " + vector3 + "})|");
		solution.getLastStep().setPosition(new int[] {100, 240});
		
		
		
		// Step 3
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("V = {\\frac 1 6}|" + vector1 + " * (" + cross + ")|");
		solution.getLastStep().setPosition(new int[] {100, 310});
		
		
		
		// Step 4
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("V = {\\frac 1 6}|" + answer + "|");
		solution.getLastStep().setPosition(new int[] {100, 380});

		// Step 5
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("V = " + (Math.abs(answer) * (1.0/6)));
		solution.getLastStep().setPosition(new int[] {100, 450});




		
		tracedStep = solution.getHead();
		// adding components to screen
		componentsList = new JComponent[] {problemButton, problemTitle, questionTitle, titleC.getLabel(), titleB.getLabel(), titleA.getLabel(), nextButton, prevButton};
		for (JComponent component : componentsList)
		{
			Main.screen.add(component, Integer.valueOf(1));
		}
		
		
	}

}
