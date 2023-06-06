package problemTypes;

import vectorParts.Line;
import vectorParts.Vector;

import javax.swing.JComponent;
import components.*;
import main.Main;
import solutionStructures.*;

public class DistancePointLine extends Problem {

	// variables associated with this problem type
	private Vector pointQ = new Vector();
	private Line generatedLine = new Line();
	
	
	public DistancePointLine() 
	{
		// generating problem
		
		// Components on the page
		questionTitle = new Title("What is the distance between point Q and the line?", 100, 130, 800, 60, 20);
		problemButton = new NewProblemButton("distancePointLine");
		Formula titleA = new Formula("Q" + pointQ.toString(), 100, 150, 320, 100);
		Formula lineTitle = new Formula("\\textbf {r} = " + generatedLine.toString(), 100, 180, 500, 100);

		/* Solution */
		solution = new SolutionList();
		
		
		// Step 1
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("\\text {Find foot of the perpendicular P on the line}");
		solution.getLastStep().setPosition(new int[] {100, 140});
		
		
		// Step 2
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("P" + generatedLine.getGeneralPointForm());
		solution.getLastStep().setPosition(new int[] {100, 170});
		
		
		// Step 3
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("\\text {Get the line for QP, }");
		solution.getLastStep().getSolutionParts().add("\\text {\\textbf {QP = }");
		solution.getLastStep().getSolutionParts().add("(" + generatedLine.getGeneralX() + " - " + (int) pointQ.getX() + ",");
		solution.getLastStep().getSolutionParts().add(generatedLine.getGeneralY() + " - " + (int) pointQ.getY() + ",");
		solution.getLastStep().getSolutionParts().add(generatedLine.getGeneralZ() + " - " + (int) pointQ.getZ() + ")");
		solution.getLastStep().setPosition(new int[] {100, 200});
		
		
		
		// Step 4
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("\\text {Dot {\\textbf {QP}} with direction vector of line " + generatedLine.getDirectionVector().toString() + " and equate to 0 (90 degrees)"); 
		solution.getLastStep().setPosition(new int[] {100, 230});


		// Step 5
		Line QP = new Line(generatedLine.getDirectionVector(), 
				new Vector(generatedLine.getPositionVector().getX() - pointQ.getX(),
						generatedLine.getPositionVector().getY() - pointQ.getY(),
						generatedLine.getPositionVector().getZ() - pointQ.getZ()));
		

		
		solution.addStep();
		solution.getLastStep().getSolutionParts().add(QP.getGeneralPointForm()); 
		solution.getLastStep().getSolutionParts().add("*"); 
		solution.getLastStep().getSolutionParts().add(generatedLine.getDirectionVector().toString()); 
		solution.getLastStep().getSolutionParts().add(" = 0"); 
		solution.getLastStep().setPosition(new int[] {100, 270});
		
		// Step 6
		// linear equation to solve for parameter
		double coefficient = generatedLine.getDirectionVector().dotProduct(QP.getDirectionVector());
		double constant = generatedLine.getDirectionVector().dotProduct(QP.getPositionVector());
		double parameterValue = ((-1 * constant) / (double) coefficient);
		parameterValue = Math.round(parameterValue * 100.0) / 100.0;
		
		solution.addStep();
		solution.getLastStep().getSolutionParts().add(coefficient + "t" + " + ");
		solution.getLastStep().getSolutionParts().add(constant + " = 0");
		solution.getLastStep().setPosition(new int[] {100, 300});
		
		// Step 7
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("t = " + parameterValue + "\\text {, substitute this into \\textbf {QP}}");
		solution.getLastStep().setPosition(new int[] {100, 330});
		
		
	
		// Step 8
		Vector vectorQP = new Vector(parameterValue * QP.getDirectionVector().getX()
				+ QP.getPositionVector().getX(), 
				parameterValue * QP.getDirectionVector().getY() 
				+ QP.getPositionVector().getY(),
				parameterValue * QP.getDirectionVector().getZ() 
				+ QP.getPositionVector().getZ());
		
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("\\text {\\textbf {QP} = " + vectorQP.toStringDouble());
		solution.getLastStep().setPosition(new int[] {100, 360});

		
		// Step 9
		
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("\\text {Find the magnitude}");
		solution.getLastStep().setPosition(new int[] {100, 390});
		
		
		// Step 10 
		double answer = Math.round(vectorQP.getMagnitude() * 100.0) / 100.0;
		
		solution.addStep();
		solution.getLastStep().getSolutionParts().add("= "+ String.valueOf(answer));
		solution.getLastStep().setPosition(new int[] {100, 420});
		
		
		
		
		
		
		tracedStep = solution.getHead();
		// adding components to screen
		componentsList = new JComponent[] {problemButton, problemTitle, questionTitle, lineTitle.getLabel(), titleA.getLabel(), nextButton, prevButton};
		for (JComponent component : componentsList)
		{
			Main.screen.add(component, Integer.valueOf(1));
		}
		
		
	}

}
