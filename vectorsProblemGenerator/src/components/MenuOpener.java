package components;
import javax.swing.JButton; // jbutton

//importing packages
import main.*;


public class MenuOpener extends JButton {

	
	public MenuOpener() 
	{
		this.setBounds(0, 0, 75, 768); // dimensions & position
		this.setBackground(Main.pink); // color
		this.setBorderPainted(false); // removing the borders
		this.setFocusPainted(false);
		
		// open menu if the menu opener is hovered over
		this.addMouseListener(new java.awt.event.MouseAdapter() { // hover listener
		public void mouseEntered(java.awt.event.MouseEvent event ) {
			if (Menu.showingMenu == false)
			{
				Menu.showMenu(); // show menu
			}
		}
		
		});
		
	}
}
