package problemTypes;

import vectorParts.Line;
import vectorParts.Vector;

import javax.swing.JComponent;
import components.*;
import main.Main;
import solutionStructures.*;

public class AngleLineLine extends Problem {

	// variables associated with this problem type
	private Vector point = new Vector();
	private Line line1 = new Line(point); // two random lines with the same intersection
	private Line line2 = new Line(point);
	
	
	
	public AngleLineLine() 
	{
		// generating problem
		
		// Components on the page
		questionTitle = new Title("What is the angle between the two lines?", 100, 130, 800, 60, 20);
		problemButton = new NewProblemButton("angleLineLine");
		Formula titleA = new Formula("L_1 = " + line1, 100, 150, 500, 100);
		Formula titleB = new Formula("L_2 = " + line2, 100, 180, 500, 100);

		double top = line1.getDirectionVector().dotProduct(line2.getDirectionVector());
		double bottom = Math.abs(line1.getDirectionVector().getMagnitude() * line2.getDirectionVector().getMagnitude());
		double answer = top / bottom;
		answer = Math.toDegrees(Math.acos(answer));
		
		Vector vector1 = line1.getDirectionVector();
		Vector vector2 = line2.getDirectionVector();
		
		double vector1Mag = Math.round(vector1.getMagnitude() * 100.0) / 100.0;
		double vector2Mag = Math.round(vector2.getMagnitude() * 100.0) / 100.0;
		
		
		/* Solution */
		solution = new SolutionList();
		
		
		// Step 1
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("cos a = {\\frac {{\\textbf {u}} * {\\textbf {v}}} {{\\textbf {|u|}} * {\\textbf {|v|}}}}");
		solution.getLastStep().setPosition(new int[] {100, 140});
		
		
		// Step 2
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("cos a = {\\frac {{" + vector1 +  "} * {" + vector2 + "}} {{" + vector1Mag + "} * {" + vector2Mag + "}}}");
		solution.getLastStep().setPosition(new int[] {100, 210});
		
		
		
		// Step 3
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("cosa = " + (top / bottom));
		solution.getLastStep().setPosition(new int[] {100, 280});
		
		
		
		// Step 4
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("a = cos^{-1}" +  (top / bottom)); 
		solution.getLastStep().setPosition(new int[] {100, 320});


		
		// Step 5
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("a = " + (Math.round(answer * 100.0) / 100.0) + "^{\\circ}"); 
		solution.getLastStep().setPosition(new int[] {100, 360});

		
		tracedStep = solution.getHead();
		// adding components to screen
		componentsList = new JComponent[] {problemTitle, questionTitle, titleB.getLabel(), titleA.getLabel(), nextButton, prevButton, problemButton};
		for (JComponent component : componentsList)
		{
			Main.screen.add(component, Integer.valueOf(1));
		}
		
		
	}

}
