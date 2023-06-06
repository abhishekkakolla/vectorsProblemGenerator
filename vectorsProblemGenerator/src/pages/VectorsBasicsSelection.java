package pages;
import main.*;
import components.*;

import javax.swing.ButtonGroup;
import javax.swing.JComponent;


public class VectorsBasicsSelection implements BasePage{

	
	// initializing components
	public static Title problemTitle;
	public static ProblemRadioButton magnitudeOfAVector;
	public static ProblemRadioButton vectorOperations;
	public static ProblemRadioButton dotProduct;
	public static ProblemRadioButton crossProduct;
	
	// list of components on this page
	private static JComponent[] componentsList;
	
	
	public VectorsBasicsSelection()
	{
		
		/* Creating components of the problem page*/
		
		// title
		problemTitle = new Title("Problem type: " + Main.currentProblem, 100, 55, 800, 60, 40);
		
		
		
		// radio buttons
		magnitudeOfAVector = new ProblemRadioButton("Magnitude of a Vector", 100, 200, 200, 30, "magnitudeOfAVector");
		vectorOperations = new ProblemRadioButton("Operations with Vectors", 100, 250, 200, 30, "vectorOperations");
		dotProduct = new ProblemRadioButton("Dot Product", 100, 300, 200, 30, "dotProduct");
		crossProduct = new ProblemRadioButton("Cross Product", 100, 350, 200, 30, "crossProduct");
	
		// adding radio buttons to button group
		ButtonGroup vectorsBasics = new ButtonGroup();
		vectorsBasics.add(magnitudeOfAVector);
		vectorsBasics.add(vectorOperations);
		vectorsBasics.add(dotProduct);
		vectorsBasics.add(crossProduct);
		
		// adding all components to the component list
		componentsList = new JComponent[] {problemTitle, magnitudeOfAVector, vectorOperations, dotProduct, crossProduct}; 
		

	}

	public void openPage() 
	{
		// TODO Auto-generated method stub
		
		
		// if the page is not open, open it (to prevent duplicates)
		if (Main.openPage !=  Main.vectorsBasicsSelection)
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


