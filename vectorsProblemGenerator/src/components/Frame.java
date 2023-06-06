package components;
import java.awt.Color; // getting java colors
import javax.swing.ImageIcon; // imageicon
import javax.swing.JFrame; // jframe
import javax.swing.JLabel; // jlabel
// importing packages
import main.*;


public class Frame extends JFrame{

	/* Initializing Components of frame*/
	JLabel background; // grid background
	ImageIcon icon; // frame icon

	public Frame()  {
		
		// setting the frame icon
		icon = new ImageIcon(getClass().getResource("/images/logo.png"));
		this.setIconImage(icon.getImage());
		
		// setting the background
		background = new JLabel(new ImageIcon(getClass().getResource("/images/gridlines.png")));
		background.setSize(1366, 768);
		
		// close menu if the mouse goes onto the background (off of the menuOpener)
		background.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent event) {
				Menu.closeMenu();
			}
			
			
		});
		
		
		/* Initializing the frame and settings */
		this.setSize(1366, 768); // size
		this.setLocationRelativeTo(null); // set origin to top left
		this.setTitle("IB Vectors Assistant"); // title
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit program when X is pressed
		this.setResizable(false); // disabling frame from being resized
		this.getContentPane().setBackground(Color.black); // color
		this.setLayout(null); // setting the layout to none
		
		// Adding components to the frame's screen
		Main.screen.add(background, Integer.valueOf(0)); // background

	}
}
