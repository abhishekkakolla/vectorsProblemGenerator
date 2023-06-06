package components;
import javax.swing.JButton; // jbutton
import main.*;
import solutionStructures.*;



public class StepsButton extends JButton {
	String type;
	SolutionList solution;
	boolean created = false;
	
	public StepsButton(String type, SolutionList solution)
	{
		
		this.type = type;
		this.solution = solution;
	
		// styling
		this.setBackground(Main.pink); // color
		
		
		// render properties based on type of button
		if (type == "next")
		{
			this.setText("Next");
			this.setBounds(800, 144, 100, 30); // dimensions & position
		}
		else if (type == "previous")
		{
			this.setText("Previous");
			this.setVisible(false);
			this.setBounds(700, 144, 100, 30);
		}
		
		
	}
	
}
