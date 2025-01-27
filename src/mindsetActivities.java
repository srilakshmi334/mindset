// Import the following packages:
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeListener;

import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

/**
 * The following class is for the activities page with access to the games/relaxation exercises
 * as well as the user reflections and progress tracker
 * @author Sri - games, reflections, tracker
 * @author Ahsan & Sri - relaxation exercises
 *
 */
public class mindsetActivities {
	
	// Number of clicks counter
	public static int clickCounter = 0;
	
	// Initialize timer variables
	public static JLabel totalClicks = new JLabel("");
	public static JLabel timerLabel = new JLabel("");
	public static JLabel time = new JLabel("time: ");
	
	// Create the JButton for the circle that appears in Game 1
	public static JButton circleLabel = new JButton();
	
	// Create a "back" JButton for all the games linking to the games page
	public static JButton bGamesBack = new JButton("back");
	
	// Create a "coming soon!" JLabel
	public static JLabel updateMessage = new JLabel("coming soon!");
	
	// Create a "back" JButton for the relaxation page
	public static JButton bRelaxationBack = new JButton("back");
	
	public mindsetActivities() {
		
		// Set the current design of the JFrame
		mindsetApp.frame.setSize(500, 700);
		mindsetApp.frame.getContentPane().setBackground(new Color(167, 202, 235));
		displayActivitiesPage();
	}
	
