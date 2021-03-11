import javax.swing.*;

/**
 * 
 * @author Nursultan Zhumabaev
 * @CUNY_ID 23827722
 * @lab 11E
 * @description: This program ask the user to type in a sentence and than tell the user how many upper and lower of E
 *
 */

public class Project0 {
	public static void main(String[] args) {
		String UserInput;
		int counter_E=0;
		int counter_e=0;
		
		
		
		//This line implement poping out window to make user input 
		UserInput =JOptionPane.showInputDialog(null, "Please enter a sentence:");
		
		//this loops count how many time the upper case letter 'E' and lower case letter 'e' appers.
		for(int i=0; i<UserInput.length(); i++){
			if(UserInput.charAt(i)=='E')
			counter_E =counter_E+1;
			else if(UserInput.charAt(i)=='e')
			counter_e =counter_e+1;
			else if(UserInput.equalsIgnoreCase("STOP")) {
			System.exit(0); // terminate the program
			}
		}
		
		//tell the user how many upper and lower case e's were in the string
		JOptionPane.showMessageDialog(null, "Number of upper case E's: "+ counter_E+" \nNumber of lower case e's: "+ counter_e);
	}
}
