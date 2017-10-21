import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JOptionPane;

public class MultipleChoice {
	
	
	public static void main(String[] args) {
		
		Random rand = new Random();
	
		ArrayList<String> questions = new ArrayList<String>() {{
			
			add("what does cvs stand for?");
			add("What does IDE stand for?");
			add("What does CPU stand for?");
			add("Define the term bit");
			add("Define the term byte");
			add("How many bytes in an int?");
			add("How many bytes in a kylobyte?");
			add("How Many bytes in megabyte?");
			
		}};
		Object[] result = questions.toArray();
		
		ArrayList<String> answers = new ArrayList<String>() {{
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
		
		int n = rand.nextInt(7);
		System.out.println(n);
		
		Object value = JOptionPane.showInputDialog(null, result[n]);		
			if (value.equals(answerInput[n])) {
				JOptionPane.showMessageDialog(null, "Correct!");
			} else {
				JOptionPane.showMessageDialog(null, "Incorrect!");
			}
	}


	
}
	


