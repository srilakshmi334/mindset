// Import the following packages:
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * The following class is for the sign-up page of the application
 * @author Sri
 *
 */
public class mindsetSignUp {
	
	// Class variables
	static JLabel incorrectInfo = new JLabel();
	static JLabel completeSignUp = new JLabel();
	
	public mindsetSignUp() {
		
		// Set the current design of the JFrame
		mindsetApp.frame.setSize(500, 700);
		mindsetApp.frame.getContentPane().setBackground(new Color(167, 202, 235));
		displaySignUpPage();
	}
	
	/**
	 * The following method displays the sign-up page of the application
	 */
	public static void displaySignUpPage() {
		
		// Create a "SIGN-UP" header
		JLabel hsignup = new JLabel("sign-up");
		hsignup.setBounds(165, 25, 150, 50);
		hsignup.setFont(new Font("Cooper Black", Font.PLAIN, 40));
		hsignup.setForeground(new Color(142, 127, 173));
		
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
		
		JLabel minimumChars = new JLabel("(minimum 8 characters)");
		minimumChars.setBounds(80, 225, 250, 20);
		minimumChars.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		minimumChars.setForeground(new Color(45, 94, 173));
		
		// Add JLabels to the frame
		mindsetApp.frame.add(hsignup);
		mindsetApp.frame.add(hname);
		mindsetApp.frame.add(husername);
		mindsetApp.frame.add(hpwd);
		mindsetApp.frame.add(minimumChars);
		
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
		
		// Create a "COMPLETE SIGN-UP" button
		JButton bSignUpComplete = new JButton("complete sign-up");
		bSignUpComplete.setBounds(150, 265, 200, 40);
		bSignUpComplete.setBackground(new Color(228, 211, 242));
		bSignUpComplete.setFont(new Font("Cooper Black", Font.TRUETYPE_FONT, 15));
		
		// Add an ActionListener that confirms the user's successful sign-up
		bSignUpComplete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Get info that user entered in the fields
				String nameEntered = fname.getText();
				String userEntered = fusername.getText();
				String pwdEntered = fpwd.getText();
				
				// Repaint frame
				mindsetApp.frame.getContentPane();
				mindsetApp.frame.repaint();
				
				// Check the info entered into the fields
				
				// If the name and username are less than 1 character or the password is
				// less than 8 characters long, display an error message
				if (nameEntered.length() < 1 || userEntered.length() < 1 || pwdEntered.length() < 8) {
					
					// Incorrect info JLabel
					incorrectInfo.setText("Information is invalid, try again!");
					incorrectInfo.setBounds(120, 310, 250, 40);
					incorrectInfo.setFont(new Font("Bahnschrift", Font.TRUETYPE_FONT, 17));
					incorrectInfo.setForeground(Color.WHITE);
					
					// Add the incorrect info JLabel to the frame
					mindsetApp.frame.add(incorrectInfo);
					
				} else {
					mindsetAccount account = new mindsetAccount(nameEntered, userEntered, pwdEntered);
					
					// Create a JLabel confirming successful sign-up
					completeSignUp = new JLabel("Sign-Up Complete! Please Login.");
					completeSignUp.setBounds(120, 310, 300, 40);
					completeSignUp.setFont(new Font("Bahnschrift", Font.TRUETYPE_FONT, 17));
					completeSignUp.setForeground(Color.WHITE);
					
					// Clear incorrect info JLabel and repaint frame
					mindsetApp.frame.getContentPane().remove(incorrectInfo);
					mindsetApp.frame.repaint();
					
					// Add the sign-up confirmation label to the frame
					mindsetApp.frame.add(completeSignUp);
					
					// Create a button leading the user back to the login page
					JButton bBackToLogin = new JButton("login");
					bBackToLogin.setBounds(150, 360, 200, 40);
					bBackToLogin.setBackground(new Color(208, 235, 190));
					bBackToLogin.setFont(new Font("Cooper Black", Font.TRUETYPE_FONT, 20));
					
					// Create an ActionListener that leads the user back to the login page
					bBackToLogin.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							
							// Clear and repaint the frame
							mindsetApp.frame.getContentPane().removeAll();
							mindsetApp.frame.repaint();
							
							// Link to the login page
							mindsetLogin.displayLoginPage();
							
						}
						
					});
					
					// Add JButton to frame
					mindsetApp.frame.add(bBackToLogin);
					
				}
				
			}
			
		});
		
		// Add the "COMPLETE SIGN-UP" button to the frame
		mindsetApp.frame.add(bSignUpComplete);
		
		// Create a back JButton
		JButton bSignUpBack = new JButton("back");
		bSignUpBack.setBounds(360, 590, 100, 40);
		bSignUpBack.setFont(new Font("Cooper Black", Font.PLAIN, 18));
		bSignUpBack.setBackground(new Color(72, 115, 184));
		bSignUpBack.setForeground(Color.WHITE);
				
		// Add an ActionListener that leads the user back to the welcome page
		bSignUpBack.addActionListener(new ActionListener() {

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
		mindsetApp.frame.add(bSignUpBack);
		
	} // End of displaySignUp() method

}