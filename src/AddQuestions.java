import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class AddQuestions {
	
	public static void main(String[] args) {
		
	// Uses true to constantly loop the program to ask the user questions.	
	while(true) {
		
	// An array list of questions. An array list was chosen so that I can dynamically add to the list. 
	ArrayList<String> questions = new ArrayList<String>() {
		
		private static final long serialVersionUID = 1L;

	{

		add("what does cvs stand for?");
		add("What does IDE stand for?");
		add("What does CPU stand for?");
		add("Define the term bit");
		add("Define the term byte");
		add("How many bytes in an int?");
		add("How many bytes in a kylobyte?");
		add("How Many bytes in megabyte?");

		}};
	// Makes the array list questions an array, this is to fix the position of questions and answers	
	Object[] questionList = questions.toArray();
	
	// An array list of answers 
	ArrayList<String> answers = new ArrayList<String>() {
		
		private static final long serialVersionUID = 1L;

	{
		add("Concurrent Versioning System");
		add("Integrated Development Environment");
		add("Central Processing Unit");
		add("Either a 1 or a 0");
		add("A sequence of 8 bits");
		add("4");
		add("1024");
		add("1000000");
	}};
	
	// Turns array list of questions into an array of answers.
	Object[] answerInput = answers.toArray();	
	
	/* Declares an integer n then runs it through the "Random static method" to get 
	 * a random integer to generate our question. 	 */
	int n = 0;		
	n = random(n);
	//System.out.print(answerInput[n]);

	// Creates GUI, adds question		
	String value = JOptionPane.showInputDialog(null, questionList[n]);
	
	/* Compares submitted answer's position in the Array List to the position in answers Array List to determine 
	 * it's accuracy */
	if (value.equals(answerInput[n])) {
		JOptionPane.showMessageDialog(null, "Correct!");
	} else {
		JOptionPane.showMessageDialog(null, "Incorrect!");
	}
	
	}
}
	
	// Static method to return a random number between 0-8. 
	public static int random(int n) {
		Random rand = new Random();
		n = rand.nextInt(8);
		return n;
	}
}