	/**
	 * The following method displays the activities page of the application
	 */
	public static void displayActivitiesPage() {
		
		// Create an "ACTIVITIES" header
		JLabel hactivities = new JLabel("activities");
		hactivities.setBounds(145, 25, 190, 50);
		hactivities.setFont(new Font("Cooper Black", Font.PLAIN, 40));
		hactivities.setForeground(new Color(62, 133, 119));
		
		// Add "ACTIVITIES" JLabel to the frame
		mindsetApp.frame.add(hactivities);
		
		// Add a JButton to access the Games page
		JButton bGames = new JButton("games");
		bGames.setBounds(40, 110, 400, 50);
		bGames.setFont(new Font("Cooper Black", Font.TRUETYPE_FONT, 20));
		bGames.setBackground(new Color(197, 223, 235));
		
		// Add an ActionListener that leads the user to a new page with all the games
		bGames.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Clear and repaint the frame
				mindsetApp.frame.getContentPane().removeAll();
				mindsetApp.frame.repaint();
				
				// Link to a games page
				displayGames();
				
			}
			
		});
		
		// Add the Games JButton to the frame
		mindsetApp.frame.add(bGames);
		
		// Add a JButton to access the relaxation activities
		JButton bRelax = new JButton("relaxation station");
		bRelax.setBounds(40, 190, 400, 50);
		bRelax.setFont(new Font("Cooper Black", Font.TRUETYPE_FONT, 20));
		bRelax.setBackground(new Color(196, 200, 245));
		
		// Add an ActionListener that leads the user to the relaxation activities page
		bRelax.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Clear and repaint the frame
				mindsetApp.frame.getContentPane().removeAll();
				mindsetApp.frame.repaint();
				
				// Link to the relaxation activities page
				displayRelaxationPage();
				
			}
			
		});
		
		// Add the Relaxation JButton to the frame
		mindsetApp.frame.add(bRelax);
		
		// Add a JButton for the reflections page
		JButton bReflect = new JButton("reflections");
		bReflect.setBounds(40, 270, 170, 80);
		bReflect.setFont(new Font("Cooper Black", Font.TRUETYPE_FONT, 20));
		bReflect.setBackground(new Color(97, 123, 171));
		bReflect.setForeground(Color.WHITE);
		
		// Add an ActionListener that leads the user to the reflections page
		bReflect.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Clear and repaint the frame
				mindsetApp.frame.getContentPane().removeAll();
				mindsetApp.frame.repaint();
				
				// Link to the reflections page
				displayReflectionsPage();
				
			}
			
		});
		
		// Add the Reflections JButton to the frame
		mindsetApp.frame.add(bReflect);
		
		// Add a JButton for the progress tracker
		JButton bTrack = new JButton("progress tracker");
		bTrack.setBounds(220, 270, 220, 80);
		bTrack.setFont(new Font("Cooper Black", Font.TRUETYPE_FONT, 20));
		bTrack.setBackground(new Color(97, 123, 171));
		bTrack.setForeground(Color.WHITE);
		
		// Add an ActionListener that leads the user to the progress page
		bTrack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Clear and repaint the frame
				mindsetApp.frame.getContentPane().removeAll();
				mindsetApp.frame.repaint();
				
				// Link to the tracker page
				displayProgressPage();
				
			}
			
		});
		
		// Add the Progress Tracker JButton to the frame
		mindsetApp.frame.add(bTrack);
		
		// Create a logout JButton
		JButton bActivitiesLogout = new JButton("logout");
		bActivitiesLogout.setBounds(325, 590, 130, 40);
		bActivitiesLogout.setFont(new Font("Cooper Black", Font.PLAIN, 18));
		bActivitiesLogout.setBackground(new Color(72, 115, 184));
		bActivitiesLogout.setForeground(Color.WHITE);
				
		// Add an ActionListener that leads the user back to the welcome page
		bActivitiesLogout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
						
				// Clear and repaint the frame
				mindsetApp.frame.getContentPane().removeAll();
				mindsetApp.frame.repaint();
						
				// Link back to the welcome page
				displayLogoutPage();
						
			}
					
		});
				
		// Add the JButton to the frame
		mindsetApp.frame.add(bActivitiesLogout);
		
	} // End of displayActivitiesPage() method
	
	/**
	 * The following method displays the logout page
	 */
	public static void displayLogoutPage() {
		
		// Set the current design of the JFrame
		mindsetApp.frame.setSize(500, 700);
		mindsetApp.frame.getContentPane().setBackground(new Color(167, 202, 235));
		
		// Create a JLabel confirm logout
		JLabel hConfirmLogout = new JLabel("logout confirmed.");
		hConfirmLogout.setBounds(100, 200, 280, 40);
		hConfirmLogout.setFont(new Font("Cooper Black", Font.PLAIN, 30));
		hConfirmLogout.setForeground(Color.WHITE);
		
		// Create a JLabel to invite the user to log back in later on
		JLabel hLoginLater = new JLabel("feel free to login later!");
		hLoginLater.setBounds(70, 260, 340, 40);
		hLoginLater.setFont(new Font("Cooper Black", Font.PLAIN, 30));
		hLoginLater.setForeground(Color.WHITE);
		
		// Add JLabels to the frame
		mindsetApp.frame.add(hConfirmLogout);
		mindsetApp.frame.add(hLoginLater);
		
	}
	
	/**
	 * The following method displays the possible games available to the user
	 */
	public static void displayGames() {
		
		// Set the current design of the JFrame
		mindsetApp.frame.setSize(500, 700);
		mindsetApp.frame.getContentPane().setBackground(new Color(167, 202, 235));
		
		// Create a "GAMES" header
		JLabel hgames = new JLabel("games");
		hgames.setBounds(185, 25, 190, 50);
		hgames.setFont(new Font("Cooper Black", Font.PLAIN, 40));
		hgames.setForeground(new Color(143, 71, 118));
		
		// Add "GAMES" JLabel to the frame
		mindsetApp.frame.add(hgames);
		
		// Create JLabels for different games
		
		// Game 1 JLabel
		JLabel hGame1 = new JLabel("1. dot, dot, dot...");
		hGame1.setBounds(30, 100, 180, 40);
		hGame1.setFont(new Font("Cooper Black", Font.TRUETYPE_FONT, 20));
		
		// Game 2 JLabel
		JLabel hGame2 = new JLabel("2. do you remember?");
		hGame2.setBounds(30, 275, 240, 40);
		hGame2.setFont(new Font("Cooper Black", Font.TRUETYPE_FONT, 20));
		
		// Game 3 JLabel
		JLabel hGame3 = new JLabel("3. scrabble but easier...");
		hGame3.setBounds(30, 450, 240, 40);
		hGame3.setFont(new Font("Cooper Black", Font.TRUETYPE_FONT, 20));
		
		// Add JLabels to the frame
		mindsetApp.frame.add(hGame1);
		mindsetApp.frame.add(hGame2);
		mindsetApp.frame.add(hGame3);
		
		// Declare variables for game info
		String game1Descrip = "dotdotdot.txt";
		String line1;
		
		String game2Descrip = "doyouremember.txt";
		String line2;
		
		String game3Descrip = "scrabblebuteasier.txt";
		String line3;
		
		// Create JTextAreas to store the game info in the appropriate text files
		
		// Game 1 JTextArea
		JTextField aGame1 = new JTextField();
		aGame1.setBounds(30, 145, 445, 130);
		aGame1.setForeground(Color.BLACK);
		aGame1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		aGame1.setOpaque(false);
		
		// Add the JTextArea for Game 1 to the frame and make it non-editable
		mindsetApp.frame.add(aGame1);
		aGame1.setEditable(false);
		
		// Read data from dotdotdot.txt (Game 1) and add the info to the JTextArea
		try {
			BufferedReader in1 = new BufferedReader (new FileReader(game1Descrip));
			
			// Read in each line while the dotdotdot.txt file is empty and add
			// each one to the JTextArea
			while ((line1 = in1.readLine()) != null) {
				aGame1.read(in1, "aGame1");
			}
		}
		
		// Else, print an error message to the console regarding the reading of the file
		catch(IOException iox) {
			System.out.println("Problem reading " + game1Descrip);
		}
		
		// ------------------------------------------------------------------------------
		
		// Game 2 JTextArea
		JTextField aGame2 = new JTextField();
		aGame2.setBounds(30, 317, 445, 130);
		aGame2.setForeground(Color.BLACK);
		aGame2.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		aGame2.setOpaque(false);
		
		// Add the JTextArea for Game 2 to the frame and make it non-editable
		mindsetApp.frame.add(aGame2);
		aGame2.setEditable(false);
		
		// Read data from doyouremember.txt (Game 2) and add the info to the JTextArea
		try {
			BufferedReader in2 = new BufferedReader(new FileReader(game2Descrip));
			
			// Read in each line while the dotdotdot.txt file is empty and add
			// each one to the JTextArea
			while ((line1 = in2.readLine()) != null) {
				aGame2.read(in2, "aGame2");
			}
		}
		
		// Else, print an error message to the console regarding the reading of the file
		catch(IOException iox) {
			System.out.println("Problem reading " + game2Descrip);
		}
		
		// -----------------------------------------------------------------------------
		
		// Game 3 JTextArea
		JTextField aGame3 = new JTextField();
		aGame3.setBounds(30, 490, 445, 130);
		aGame3.setForeground(Color.BLACK);
		aGame3.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		aGame3.setOpaque(false);
		
		// Add the JTextArea for Game 2 to the frame and make it non-editable
		mindsetApp.frame.add(aGame3);
		aGame3.setEditable(false);
		
		// Read data from doyouremember.txt (Game 2) and add the info to the JTextArea
		try {
			BufferedReader in3 = new BufferedReader(new FileReader(game3Descrip));
					
			// Read in each line while the dotdotdot.txt file is empty and add
			// each one to the JTextArea
			while ((line1 = in3.readLine()) != null) {
				aGame3.read(in3, "aGame3");
			}
		}
				
		// Else, print an error message to the console regarding the reading of the file
		catch(IOException iox) {
			System.out.println("Problem reading " + game3Descrip);
		}
		
		// ------------------------------------------------------------------------------
		
		// Create a start JButton for Game 1
		JButton startGame1 = new JButton("start");
		startGame1.setBounds(360, 105, 100, 30);
		startGame1.setFont(new Font("Cooper Black", Font.PLAIN, 15));
		startGame1.setBackground(new Color(128, 118, 181));
		startGame1.setForeground(Color.WHITE);
		
		// Add an ActionListener that leads the user to the page for the first game
		startGame1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Clear and repaint frame
				mindsetApp.frame.getContentPane().removeAll();
				mindsetApp.frame.repaint();
				
				// Link to page for Game 1
				displayGame1();
				
			}
			
		});
		
		// Create a start JButton for Game 2
		JButton startGame2 = new JButton("start");
		startGame2.setBounds(360, 280, 100, 30);
		startGame2.setFont(new Font("Cooper Black", Font.PLAIN, 15));
		startGame2.setBackground(new Color(128, 118, 181));
		startGame2.setForeground(Color.WHITE);
				
		// Add an ActionListener that leads the user to the page for the first game
		startGame2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
						
				// Clear and repaint frame
				mindsetApp.frame.getContentPane().removeAll();
				mindsetApp.frame.repaint();
						
				// Link to page for Game 2
				displayGame2();
						
			}
					
		});
		
		// Create a start JButton for Game 3
		JButton startGame3 = new JButton("start");
		startGame3.setBounds(360, 455, 100, 30);
		startGame3.setFont(new Font("Cooper Black", Font.PLAIN, 15));
		startGame3.setBackground(new Color(128, 118, 181));
		startGame3.setForeground(Color.WHITE);
						
		// Add an ActionListener that leads the user to the page for the first game
		startGame3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
								
				// Clear and repaint frame
				mindsetApp.frame.getContentPane().removeAll();
				mindsetApp.frame.repaint();
								
				// Link to page for Game 3
				displayGame3();
								
			}
							
		});
		
		// Add the start JButtons for all three games to the frame
		mindsetApp.frame.add(startGame1);
		mindsetApp.frame.add(startGame2);
		mindsetApp.frame.add(startGame3);
		
		// Create a back JButton
		JButton bGamesBack = new JButton("back");
		bGamesBack.setBounds(360, 615, 100, 30);
		bGamesBack.setFont(new Font("Cooper Black", Font.PLAIN, 18));
		bGamesBack.setBackground(new Color(72, 115, 184));
		bGamesBack.setForeground(Color.WHITE);
				
		// Add an ActionListener that leads the user back to the welcome page
		bGamesBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					
				// Clear and repaint the frame
				mindsetApp.frame.getContentPane().removeAll();
				mindsetApp.frame.repaint();
						
				// Link back to the welcome page
				displayActivitiesPage();
						
			}
					
		});
				
		// Add the JButton to the frame
		mindsetApp.frame.add(bGamesBack);
		
	} // End of displayGames() method
	
	/**
	 * The following method will display Game 1 of the application
	 */
	public static void displayGame1() {
		
		// Set the current design of the JFrame
		mindsetApp.frame.setSize(500, 700);
		mindsetApp.frame.getContentPane().setBackground(new Color(167, 202, 235));
		
		// Create a header for the game
		JLabel game1Header = new JLabel("dot, dot, dot...");
		game1Header.setBounds(105, 25, 330, 50);
		game1Header.setFont(new Font("Cooper Black", Font.PLAIN, 35));
		
		// Create JLabel for game 1 instructions
		JLabel game1Instruct = new JLabel("Click the dot as many times possible in 45 seconds. Good Luck!");
		game1Instruct.setBounds(18, 60, 490, 90);
		game1Instruct.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		
		// Add JLabel to the frame
		mindsetApp.frame.add(game1Header);
		mindsetApp.frame.add(game1Instruct);
		
		// Create JButtons for different modes
		
		// Easy Mode JButton
		JButton easyGame1 = new JButton("easy");
		easyGame1.setBounds(50, 140, 100, 30);
		easyGame1.setFont(new Font("Cooper Black", Font.PLAIN, 15));
		easyGame1.setBackground(new Color(212, 207, 150));
		easyGame1.setForeground(Color.WHITE);
		
		// Create an ActionListener for the easy mode JButton to run the game
		easyGame1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Repaint the frame
				mindsetApp.frame.repaint();
				
				// Add ellipse JButton
				circleLabel.setIcon(new ImageIcon("circle.jpg"));
				circleLabel.setBounds(120, 200, 250, 250);
				circleLabel.setBackground(Color.WHITE);
				
				// Include a JLabel to track the number of clicks
				JLabel clicks = new JLabel("clicks: ");
				clicks.setBounds(170, 490, 120, 50);
				clicks.setFont(new Font("Cooper Black", Font.PLAIN, 20));
				clicks.setForeground(Color.BLACK);
				
				// Add the clicks JLabel to the frame
				mindsetApp.frame.add(clicks);
				
				// Include a JLabel for the time (seconds left)
				time.setBounds(170, 530, 120, 50);
				time.setFont(new Font("Cooper Black", Font.PLAIN, 20));
				time.setForeground(Color.BLACK);
				
				// Add the time JLabel to the frame
				mindsetApp.frame.add(time);
				
				// JLabel for the timer
				timerLabel.setBounds(270, 530, 100, 50);
				timerLabel.setFont(new Font("Cooper Black", Font.PLAIN, 20));
				timerLabel.setForeground(Color.BLACK);
				
				// Add the timer JLabel to the frame
				mindsetApp.frame.add(timerLabel);
				
				// Add the timer for game 1 - easy mode
				easyTimerGame1();
					
				// Add an ActionListener for the circle JButton 
				circleLabel.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						
						// Repaint the frame
						mindsetApp.frame.repaint();
						
						// Update the counter each time
						clickCounter += 1;
						
						// Display clicks counter
						totalClicks.setText("" + clickCounter);
						totalClicks.setBounds(270, 490, 120, 50);
						totalClicks.setFont(new Font("Cooper Black", Font.PLAIN, 20));
						totalClicks.setForeground(Color.BLACK);
						mindsetApp.frame.add(totalClicks);
							
					}
					
				});
				
				// Add the circle JButton to the frame
				mindsetApp.frame.add(circleLabel);
				
			}
			
		});
		
		// Medium Mode JButton
		JButton medGame1 = new JButton("medium");
		medGame1.setBounds(185, 140, 100, 30);
		medGame1.setFont(new Font("Cooper Black", Font.PLAIN, 15));
		medGame1.setBackground(new Color(212, 185, 150));
		medGame1.setForeground(Color.WHITE);
		
		// Create an ActionListener for the medium mode JButton to run the game
		medGame1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Repaint the frame
				mindsetApp.frame.repaint();
				
				// Add ellipse JButton
				circleLabel.setIcon(new ImageIcon("circle.jpg"));
				circleLabel.setBounds(140, 240, 220, 220);
				circleLabel.setBackground(Color.WHITE);
				
				// Include a JLabel to track the number of clicks
				JLabel clicks = new JLabel("clicks: ");
				clicks.setBounds(170, 490, 120, 50);
				clicks.setFont(new Font("Cooper Black", Font.PLAIN, 20));
				clicks.setForeground(Color.BLACK);
				
				// Add the clicks JLabel to the frame
				mindsetApp.frame.add(clicks);
				
				// Include a JLabel for the time (seconds left)
				time.setBounds(170, 530, 120, 50);
				time.setFont(new Font("Cooper Black", Font.PLAIN, 20));
				time.setForeground(Color.BLACK);
				
				// Add the time JLabel to the frame
				mindsetApp.frame.add(time);
				
				// JLabel for the timer
				timerLabel.setBounds(270, 530, 100, 50);
				timerLabel.setFont(new Font("Cooper Black", Font.PLAIN, 20));
				timerLabel.setForeground(Color.BLACK);
				
				// Add the timer JLabel to the frame
				mindsetApp.frame.add(timerLabel);
				
				// Add the timer for game 1 - medium mode
				mediumTimerGame1();
				
				// Add an ActionListener for the circle JButton 
				circleLabel.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						
						// Repaint the frame
						mindsetApp.frame.repaint();
						
						// Update the counter each time
						clickCounter += 1;
						
						// Display clicks counter
						totalClicks.setText("" + clickCounter);
						totalClicks.setBounds(270, 490, 120, 50);
						totalClicks.setFont(new Font("Cooper Black", Font.PLAIN, 20));
						totalClicks.setForeground(Color.BLACK);
						mindsetApp.frame.add(totalClicks);
							
					}
					
				});
				
				// Add the circle JButton to the frame
				mindsetApp.frame.add(circleLabel);
				
			}
			
		});
		
		// Hard Mode JButton
		JButton hardGame1 = new JButton("hard");
		hardGame1.setBounds(320, 140, 100, 30);
		hardGame1.setFont(new Font("Cooper Black", Font.PLAIN, 15));
		hardGame1.setBackground(new Color(212, 165, 150));
		hardGame1.setForeground(Color.WHITE);
		
		// Create an ActionListener for the hard mode JButton to run the game
		hardGame1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Repaint the frame
				mindsetApp.frame.repaint();
				
				// Add ellipse JButton
				circleLabel.setIcon(new ImageIcon("circle.jpg"));
				circleLabel.setBounds(160, 230, 170, 170);
				circleLabel.setBackground(Color.WHITE);
				
				// Include a JLabel to track the number of clicks
				JLabel clicks = new JLabel("clicks: ");
				clicks.setBounds(170, 450, 120, 50);
				clicks.setFont(new Font("Cooper Black", Font.PLAIN, 20));
				clicks.setForeground(Color.BLACK);
				
				// Add the clicks JLabel to the frame
				mindsetApp.frame.add(clicks);
				
				// Include a JLabel for the time (seconds left)
				time.setBounds(170, 490, 120, 50);
				time.setFont(new Font("Cooper Black", Font.PLAIN, 20));
				time.setForeground(Color.BLACK);
				
				// Add the time JLabel to the frame
				mindsetApp.frame.add(time);
				
				// JLabel for the timer
				timerLabel.setBounds(270, 490, 100, 50);
				timerLabel.setFont(new Font("Cooper Black", Font.PLAIN, 20));
				timerLabel.setForeground(Color.BLACK);
				
				// Add the timer JLabel to the frame
				mindsetApp.frame.add(timerLabel);
				
				// Add the timer for game 1 - hard mode
				hardTimerGame1();
				
				// Add an ActionListener for the circle JButton 
				circleLabel.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						
						// Repaint the frame
						mindsetApp.frame.repaint();
						
						// Update the counter each time
						clickCounter += 1;
						
						// Display clicks counter
						totalClicks.setText("" + clickCounter);
						totalClicks.setBounds(270, 450, 120, 50);
						totalClicks.setFont(new Font("Cooper Black", Font.PLAIN, 20));
						totalClicks.setForeground(Color.BLACK);
						mindsetApp.frame.add(totalClicks);
							
					}
					
				});
				
				// Add the circle JButton to the frame
				mindsetApp.frame.add(circleLabel);
				
			}
			
		});
		
		// Add mode JButtons to the frame
		mindsetApp.frame.add(easyGame1);
		mindsetApp.frame.add(medGame1);
		mindsetApp.frame.add(hardGame1);
		
		// Design "back" JButton for the games page
		bGamesBack.setBounds(350, 580, 100, 40);
		bGamesBack.setFont(new Font("Cooper Black", Font.PLAIN, 18));
		bGamesBack.setBackground(new Color(72, 115, 184));
		bGamesBack.setForeground(Color.WHITE);
		
		// Add an ActionListener that leads the user back to the games page
		bGamesBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Clear and repaint the frame
				mindsetApp.frame.getContentPane().removeAll();
				mindsetApp.frame.repaint();
				
				// Link to the games page
				displayGames();
				
			}
			
		});
		
		// Add back JButton to the frame
		mindsetApp.frame.add(bGamesBack);
		
	} // End of displayGame1() method
	
	/**
	 * The following method is to code the timer for Game 1 easy mode
	 */
	public static void easyTimerGame1() {
		
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			int numberOfSeconds = 45; // set the number of seconds for the timer
			
			public void run() {
				timerLabel.setText("" + numberOfSeconds--); // set text of remaining seconds
				
				// Once the timer reaches 0, tell the user the game is over and 
				// don't let them continue playing
				if (numberOfSeconds == 0) {
					mindsetApp.frame.remove(time);
					timerLabel.setText("game over!");
					timerLabel.setBounds(180, 530, 180, 50);
					circleLabel.setEnabled(false);
					
					timer.cancel(); // End the timer
				}
			}
			
		}, 0, 450);
		
	} // End of easyTimerGame1() method
	
	/**
	 * The following method is to code the timer for Game 1 medium mode
	 */
	public static void mediumTimerGame1() {
		
		// Initialize the timer variables
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			int numberOfSeconds = 30; // set the number of seconds for the timer
			
			public void run() {
				timerLabel.setText("" + numberOfSeconds--); // set text of remaining seconds
				
				// Once the timer reaches 0, tell the user the game is over and 
				// don't let them continue playing
				if (numberOfSeconds == 0) {
					mindsetApp.frame.remove(time);
					timerLabel.setText("game over!");
					timerLabel.setBounds(180, 530, 180, 50);
					circleLabel.setEnabled(false);
					
					timer.cancel(); // End the timer
				}
			}
			
		}, 0, 450);
		
	} // End of mediumTimerGame1() method
	
	/**
	 * The following method is to code the time for Game 1 hard mode
	 */
	public static void hardTimerGame1() {
		
		// Initialize the timer variables
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			int numberOfSeconds = 15; // set the number of seconds for the timer
			
			public void run() {
				timerLabel.setText("" + numberOfSeconds--); // set text of remaining seconds
				
				// Once the timer reaches 0, tell the user the game is over and 
				// don't let them continue playing
				if (numberOfSeconds == 0) {
					mindsetApp.frame.remove(time);
					timerLabel.setText("game over!");
					timerLabel.setBounds(180, 490, 180, 50);
					circleLabel.setEnabled(false);
					
					timer.cancel(); // End the timer
				}
			}
			
		}, 0, 450);
		
	} // End of hardTimerGame1() method
	
	/**
	 * The following method will display Game 2 of the application
	 */
	public static void displayGame2() {
		
		// Set the current design of the JFrame
		mindsetApp.frame.setSize(500, 700);
		mindsetApp.frame.getContentPane().setBackground(new Color(167, 202, 235));
				
		// Create a header for the game
		JLabel game2Header = new JLabel("do you remember?");
		game2Header.setBounds(75, 25, 330, 50);
		game2Header.setFont(new Font("Cooper Black", Font.PLAIN, 35));
				
		// Create JLabel for game 2 instructions
		JLabel game2Instruct = new JLabel("Match as many card pairs as possible in 45 seconds. Good Luck!");
		game2Instruct.setBounds(18, 60, 490, 90);
		game2Instruct.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
				
		// Add JLabel to the frame
		mindsetApp.frame.add(game2Header);
		mindsetApp.frame.add(game2Instruct);
		
		// Create JButtons for different modes
		
		// Easy Mode JButton
		JButton easyGame2 = new JButton("easy");
		easyGame2.setBounds(50, 140, 100, 30);
		easyGame2.setFont(new Font("Cooper Black", Font.PLAIN, 15));
		easyGame2.setBackground(new Color(212, 207, 150));
		easyGame2.setForeground(Color.WHITE);
		
		// Add an ActionListener for the easy mode JButton to run the game
		easyGame2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Repaint the frame
				mindsetApp.frame.repaint();
				
				// Design "coming soon!" JLabel
				updateMessage.setBounds(160, 230, 230, 50);
				updateMessage.setFont(new Font("Cooper Black", Font.PLAIN, 25));
				updateMessage.setForeground(Color.WHITE);
				
				// Add "coming soon!" JLabel to the frame
				mindsetApp.frame.add(updateMessage);
				
			}
			
		});
		
		// Medium Mode JButton
		JButton medGame2 = new JButton("medium");
		medGame2.setBounds(185, 140, 100, 30);
		medGame2.setFont(new Font("Cooper Black", Font.PLAIN, 15));
		medGame2.setBackground(new Color(212, 185, 150));
		medGame2.setForeground(Color.WHITE);
		
		// Add an ActionListener for the medium mode JButton to run the game
		medGame2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Repaint the frame
				mindsetApp.frame.repaint();
				
				// Design "coming soon!" JLabel
				updateMessage.setBounds(160, 230, 230, 50);
				updateMessage.setFont(new Font("Cooper Black", Font.PLAIN, 25));
				updateMessage.setForeground(Color.WHITE);
				
				// Add "coming soon!" JLabel to the frame
				mindsetApp.frame.add(updateMessage);
				
			}
			
		});
		
		// Hard Mode JButton
		JButton hardGame2 = new JButton("hard");
		hardGame2.setBounds(320, 140, 100, 30);
		hardGame2.setFont(new Font("Cooper Black", Font.PLAIN, 15));
		hardGame2.setBackground(new Color(212, 165, 150));
		hardGame2.setForeground(Color.WHITE);
		
		// Add an ActionListener for the hard mode JButton to run the game
		hardGame2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Repaint the frame
				mindsetApp.frame.repaint();
				
				// Design "coming soon!" JLabel
				updateMessage.setBounds(160, 230, 230, 50);
				updateMessage.setFont(new Font("Cooper Black", Font.PLAIN, 25));
				updateMessage.setForeground(Color.WHITE);
				
				// Add "coming soon!" JLabel to the frame
				mindsetApp.frame.add(updateMessage);
				
			}
			
		});
		
		// Add mode JButtons to the frame
		mindsetApp.frame.add(easyGame2);
		mindsetApp.frame.add(medGame2);
		mindsetApp.frame.add(hardGame2);
		
		// Design "back" JButton for the games page
		bGamesBack.setBounds(350, 580, 100, 40);
		bGamesBack.setFont(new Font("Cooper Black", Font.PLAIN, 18));
		bGamesBack.setBackground(new Color(72, 115, 184));
		bGamesBack.setForeground(Color.WHITE);
		
		// Add an ActionListener that leads the user back to the games page
		bGamesBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Clear and repaint the frame
				mindsetApp.frame.getContentPane().removeAll();
				mindsetApp.frame.repaint();
				
				// Link to the games page
				displayGames();
				
			}
			
		});
		
		// Add back JButton to the frame
		mindsetApp.frame.add(bGamesBack);
		
	} // End of displayGame2() method
	
	/**
	 * The following method will display Game 3 of the application
	 */
	public static void displayGame3() {
		
		// Set the current design of the JFrame
		mindsetApp.frame.setSize(500, 700);
		mindsetApp.frame.getContentPane().setBackground(new Color(167, 202, 235));
						
		// Create a header for the game
		JLabel game3Header = new JLabel("scrabble but easier...");
		game3Header.setBounds(50, 25, 430, 50);
		game3Header.setFont(new Font("Cooper Black", Font.PLAIN, 35));
						
		// Create JLabel for game 3 instructions
		JLabel game3Instruct = new JLabel("Unscramble as many words as you can in 45 seconds. Good Luck!");
		game3Instruct.setBounds(10, 60, 490, 90);
		game3Instruct.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
						
		// Add JLabel to the frame
		mindsetApp.frame.add(game3Header);
		mindsetApp.frame.add(game3Instruct);
		
		// Create JButtons for different modes
		
		// Easy Mode JButton
		JButton easyGame3 = new JButton("easy");
		easyGame3.setBounds(50, 140, 100, 30);
		easyGame3.setFont(new Font("Cooper Black", Font.PLAIN, 15));
		easyGame3.setBackground(new Color(212, 207, 150));
		easyGame3.setForeground(Color.WHITE);
				
		// Add an ActionListener for the easy mode JButton to run the game
		easyGame3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
						
				// Repaint the frame
				mindsetApp.frame.repaint();
						
				// Design "coming soon!" JLabel
				updateMessage.setBounds(160, 230, 230, 50);
				updateMessage.setFont(new Font("Cooper Black", Font.PLAIN, 25));
				updateMessage.setForeground(Color.WHITE);
						
				// Add "coming soon!" JLabel to the frame
				mindsetApp.frame.add(updateMessage);
			}
					
		});
		
		// Medium Mode JButton
		JButton medGame3 = new JButton("medium");
		medGame3.setBounds(185, 140, 100, 30);
		medGame3.setFont(new Font("Cooper Black", Font.PLAIN, 15));
		medGame3.setBackground(new Color(212, 185, 150));
		medGame3.setForeground(Color.WHITE);
		
		// Add an ActionListener for the medium mode JButton to run the game
		medGame3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Repaint the frame
				mindsetApp.frame.repaint();
				
				// Design "coming soon!" JLabel
				updateMessage.setBounds(160, 230, 230, 50);
				updateMessage.setFont(new Font("Cooper Black", Font.PLAIN, 25));
				updateMessage.setForeground(Color.WHITE);
				
				// Add "coming soon!" JLabel to the frame
				mindsetApp.frame.add(updateMessage);
				
			}
			
		});
		
		// Hard Mode JButton
		JButton hardGame3 = new JButton("hard");
		hardGame3.setBounds(320, 140, 100, 30);
		hardGame3.setFont(new Font("Cooper Black", Font.PLAIN, 15));
		hardGame3.setBackground(new Color(212, 165, 150));
		hardGame3.setForeground(Color.WHITE);
		
		// Add an ActionListener for the hard mode JButton to run the game
		hardGame3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Repaint the frame
				mindsetApp.frame.repaint();
				
				// Design "coming soon!" JLabel
				updateMessage.setBounds(160, 230, 230, 50);
				updateMessage.setFont(new Font("Cooper Black", Font.PLAIN, 25));
				updateMessage.setForeground(Color.WHITE);
				
				// Add "coming soon!" JLabel to the frame
				mindsetApp.frame.add(updateMessage);
				
			}
			
		});
		
		// Add mode JButtons to the frame
		mindsetApp.frame.add(easyGame3);
		mindsetApp.frame.add(medGame3);
		mindsetApp.frame.add(hardGame3);
		
		// Design "back" JButton for the games page
		bGamesBack.setBounds(350, 580, 100, 40);
		bGamesBack.setFont(new Font("Cooper Black", Font.PLAIN, 18));
		bGamesBack.setBackground(new Color(72, 115, 184));
		bGamesBack.setForeground(Color.WHITE);
		
		// Add an ActionListener that leads the user back to the games page
		bGamesBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Clear and repaint the frame
				mindsetApp.frame.getContentPane().removeAll();
				mindsetApp.frame.repaint();
				
				// Link to the games page
				displayGames();
				
			}
			
		});
		
		// Add back JButton to the frame
		mindsetApp.frame.add(bGamesBack);
		
	} // End of displayGame3() method
	
	/**
	 * The following method displays the relaxation exercises for this application
	 */
	public static void displayRelaxationPage() {
		
		// Set the current design of the JFrame
		mindsetApp.frame.setSize(500, 700);
		mindsetApp.frame.getContentPane().setBackground(new Color(167, 202, 235));
		
		// Create a header for the relaxation activities page
		JLabel hBreak = new JLabel("need a break?");
		hBreak.setBounds(100, 25, 340, 50);
		hBreak.setFont(new Font("Cooper Black", Font.PLAIN, 40));
		hBreak.setForeground(new Color(126, 133, 217));
		
		// Add the header for the relaxation activities to the frame
		mindsetApp.frame.add(hBreak);
		
		// Create a "music" JButton
		JButton bMusic = new JButton("music");
		bMusic.setBounds(40, 110, 400, 50);
		bMusic.setFont(new Font("Cooper Black", Font.TRUETYPE_FONT, 20));
		bMusic.setBackground(new Color(67, 54, 99));
		bMusic.setForeground(Color.WHITE);
		
		// Create an ActionListener that links to the music page of the app
		bMusic.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Clear and repaint the frame
				mindsetApp.frame.getContentPane().removeAll();
				mindsetApp.frame.repaint();
				
				// Add a header for the songs page
				JLabel hMindsetMusic = new JLabel("mindset music");
				hMindsetMusic.setBounds(90, 25, 350, 50);
				hMindsetMusic.setFont(new Font("Cooper Black", Font.PLAIN, 40));
				hMindsetMusic.setForeground(new Color(67, 54, 99));
				
				// Add the header to the frame
				mindsetApp.frame.add(hMindsetMusic);
				
				// Add JButtons for the different songs
				JButton song1 = new JButton("song 1");
				song1.setBounds(40, 110, 400, 50);
				song1.setFont(new Font("Cooper Black", Font.TRUETYPE_FONT, 20));
				song1.setBackground(new Color(250, 211, 207));
				
				JButton song2 = new JButton("song 2");
				song2.setBounds(40, 190, 400, 50);
				song2.setFont(new Font("Cooper Black", Font.TRUETYPE_FONT, 20));
				song2.setBackground(new Color(250, 223, 207));
				
				JButton song3 = new JButton("song 3");
				song3.setBounds(40, 270, 400, 50);
				song3.setFont(new Font("Cooper Black", Font.TRUETYPE_FONT, 20));
				song3.setBackground(new Color(247, 239, 208));
				
				JButton song4 = new JButton("song 4");
				song4.setBounds(40, 350, 400, 50);
				song4.setFont(new Font("Cooper Black", Font.TRUETYPE_FONT, 20));
				song4.setBackground(new Color(227, 250, 207));
				
				// Design a "back" button that links to the relaxation page
				bRelaxationBack.setBounds(344, 570, 100, 40);
				bRelaxationBack.setFont(new Font("Cooper Black", Font.PLAIN, 18));
				bRelaxationBack.setBackground(new Color(72, 115, 184));
				bRelaxationBack.setForeground(Color.WHITE);
				
				// Add an ActionListener that leads the user back to the activities page
				bRelaxationBack.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						
						// Clear and repaint the frame
						mindsetApp.frame.getContentPane().removeAll();
						mindsetApp.frame.repaint();
						
						// Link back to the activities page
						displayRelaxationPage();
						
					}
					
				});
				
				// Add the JButtons to the frame
				mindsetApp.frame.add(song1);
				mindsetApp.frame.add(song2);
				mindsetApp.frame.add(song3);
				mindsetApp.frame.add(song4);
				mindsetApp.frame.add(bRelaxationBack);
				
			}
			
		});
		
		// Create a "breathing" JButton
		JButton bBreathing = new JButton("breathing exercises");
		bBreathing.setBounds(40, 190, 400, 50);
		bBreathing.setFont(new Font("Cooper Black", Font.TRUETYPE_FONT, 20));
		bBreathing.setBackground(new Color(67, 54, 99));
		bBreathing.setForeground(Color.WHITE);
		
		// Add an ActionListener that links to the breathing exercises page of the app
		bBreathing.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Clear and repaint the frame
				mindsetApp.frame.getContentPane().removeAll();
				mindsetApp.frame.repaint();
				
				// Create a header for the breathing exercise page
				JLabel hInhaleExhale = new JLabel("inhale, exhale");
				hInhaleExhale.setBounds(100, 25, 350, 50);
				hInhaleExhale.setFont(new Font("Cooper Black", Font.PLAIN, 40));
				hInhaleExhale.setForeground(new Color(67, 54, 99));
				
				// Add the header to the frame
				mindsetApp.frame.add(hInhaleExhale);
				
				// Add an instructions button for the guided breathing
				JLabel breathInstruct = new JLabel("Click the \"relax\" button, taking deep breaths for 1 minute.");
				breathInstruct.setBounds(40, 100, 490, 30);
				breathInstruct.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
				
				// Add the breathing instructions to the frame
				mindsetApp.frame.add(breathInstruct);
				
				JButton relax = new JButton("relax");
				relax.setBounds(140, 160, 180, 50);
				relax.setFont(new Font("Cooper Black", Font.TRUETYPE_FONT, 20));
				relax.setBackground(new Color(107, 109, 179));
				relax.setForeground(Color.WHITE);
				
				relax.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						
						// Repaint the frame
						mindsetApp.frame.repaint();
						
						// Include a JLabel for the time left
						time.setBounds(160, 250, 120, 50);
						time.setFont(new Font("Cooper Black", Font.PLAIN, 20));
						time.setForeground(Color.BLACK);
						
						// Add the time JLabel to the frame
						mindsetApp.frame.add(time);
						
						// JLabel for the timer
						timerLabel.setBounds(250, 250, 200, 50);
						timerLabel.setFont(new Font("Cooper Black", Font.PLAIN, 20));
						timerLabel.setForeground(Color.BLACK);
						
						// Add the timer JLabel to the frame
						mindsetApp.frame.add(timerLabel);
						
						relaxTimer();
						
					}
					
					
					
				});
				
				// Design a "back" button that links to the relaxation page
				bRelaxationBack.setBounds(344, 570, 100, 40);
				bRelaxationBack.setFont(new Font("Cooper Black", Font.PLAIN, 18));
				bRelaxationBack.setBackground(new Color(72, 115, 184));
				bRelaxationBack.setForeground(Color.WHITE);
				
				// Add an ActionListener that leads the user back to the activities page
				bRelaxationBack.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						
						// Clear and repaint the frame
						mindsetApp.frame.getContentPane().removeAll();
						mindsetApp.frame.repaint();
						
						// Link back to the activities page
						displayRelaxationPage();
						
					}
					
				});
				
				// Add the JButtons to the frame
				mindsetApp.frame.add(relax);
				mindsetApp.frame.add(bRelaxationBack);
				
			}
		
		});
		
		// Add the relaxation activity JButtons to the frame
		mindsetApp.frame.add(bMusic);
		mindsetApp.frame.add(bBreathing);
		
		// Create a "back" button that links to the activities page
		JButton bActivitiesBack = new JButton("back");
		bActivitiesBack.setBounds(344, 570, 100, 40);
		bActivitiesBack.setFont(new Font("Cooper Black", Font.PLAIN, 18));
		bActivitiesBack.setBackground(new Color(72, 115, 184));
		bActivitiesBack.setForeground(Color.WHITE);
		
		// Add an ActionListener that leads the user back to the activities page
		bActivitiesBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Clear and repaint the frame
				mindsetApp.frame.getContentPane().removeAll();
				mindsetApp.frame.repaint();
				
				// Link back to the activities page
				displayActivitiesPage();
				
			}
			
		});
		
		// Add the JButton to the frame
		mindsetApp.frame.add(bActivitiesBack);
		
	} // End of displayRelaxationPage() method
	
	/**
	 * The following is the timer for the guided breathing
	 */
	public static void relaxTimer() {
		
		// Initialize the timer variables
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
					
			int numberOfSeconds = 60; // set the number of seconds for the timer
			
			public void run() {
			
				timerLabel.setText("00:" + numberOfSeconds--); // set text of remaining seconds
						
				// Once the timer reaches 0, tell the user the exercise is complete
				if (numberOfSeconds == 0) {
					mindsetApp.frame.remove(time);
					timerLabel.setText("exercise complete!");
					timerLabel.setBounds(140, 250, 250, 50);
							
					timer.cancel(); // End the timer
				}
			}
					
		}, 0, 500);
		
	} // End of relaxTimer() method
	
	public static void displayReflectionsPage() {
		
		// Set the current design of the JFrame
		mindsetApp.frame.setSize(500, 700);
		mindsetApp.frame.getContentPane().setBackground(new Color(167, 202, 235));
		
		// Create a header for the reflections page
		JLabel hReflect = new JLabel("your thoughts");
		hReflect.setBounds(100, 25, 350, 50);
		hReflect.setFont(new Font("Cooper Black", Font.PLAIN, 40));
		hReflect.setForeground(new Color(97, 123, 171));
		
		// Add reflections page header to the frame
		mindsetApp.frame.add(hReflect);
		
		// Declare variables
		String reflectionOne = "reflect.txt";
		String reflectLine;
		
		// Create a JTextArea to store the information from the reflection in reflect.txt
		JTextArea aReflect = new JTextArea();
		aReflect.setBounds(18, 100, 445, 400);
		aReflect.setForeground(Color.BLACK);
		aReflect.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		aReflect.setOpaque(false); // make the JTextArea transparent
		
		// Add the JTextArea to the frame and make it non-editable
		mindsetApp.frame.add(aReflect);
		aReflect.setEditable(false);
		
		// Read data from the aboutmindset.txt file and add the information to the JTextArea
		try {
			BufferedReader reflectIn = new BufferedReader(new FileReader(reflectionOne));
					
			// Read in each line while the aboutmindset.txt file is empty and add
			// each one to the JTextArea
			while ((reflectLine = reflectIn.readLine()) != null) {
				aReflect.read(reflectIn, "a1");
			}
		}
				
		// Else, print an error message to the console regarding the reading of the file
		catch(IOException iox) {
			System.out.println("Problem reading " + reflectionOne);
		}
		
		// Create an "add reflections" JButton
		JButton addReflections = new JButton("add reflection");
		addReflections.setBounds(140, 480, 210, 40);
		addReflections.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		addReflections.setBackground(new Color(97, 123, 171));
		addReflections.setForeground(Color.WHITE);
		
		// Add JButton to the frame
		mindsetApp.frame.add(addReflections);
		
		// Create a back JButton
		JButton bReflectBack = new JButton("back");
		bReflectBack.setBounds(350, 580, 100, 40);
		bReflectBack.setFont(new Font("Cooper Black", Font.PLAIN, 18));
		bReflectBack.setBackground(new Color(72, 115, 184));
		bReflectBack.setForeground(Color.WHITE);
				
		// Add an ActionListener that leads the user back to the activities page
		bReflectBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
						
				// Clear and repaint the frame
				mindsetApp.frame.getContentPane().removeAll();
				mindsetApp.frame.repaint();
						
				// Link back to the activities page
				displayActivitiesPage();
						
			}
					
		});
				
		// Add the JButton to the frame
		mindsetApp.frame.add(bReflectBack);
		
	} // End of displayReflectionsPage() method
	
	/**
	 * The following method displays the progress tracker page
	 */
	public static void displayProgressPage() {
		
		// Set the current design of the JFrame
		mindsetApp.frame.setSize(500, 700);
		mindsetApp.frame.getContentPane().setBackground(new Color(167, 202, 235));
				
		// Create a header for the reflections page
		JLabel hProgress = new JLabel("your progress");
		hProgress.setBounds(100, 25, 350, 50);
		hProgress.setFont(new Font("Cooper Black", Font.PLAIN, 40));
		hProgress.setForeground(new Color(97, 123, 171));
				
		// Add the reflections page header to the frame
		mindsetApp.frame.add(hProgress);
		
		// Create a "coming soon!" JLabel
		JLabel newUpdate = new JLabel("coming soon!");
		newUpdate.setBounds(160, 100, 200, 40);
		newUpdate.setFont(new Font("Cooper Black", Font.PLAIN, 25));
		newUpdate.setForeground(Color.WHITE);
		
		// Add the "coming soon!" JLabel to the frame
		mindsetApp.frame.add(newUpdate);
		
		// Create a back JButton
		JButton bProgressBack = new JButton("back");
		bProgressBack.setBounds(350, 580, 100, 40);
		bProgressBack.setFont(new Font("Cooper Black", Font.PLAIN, 18));
		bProgressBack.setBackground(new Color(72, 115, 184));
		bProgressBack.setForeground(Color.WHITE);
						
		// Add an ActionListener that leads the user back to the activities page
		bProgressBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
								
				// Clear and repaint the frame
				mindsetApp.frame.getContentPane().removeAll();
				mindsetApp.frame.repaint();
								
				// Link back to the activities page
				displayActivitiesPage();
								
			}
							
		});
						
		// Add the JButton to the frame
		mindsetApp.frame.add(bProgressBack);
		
	} // End of displayProgressPage() method
	
}