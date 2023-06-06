/*
 * Title class that will be re-used to display text
 */

package components;

import java.awt.Font;
import javax.swing.JLabel;

import main.Main;

public class Title extends JLabel {

	
	// constructor
	public Title(String text, int posX, int posY, int sizeX, int sizeY, int fontSize) 
	{
		// setting basic settings of title
		this.setBounds(posX, posY, sizeX, sizeY);
		this.setText(text);
		this.setHorizontalTextPosition(JLabel.LEFT);
		this.setFont(new Font("Segoe UI", Font.PLAIN, fontSize));
		this.setForeground(Main.white);
	}
	
	public void setTitle(String text)
	{
		this.setText(text);
	}
	
	
}