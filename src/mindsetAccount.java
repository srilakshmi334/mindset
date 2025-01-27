// Import the following packages:
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * The following class checks and stores the user's account information 
 * @author Sri
 *
 */
public class mindsetAccount {
	
	// Class variables
	static String name;
	static String username;
	private static String pwd;
	
	/**
	 * The following constructor includes the user's account information
	 * @param name
	 * @param username
	 * @param pwd
	 */
	public mindsetAccount(String name, String username, String pwd) {
		this.name = name;
		this.username = username;
		this.pwd = pwd;
		
	} // End of mindsetAccount() constructor
	
	/**
	 * The following method retrieves the name entered by the user
	 * @return name
	 */
	public String getname() {
		return name;
	}
	
	/**
	 * The following method checks the user information from sign-up with login
	 * @param inputName
	 * @param inputUser
	 * @param inputPwd
	 * @return
	 */
	public static boolean checkInformation(String inputName, String inputUser, String inputPwd) {
		
		// Using a try/catch statement, check if the information entered by the user on sign-up
		// is the same used during login
		
		// If the user info is a match, return true
		try {
			if(name.equals(inputName) && username.equals(inputUser) && pwd.equals(inputPwd)) {
				return true;
			}
			
		// If the user info cannot be accessed, return false
		} catch(NullPointerException e) {
			return false;
		}
		
		// If the user info is not a match, return false
		return false;
	
	} // End of checkInformation() method
	
}