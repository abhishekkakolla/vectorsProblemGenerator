package problemTypes;

import vectorParts.Vector;

import javax.swing.JComponent;
import components.*;
import main.Main;

public class MagnitudeOfAVector extends Problem {

	// variables associated with problem type
	private Vector generatedVector = new Vector();
	
	
	
	public MagnitudeOfAVector() 
	{
		// Components on the page
		questionTitle = new Title("What is the magnitude of: " + generatedVector, 100, 130, 800, 60, 20);
		problemButton = new NewProblemButton("magnitudeOfAVector");
		
		
		/* Solution */
		
		// Step 1
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("x^2 = ");
		solution.getLastStep().getSolutionParts().add(generatedVector.getX() + "^2 = ");
		solution.getLastStep().getSolutionParts().add(Math.pow(generatedVector.getX(), 2) + "");
		solution.getLastStep().setPosition(new int[] {100, 100});
		
		// Step 2
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("y^2 = ");
		solution.getLastStep().getSolutionParts().add(generatedVector.getY() + "^2 = ");
		solution.getLastStep().getSolutionParts().add(Math.pow(generatedVector.getY(), 2) + "");
		solution.getLastStep().setPosition(new int[] {100, 130});
		
		// Step 3
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("z^2 = ");
		solution.getLastStep().getSolutionParts().add(generatedVector.getZ() + "^2 = ");
		solution.getLastStep().getSolutionParts().add(Math.pow(generatedVector.getZ(), 2) + "");
		solution.getLastStep().setPosition(new int[] {100, 160});

		// Step 4
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("\\sqrt{(x^2 + y^2 + z^2)}");
		solution.getLastStep().setPosition(new int[] {100, 190});

		// Step 5
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("\\sqrt{");
		solution.getLastStep().getSolutionParts().add(Math.pow(generatedVector.getX(), 2) + " +  " + Math.pow(generatedVector.getY(), 2) + " + "+ Math.pow(generatedVector.getZ(), 2) + "} = ");
		solution.getLastStep().getSolutionParts().add(Math.round(generatedVector.getMagnitude() * 100.0) / 100.0 + "");
		solution.getLastStep().setPosition(new int[] {100, 220});
		

		
		tracedStep = solution.getHead(); // setting the tracedStep to the head
		
		
		// adding components to screen
		componentsList = new JComponent[] {problemTitle, questionTitle, nextButton, prevButton, problemButton};
		for (JComponent component : componentsList)
		{
			Main.screen.add(component, Integer.valueOf(1));
		}
		
		
	}	

}
