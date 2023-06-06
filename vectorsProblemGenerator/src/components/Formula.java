package components;

import java.awt.Color;

import javax.swing.JLabel;

import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXIcon;
public class Formula {

	JLabel formulaLabel;
	
	// constructor that takes in latex, position, and size and builds a latex formula
	public Formula(String latex, int posX, int posY, int sizeX, int sizeY)
	{
		// creating TeXFormula
        TeXFormula formula = new TeXFormula(latex);
        // styling
        formula.setColor(Color.white);	
        // creating icon
        TeXIcon icon = formula.createTeXIcon(TeXConstants.STYLE_DISPLAY, 25);
        // putting the formula into a JLabel for display
        formulaLabel = new JLabel();
        formulaLabel.setIcon(icon);
        formulaLabel.setBounds(posX, posY, sizeX, sizeY);
	}

	
	// getter for the label
	public JLabel getLabel()
	{
		return formulaLabel;
	}
}
