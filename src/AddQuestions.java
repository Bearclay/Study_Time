import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class AddQuestions {
	
	public static void main(String[] args) {

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
	Object[] questionList = questions.toArray();

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
	
	Object[] answerInput = answers.toArray();	

	int n = 0;		
	n = random(n);
	System.out.print(answerInput[n]);

	// Creates GUI, adds question		
	String value = JOptionPane.showInputDialog(null, questionList[n]);	
	//System.out.print(value);
	if (value.equals(answerInput[n])) {
		JOptionPane.showMessageDialog(null, "Correct!");
	} else {
		JOptionPane.showMessageDialog(null, "Incorrect!");
	}
	
	n = random(n);
	while (value.equals(answerInput[n])) {
		value = JOptionPane.showInputDialog(null, questionList[n]);
	}
}

	public static int random(int n) {
		Random rand = new Random();
		n = rand.nextInt(8);
		return n;
	}
}





