package pages;
import main.*;


import javax.swing.ImageIcon; // imageicon
import javax.swing.JLabel; // jlabel
import javax.swing.JComponent; // jcomponent


public class MainPage implements BasePage{

	// initializing components
	public static JLabel title;
	public static JLabel subTitle;
	public static JLabel parallelogramImage;
	
	// list of components on this page
	private static JComponent[] componentsList;
	
	
	public MainPage()
	{
		
		/* Creating components of the main page*/
		
		// title
		title = new JLabel(new ImageIcon(getClass().getResource("/images/title.png")));
		title.setBounds(100, 70, 342, 29);
		
		// subtitle
		subTitle = new JLabel(new ImageIcon(getClass().getResource("/images/subtitle.png")));
		subTitle.setBounds(100, 140, 187, 16);
		
		// image of parallelogram 
		parallelogramImage = new JLabel(new ImageIcon(getClass().getResource("/images/parallelogram.png"))); // image 
		parallelogramImage.setBounds(750, 200, 700, 700);
		
		
		// adding all components to the component list
		componentsList = new JComponent[] {title, subTitle, parallelogramImage}; 
		
		
		/* Adding components to the screen  */
		
		Main.screen.add(title, Integer.valueOf(1)); // title "IB Vectors Assistant"
		Main.screen.add(subTitle, Integer.valueOf(1)); // subtitle "Problem Set Generator"
		Main.screen.add(parallelogramImage, Integer.valueOf(1)); // parallelogram
		Main.programLoaded = true;

	}

	public void openPage() {
		// TODO Auto-generated method stub
		
	}

	public void closePage() {
		// TODO Auto-generated method stub
		
		// close all the components that are currently open
		for (JComponent component : componentsList)
		{
			component.setVisible(false);
			Main.screen.remove(component);
		}
		
		
	}
}


