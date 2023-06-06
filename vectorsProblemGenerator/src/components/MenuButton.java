package components;
import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;

//importing packages
import main.*;


public class MenuButton extends JButton{


	
	
	public void setColor(Color color)
	{
		this.setForeground(color);
	}
	
	
	public MenuButton(int posX, int posY, int sizeX, int sizeY, String text, String problemType) 
	{
		// setting basic settings of the menu button
		this.setBounds(posX, posY, sizeX, sizeY); // dimensions & position
		this.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.setText(text);
		this.setHorizontalAlignment(SwingConstants.LEFT);
		this.setForeground(Main.white); // color
		this.setBorderPainted(false); // removing the borders
		this.setFocusPainted(false);
		this.setContentAreaFilled(false);
		this.setHorizontalTextPosition(LEFT);
		
		
		
		// highlighting effect
		this.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent event) {
				setColor(Main.black); // change color
			}
			public void mouseExited(java.awt.event.MouseEvent event) {
				setColor(Main.white); // color
			}
		});
		
		
		// click function
		this.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				
				
				
				Menu.closeMenu(); // closing the menu
				Main.mainPage.closePage(); // closing the main page
				
				
				Main.currentProblem = problemType; // changing the current problem
				
				
				
				
				System.out.println(Main.currentProblem);
				
				// opening the desired selection page based on the button clicked
				if (problemType == "VectorsBasics")
				{
					if (Main.openPage != null && Main.openPage != Main.vectorsBasicsSelection) // checking if a page is open
					{
						Main.openPage.closePage(); // close whatever page is open
						if (Main.openProblem != null)
						{
							Main.openProblem.closeQuestion(); // close whatever problem is open
						}
						
					}
					Main.vectorsBasicsSelection.openPage(); // open this specific page
					Main.openPage = Main.vectorsBasicsSelection; // set the openPage to the opened page
				}
				else if (problemType == "Lines" && Main.openPage != Main.linesSelection)
				{
					if (Main.openPage != null)
					{
						Main.openPage.closePage(); // close whatever page is open
						
					}
					Main.linesSelection.openPage();
					Main.openPage = Main.linesSelection;
				}
				else if (problemType == "Shapes" && Main.openPage != Main.shapesSelection)
				{
					if (Main.openPage != null)
					{
						Main.openPage.closePage(); // close whatever page is open
						
					}
					Main.shapesSelection.openPage();
					Main.openPage = Main.shapesSelection;
				}
				else if (problemType == "Random" && Main.openPage != Main.randomSelection)
				{
					if (Main.openPage != null)
					{
						Main.openPage.closePage(); // close whatever page is open
						
					}
					Main.randomSelection.openPage();
					Main.openPage = Main.randomSelection;
				}
				
				
				// if a problem is open, close it
				if (Main.openProblem != null)
				{
					Main.openProblem.closeQuestion();
				}
				
			}
		});
		
	}
	
}
