package components;
import javax.swing.ImageIcon; // imageicon
import javax.swing.JLabel; // jlabel
import main.Main;

public class Menu {

	/* Initializing components of the menu */
	static MenuOpener menuOpener; // menu button
	static JLabel arrowClosed; // arrow for when menu is closed
	static JLabel arrowOpened; // arrow for when menu is opened
	
	static MenuButton BasicsButton; // first button
	static MenuButton LinesButton; // second button
	static MenuButton ShapesButton; // third button
	static MenuButton RandomButton; // fourth button
	
	// menu state variable
	public static boolean showingMenu = false;
		
		
		
	public Menu()
	{
		
		// creating the menu opener
		menuOpener = new MenuOpener();
		
		// creating opened arrow
		arrowClosed = new JLabel(new ImageIcon(getClass().getResource("/images/arrowClosed.png")));
		arrowClosed.setBounds(28, 65, 27, 44);
		
		// creating closed arrow
		arrowOpened = new JLabel(new ImageIcon(getClass().getResource("/images/arrowOpened.png")));
		arrowOpened.setBounds(900, 65, 27, 44);
		
		
		
		// Creating Problem-selection buttons inside the menu
		BasicsButton = new MenuButton(30, 100, 260, 100, "1. Vector Basics", Main.problemTypes[0]); 
		LinesButton = new MenuButton(30, 200, 260, 100, "2. Lines", Main.problemTypes[1]); 
		ShapesButton = new MenuButton(30, 300, 260, 100, "3. Shapes", Main.problemTypes[2]); 
		RandomButton = new MenuButton(30, 400, 260, 100, "4. Random", Main.problemTypes[3]); 
		
		
		
		// adding the components to the screen
		Main.screen.add(menuOpener, Integer.valueOf(2));
		Main.screen.add(arrowClosed, Integer.valueOf(3));
		

	}
		
	// show menu method
	public static void showMenu() {
		// opening the menu
		showingMenu = true; // change menu state to true
		menuOpener.setBounds(0, 0, 1000, 768); // extend the menu
		
		// changing arrow types
		arrowClosed.setVisible(false);
		Main.screen.remove(arrowClosed); 
		Main.screen.remove(BasicsButton);
		arrowOpened.setVisible(true);
		Main.screen.add(arrowOpened, Integer.valueOf(3));
		
		/* displaying components */
		Main.screen.add(BasicsButton, Integer.valueOf(3)); // adding the button to the layer on top of the menu
		Main.screen.add(LinesButton, Integer.valueOf(3));
		Main.screen.add(ShapesButton, Integer.valueOf(3));
		Main.screen.add(RandomButton, Integer.valueOf(3));
	}
	
	public static void closeMenu() {
		showingMenu = false; // change menu state to false
		menuOpener.setBounds(0, 0, 75, 768); // return menu to original size
		
		
		// changing arrow types
		arrowOpened.setVisible(false); // removing the open arrow
		Main.screen.remove(arrowOpened);
		
		if (arrowClosed.isVisible() != true)
		{
			arrowClosed.setVisible(true); // adding the closing arrow
			Main.screen.add(arrowClosed, Integer.valueOf(3));
			
		}
		
		// removing all of the menu buttons
		Main.screen.remove(BasicsButton);
		Main.screen.remove(LinesButton);
		Main.screen.remove(ShapesButton);
		Main.screen.remove(RandomButton);
	}

}
