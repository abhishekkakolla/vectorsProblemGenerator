package components;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton; // jbutton


// importing packages
import pages.*;
import problemTypes.*;
import main.*;



public class ProblemRadioButton extends JRadioButton implements ActionListener {

	String[] problems = new String[] {"magnitudeOfAVector", "vectorOperations", "dotProduct", "crossProduct", "distancePointLine", "angleLineLine", "areaTriangle", "areaParallelogram", "volumeParallelepiped", "volumeTetrahedron"};
	String chosenProblem;
	
	
	public ProblemRadioButton(String text, int posX, int posY, int sizeX, int sizeY, String specificProblem)
	{
		this.setBounds(posX, posY, sizeX, sizeY); // dimensions & position
		this.setText(text);
		this.setBackground(Main.pink); // color
		this.setBorderPainted(false); // removing the borders
		this.setFocusPainted(false);
		
		
		
		// adding an action listener for click event
		this.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent event) 
					{
						if (specificProblem == "Random")
						{
							int randomNum = (int) (Math.random() * 10);
							System.out.println(randomNum);
							chosenProblem = problems[randomNum];
						}
						else
						{
							chosenProblem = specificProblem;
						}
						
						if (chosenProblem == "magnitudeOfAVector")
						{
							MagnitudeOfAVector problem = new MagnitudeOfAVector(); // opening specific problem page
							Main.openProblem = problem; // setting the current open problem to this instance problem
							
							
							
							Main.openPage.closePage();
							Main.openPage = null; // setting the current open page to null 
							
							
							
						}
						else if (chosenProblem == "vectorOperations")
						{
							VectorOperations problem = new VectorOperations(); // opening specific problem page
							Main.openProblem = problem; // setting the current open problem to this instance problem
							
							
							
							Main.openPage.closePage();
							Main.openPage = null; // setting the current open page to null 
							
							
							
						}
						else if (chosenProblem == "dotProduct")
						{
							DotProduct problem = new DotProduct(); // opening specific problem page
							Main.openProblem = problem; // setting the current open problem to this instance problem
							
							
							
							Main.openPage.closePage();
							Main.openPage = null; // setting the current open page to null 
							
							
							
						}
						else if (chosenProblem == "crossProduct")
						{
							CrossProduct problem = new CrossProduct(); // opening specific problem page
							Main.openProblem = problem; // setting the current open problem to this instance problem
							
							
							
							Main.openPage.closePage();
							Main.openPage = null; // setting the current open page to null 
							
							
							
						}
						
						else if (chosenProblem == "distancePointLine")
						{
							DistancePointLine problem = new DistancePointLine(); // opening specific problem page
							Main.openProblem = problem; // setting the current open problem to this instance problem
							
							
							
							Main.openPage.closePage();
							Main.openPage = null; // setting the current open page to null 
							
							
							
						}
						else if (chosenProblem == "angleLineLine")
						{
							AngleLineLine problem = new AngleLineLine(); // opening specific problem page
							Main.openProblem = problem; // setting the current open problem to this instance problem
							
							
							
							Main.openPage.closePage();
							Main.openPage = null; // setting the current open page to null 
							
							
							
						}
						else if (chosenProblem == "areaTriangle")
						{
							AreaTriangle problem = new AreaTriangle(); // opening specific problem page
							Main.openProblem = problem; // setting the current open problem to this instance problem
							
							
							
							Main.openPage.closePage();
							Main.openPage = null; // setting the current open page to null 
							
							
							
						}
						else if (chosenProblem == "areaParallelogram")
						{
							AreaParallelogram problem = new AreaParallelogram(); // opening specific problem page
							Main.openProblem = problem; // setting the current open problem to this instance problem
							
							
							
							Main.openPage.closePage();
							Main.openPage = null; // setting the current open page to null 
							
							
							
						}
						else if (chosenProblem == "volumeParallelepiped")
						{
							VolumeParallelepiped problem = new VolumeParallelepiped(); // opening specific problem page
							Main.openProblem = problem; // setting the current open problem to this instance problem
							
							
							
							Main.openPage.closePage();
							Main.openPage = null; // setting the current open page to null 
							
							
							
						}
						else if (chosenProblem == "volumeTetrahedron")
						{
							VolumeTetrahedron problem = new VolumeTetrahedron(); // opening specific problem page
							Main.openProblem = problem; // setting the current open problem to this instance problem
							
							
							
							Main.openPage.closePage();
							Main.openPage = null; // setting the current open page to null 
							
							
							
						}
					
					}
				});
		
	}
	
}
