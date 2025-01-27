// Import the following packages:
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * The following class is for the login page of the application
 * @author Sri
 *
 */
public class mindsetLogin {
	
	// Class variables
	static JLabel loginCheck = new JLabel();
	
	public mindsetLogin() {
		
		// Set the current design of the JFrame
		mindsetApp.frame.setSize(500, 700);
		mindsetApp.frame.getContentPane().setBackground(new Color(167, 202, 235));
		displayLoginPage();
		
	} // End of mindsetLogin() constructor
	
	/**
	 * The following method displays the login page of the application
	 */
	public static void displayLoginPage() {
		
		// Create a "LOGIN" header
		JLabel hlogin = new JLabel("login");
		hlogin.setBounds(190, 25, 150, 50);
		hlogin.setFont(new Font("Cooper Black", Font.PLAIN, 40));
		hlogin.setForeground(new Color(208, 235, 190));
		
		// Create JLabel's for the user's name, username, and password
		JLabel hname = new JLabel("name: ");
		hname.setBounds(80, 120, 150, 20);
		hname.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		hname.setForeground(new Color(45, 94, 173));
		
		JLabel husername = new JLabel("username: ");
		husername.setBounds(80, 160, 150, 20);
		husername.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		husername.setForeground(new Color(45, 94, 173));
		
		JLabel hpwd = new JLabel("password: ");
		hpwd.setBounds(80, 200, 150, 20);
		hpwd.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		hpwd.setForeground(new Color(45, 94, 173));
		
		// Add JLabels to the frame
		mindsetApp.frame.add(hlogin);
		mindsetApp.frame.add(hname);
		mindsetApp.frame.add(husername);
		mindsetApp.frame.add(hpwd);
		
		// Create JTextLabels for the user to enter their information
		JTextField fname = new JTextField();
		fname.setBounds(200, 120, 215, 20);
		
		JTextField fusername = new JTextField();
		fusername.setBounds(200, 160, 215, 20);
		
		JTextField fpwd = new JTextField();
		fpwd.setBounds(200, 200, 215, 20);
		
		// Add JTextFields to the frame
		mindsetApp.frame.add(fname);
		mindsetApp.frame.add(fusername);
		mindsetApp.frame.add(fpwd);
		
		// Create "ENTER" JButton
		JButton bEnterInfo = new JButton("ENTER");
		bEnterInfo.setBounds(180, 250, 110, 40);
		bEnterInfo.setBackground(new Color(213, 237, 161));
		bEnterInfo.setFont(new Font("Cooper Black", Font.BOLD, 15));
		
		// Add an ActionListener that clears the JFrame and leads the user
		// to the Activities page of the application
		bEnterInfo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Get the text the user enters into the info fields
				String enteredName = fname.getText();
				String enteredUser = fusername.getText();
				String enteredPwd = fpwd.getText();
				
				loginCheck.setBounds(140, 310, 250, 40);
				loginCheck.setFont(new Font("Bahnschrift", Font.TRUETYPE_FONT, 17));
				loginCheck.setForeground(Color.WHITE);
				
				// Check user's login info with their original account info
				if (mindsetAccount.checkInformation(enteredName, enteredUser, enteredPwd)) {
					
					// Remove all elements from the frame
					mindsetApp.frame.getContentPane().removeAll();
					
					// Set frame background
					mindsetApp.frame.setBackground(new Color(167, 202, 235));
					
					// Link to Activities page
					mindsetActivities act = new mindsetActivities(); // instance
					
				} else {
					loginCheck = new JLabel("Incorrect info, try again!");
					mindsetApp.frame.add(loginCheck);
				}
				
				// Repaint the frame
				mindsetApp.frame.repaint();
				
			}
			
		});
		
		// Add the "ENTER" JButton to the frame
		mindsetApp.frame.add(bEnterInfo);
		
		// Create a back JButton
		JButton bLoginBack = new JButton("back");
		bLoginBack.setBounds(360, 590, 100, 40);
		bLoginBack.setFont(new Font("Cooper Black", Font.PLAIN, 18));
		bLoginBack.setBackground(new Color(72, 115, 184));
		bLoginBack.setForeground(Color.WHITE);
		
		// Add an ActionListener that leads the user back to the welcome page
		bLoginBack.addActionListener(new ActionListener() {

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
		mindsetApp.frame.add(bLoginBack);
		
	} // End of displayLoginPage() method

}