// Group 4 Project - mindset
/*
 * Date: 03/06/2022
 * Author: Srilakshmi Akhilan
 * - Welcome page
 */

// Import the following packages:
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * The following class runs the main method of the application
 * @author Sri
 *
 */
public class mindsetApp extends JFrame {
	
	// Create a JFrame
	public static JFrame frame = new JFrame("mindset");
	
	// JLabel for names
	static JLabel names = new JLabel("By: Angelina, Carolyn, Ahsan, Srilakshmi       (SPH3U7-02, SBI3U7-01)");
	
	public mindsetApp() {
		
		// Set the current design of the JFrame
		frame.setSize(500, 700);
		frame.getContentPane().setBackground(new Color(167, 202, 235));
		displayWelcomePage();
	}
	
	/**
	 * The following is a main method which runs the program and displays all the components
	 * of the different classes on the screen
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Call the welcome page method
		displayWelcomePage();
		
		// Display the components on the JFrame
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	} // End of main() method
	
	/**
	 * The following displays the welcome page of the application
	 * Includes a header, sub-text, and main menu button
	 */
	public static void displayWelcomePage() {
		
		// Set current design of JFrame
		frame.setSize(500, 700);
		frame.getContentPane().setBackground(new Color(167, 202, 235));
		
		// Create JLabel for header (app title)
		JLabel h1 = new JLabel("mindset.");
		h1.setBounds(115, 120, 300, 50);
		h1.setFont(new Font("Cooper Black", Font.BOLD, 52));
		h1.setForeground(Color.WHITE);
		
		// Add the elements for the names below
		names.setBounds(10, 620, 500, 30);
		names.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		names.setForeground(Color.WHITE);
		
		// Add the JLabels to the frame
		frame.add(h1);
		frame.add(names);
		
		// Create an "About" button
		JButton bAbout = new JButton("about");
		bAbout.setBounds(40, 200, 400, 50);
		bAbout.setBackground(new Color(245, 236, 193));
		bAbout.setFont(new Font ("Cooper Black", Font.TRUETYPE_FONT, 30));
		
		// Add an ActionListener that clears the JFrame and leads the user 
		// to the Main Menu page when the button is clicked
		bAbout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Clear all the components in the current JFrame
				frame.getContentPane().removeAll();
				frame.repaint();
				
				// Link to the about page
				mindsetAbout about = new mindsetAbout(); // instance
			
			}
			
		});
		
		// Create a "Login" button
		JButton bLogin = new JButton("login");
		bLogin.setBounds(40, 270, 400, 50);
		bLogin.setBackground(new Color(208, 235, 190));
		bLogin.setFont(new Font ("Cooper Black", Font.TRUETYPE_FONT, 30));
		
		// Add an ActionListener that clears the JFrame and leads the user
		// to the Login page when the button is clicked
		bLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Clear all the components in the current JFrame
				frame.getContentPane().removeAll();
				frame.repaint();
				
				// Link to the login page
				mindsetLogin login = new mindsetLogin();
			}
			
		});
		
		// Create a "Sign-Up" Button
		JButton bSignUp = new JButton("sign-up");
		bSignUp.setBounds(40, 340, 400, 50);
		bSignUp.setBackground(new Color(219, 205, 247));
		bSignUp.setFont(new Font("Cooper Black", Font.TRUETYPE_FONT, 30));
		
		// Add an ActionListener that clears the JFrame and leads the user
		// to the Sign-Up page when the button is clicked
		bSignUp.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Clear all components in the current JFrame
				frame.getContentPane().removeAll();
				frame.repaint();
				
				// Link to the sign-up page
				mindsetSignUp signup = new mindsetSignUp(); // instance
				
			}
			
		});
		
		// Add the JButtons to the Main Frame
		frame.add(bAbout);
		frame.add(bLogin);
		frame.add(bSignUp);
		
	} // End of displayWelcomePage() method

}