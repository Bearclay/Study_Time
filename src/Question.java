import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.ListModel;

public class Question extends AddQuestions {
	private String question;
	private String answer;
	private JFrame window;
	private JTextArea answerBox = new JTextArea();
	private JButton submitButton = new JButton("Submit");
	private JButton addQuestionsButton = new JButton("Add Questions Fuckboy");

	// Constructor
	public Question(String questionIn, String answerIn) {

		question = questionIn;
		answer = answerIn;	

		JPanel topPanel = new JPanel();
		topPanel.setLayout(new BorderLayout());

		final int NUM_PANELS = 10;
		JPanel layers[] = new JPanel[NUM_PANELS];
		for (int i = 0; i < NUM_PANELS; i++) {
			layers[i] = new JPanel();

			submitButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					synchronized(Question.this) {
						Question.this.notifyAll();
					}
				}
			});
			
			addQuestionsButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					synchronized(Question.this) {
						Question.this.notifyAll();
					}
				}
			});
		}
	}
}





