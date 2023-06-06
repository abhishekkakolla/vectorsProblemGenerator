package pages;
import main.*;
import components.*;

import javax.swing.ButtonGroup;
import javax.swing.JComponent;


public class RandomSelection implements BasePage{

	
	// initializing components
	public static Title problemTitle;
	public static ProblemRadioButton randomProblem;
	
	
	// list of components on this page
	private static JComponent[] componentsList;
	
	
	public RandomSelection()
	{
		
		/* Creating components of the problem page*/
		
		// title
		problemTitle = new Title("Problem type: " + Main.currentProblem, 100, 70, 800, 60, 40);
		
		
		// generating a random problem
		
		
		// radio buttons
		randomProblem = new ProblemRadioButton("Random Problem", 100, 200, 300, 30, "Random");
		
		
		// adding radio buttons to button group
		ButtonGroup random = new ButtonGroup();
		random.add(randomProblem);
		
		// adding all components to the component list
		componentsList = new JComponent[] {problemTitle, randomProblem}; 
		

	}

	public void openPage() 
	{
		// TODO Auto-generated method stub
		
		// if the page is not open, open it (to prevent duplicates)
		if (Main.openPage !=  Main.randomSelection)
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


