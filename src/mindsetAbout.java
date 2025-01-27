// Import the following packages:
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * The following class displays the about page of the program
 * @author Sri
 *
 */
public class mindsetAbout {

	public mindsetAbout() {
		
		// Set the current design of the JFrame
		mindsetApp.frame.setSize(500, 700);
		mindsetApp.frame.getContentPane().setBackground(new Color(167, 202, 235));
		displayAboutPage();
		
	} // End of mindsetAbout() constructor
	
	public static void displayAboutPage() {
		
		// Declare variables
		String fileName = "aboutmindset.txt";
		String line;
		
		// Create a JTextArea to store the information in aboutmindset.txt
		JTextArea a1 = new JTextArea();
		a1.setBounds(18, 90, 445, 500);
		a1.setForeground(Color.BLACK);
		a1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		a1.setOpaque(false); // make the JTextArea transparent
		
		// Add the JTextArea to the frame and make it non-editable
		mindsetApp.frame.add(a1);
		a1.setEditable(false);
		
		// Read data from the aboutmindset.txt file and add the information to the JTextArea
		try {
			BufferedReader in = new BufferedReader(new FileReader(fileName));
			
			// Read in each line while the aboutmindset.txt file is empty and add
			// each one to the JTextArea
			while ((line = in.readLine()) != null) {
				a1.read(in, "a1");
			}
		}
		
		// Else, print an error message to the console regarding the reading of the file
		catch(IOException iox) {
			System.out.println("Problem reading " + fileName);
		}
		
		// Create a message header 
		JLabel message = new JLabel("a message from the creators...");
		message.setBounds(50, 35, 370, 25);
		message.setFont(new Font("Cooper Black", Font.PLAIN, 24));
		message.setForeground(Color.WHITE);
		
		// Create a copyright JLabel
		JLabel copyrightinfo = new JLabel("Copyright mindset 2023. All Rights Reserved. agroup4intiativeproject.");
		copyrightinfo.setBounds(30, 625, 500, 20);
		copyrightinfo.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		copyrightinfo.setForeground(Color.BLACK);
		
		// Add the JLabels to the frame
		mindsetApp.frame.add(message);
		mindsetApp.frame.add(copyrightinfo);
		
		// Create a back JButton
		JButton bAboutBack = new JButton("back");
		bAboutBack.setBounds(344, 570, 100, 40);
		bAboutBack.setFont(new Font("Cooper Black", Font.PLAIN, 18));
		bAboutBack.setBackground(new Color(72, 115, 184));
		bAboutBack.setForeground(Color.WHITE);
		
		// Add an ActionListener that leads the user back to the welcome page
		bAboutBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Clear and repaint the frame
				mindsetApp.frame.getContentPane().removeAll();
				mindsetApp.frame.repaint();
				
				// Link back to the welcome page
				mindsetApp.displayWelcomePage();
				
			}
			
		});
		
		// Add the JButton to the frame
		mindsetApp.frame.add(bAboutBack);
		
	} // End of displayAboutPage() method
}