package pages;
import main.*;
import components.*;

import javax.swing.ButtonGroup;
import javax.swing.JComponent;


public class ShapesSelection implements BasePage{

	
	// initializing components
	public static Title problemTitle;
	public static ProblemRadioButton areaTriangle;
	public static ProblemRadioButton areaParallelogram;
	public static ProblemRadioButton volumeParallelepiped;
	public static ProblemRadioButton volumeTetrahedron;

	
	
	// list of components on this page
	private static JComponent[] componentsList;
	
	
	public ShapesSelection()
	{
		
		/* Creating components of the problem page*/
		
		// title
		problemTitle = new Title("Problem type: " + Main.currentProblem, 100, 70, 800, 60, 40);
		
		
		
		// radio buttons
		areaTriangle = new ProblemRadioButton("Area of a triangle", 100, 200, 300, 30, "areaTriangle");
		areaParallelogram = new ProblemRadioButton("Area of a parallelogram", 100, 250, 300, 30, "areaParallelogram");
		volumeParallelepiped = new ProblemRadioButton("Volume of a parallelepiped", 100, 300, 300, 30, "volumeParallelepiped");
		volumeTetrahedron = new ProblemRadioButton("Volume of a tetrahedron", 100, 350, 300, 30, "volumeTetrahedron");
		
		
		// adding radio buttons to button group
		ButtonGroup shapes = new ButtonGroup();
		shapes.add(areaTriangle);
		shapes.add(areaParallelogram);
		shapes.add(areaParallelogram);
		shapes.add(volumeParallelepiped);
		shapes.add(volumeTetrahedron);
		
		// adding all components to the component list
		componentsList = new JComponent[] {problemTitle, areaTriangle, areaParallelogram, volumeParallelepiped, volumeTetrahedron}; 
		

	}

	public void openPage() 
	{
		// TODO Auto-generated method stub
		
		
		// if the page is not open, open it (to prevent duplicates)
		if (Main.openPage !=  Main.shapesSelection)
		{
			// Main.screen.add(problemTitle, Integer.valueOf(1)); // displaying title "IB Vectors Assistant" no?
			problemTitle.setText("Problem type: " + Main.currentProblem);
			for (JComponent component : componentsList)
			{
				component.setVisible(true);
				Main.screen.add(component, Integer.valueOf(1));
			}
		}
			
		
		
	}

	public void closePage() 
	{
		// TODO Auto-generated method stub
		
		// hiding and removing all components
		for (JComponent component : componentsList)
		{
			component.setVisible(false);
			Main.screen.remove(component);
		}

		
	}
}


