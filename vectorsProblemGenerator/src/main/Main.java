package main;

import javax.swing.*; // less efficient?

import components.Frame;
import components.Menu;

import java.awt.Color; // color
// importing packages
import pages.*;
import problemTypes.BaseProblem;

public class Main {

	/* Initializing the frame and screen */
	public static JLayeredPane screen = new JLayeredPane(); // layered pane (allows layering of components)
	public static Frame window = new Frame();	
	public static boolean programLoaded = false;
	
	// Color Palette
	public static Color pink = new Color(233, 49, 148);
	public static Color white = Color.white;
	public static Color black = Color.black;
	
	// Main problem types
	public static String[] problemTypes = {"VectorsBasics", "Lines", "Shapes", "Random"};
	public static String currentProblem = "None";
	
	// initializing components used in the main page
	public static MainPage mainPage = new MainPage(); // main page of the program
	public static Menu menu = new Menu(); // menu 
	public static VectorsBasicsSelection vectorsBasicsSelection = new VectorsBasicsSelection(); // problem selection page for vectors basics
	public static LinesSelection linesSelection = new LinesSelection(); // problem selection page for lines
	public static ShapesSelection shapesSelection = new ShapesSelection();
	public static RandomSelection randomSelection = new RandomSelection();
	
	
	// current problems and pages that are open
	public static BaseProblem openProblem;
	public static BasePage openPage = mainPage;
	

	
	public static void main(String[] args)
	{		
		// setting up the screen
		screen.setBounds(0, 0, 1366, 768);
		
		// make frame visible after all components have loaded
		if (programLoaded) 
		{
			window.setVisible(true);
			/* Adding components to the frame */
			window.add(screen);	
		}
		
	}
		
		
	

}
