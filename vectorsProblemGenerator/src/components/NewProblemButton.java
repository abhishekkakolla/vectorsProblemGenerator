package components;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton; // jbutton
import problemTypes.*;
import main.*;



public class NewProblemButton extends JButton {
	
	
	public NewProblemButton(String specificProblem)
	{
		
	
		this.setBackground(Main.pink); // color
		
		
		
		this.setText("New Problem");
		this.setBounds(920, 144, 150, 30); // dimensions & position
		
		// adding an action listener for click event
				this.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent event) 
							{
								if (specificProblem == "magnitudeOfAVector")
								{
									Main.openProblem.closeQuestion(); // close the current question
									MagnitudeOfAVector problem = new MagnitudeOfAVector(); // opening specific problem page
									Main.openProblem = problem; // setting the current open problem to this instance problem
								}
								else if (specificProblem == "vectorOperations")
								{
									Main.openProblem.closeQuestion(); // close the current question
									VectorOperations problem = new VectorOperations(); // opening specific problem page
									Main.openProblem = problem; // setting the current open problem to this instance problem
									
								}
								else if (specificProblem == "dotProduct")
								{
									Main.openProblem.closeQuestion(); // close the current question
									DotProduct problem = new DotProduct(); // opening specific problem page
									Main.openProblem = problem; // setting the current open problem to this instance problem
									
								}
								else if (specificProblem == "crossProduct")
								{
									Main.openProblem.closeQuestion(); // close the current question
									CrossProduct problem = new CrossProduct(); // opening specific problem page
									Main.openProblem = problem; // setting the current open problem to this instance problem
									
								}
								
								else if (specificProblem == "distancePointLine")
								{
									Main.openProblem.closeQuestion(); // close the current question
									DistancePointLine problem = new DistancePointLine(); // opening specific problem page
									Main.openProblem = problem; // setting the current open problem to this instance problem
									
								}
								else if (specificProblem == "angleLineLine")
								{
									Main.openProblem.closeQuestion(); // close the current question
									AngleLineLine problem = new AngleLineLine(); // opening specific problem page
									Main.openProblem = problem; // setting the current open problem to this instance problem
									
								}
								else if (specificProblem == "areaTriangle")
								{
									Main.openProblem.closeQuestion(); // close the current question
									AreaTriangle problem = new AreaTriangle(); // opening specific problem page
									Main.openProblem = problem; // setting the current open problem to this instance problem
									
								}
								else if (specificProblem == "areaParallelogram")
								{
									Main.openProblem.closeQuestion(); // close the current question
									AreaParallelogram problem = new AreaParallelogram(); // opening specific problem page
									Main.openProblem = problem; // setting the current open problem to this instance problem
									
								}
								else if (specificProblem == "volumeParallelepiped")
								{
									Main.openProblem.closeQuestion(); // close the current question
									VolumeParallelepiped problem = new VolumeParallelepiped(); // opening specific problem page
									Main.openProblem = problem; // setting the current open problem to this instance problem
									
								}
								else if (specificProblem == "volumeTetrahedron")
								{
									Main.openProblem.closeQuestion(); // close the current question
									VolumeTetrahedron problem = new VolumeTetrahedron(); // opening specific problem page
									Main.openProblem = problem; // setting the current open problem to this instance problem
									
								}
							}
						});
				
	}
	
}
