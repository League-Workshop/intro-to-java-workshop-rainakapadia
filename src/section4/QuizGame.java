package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score= 0;
		// 2.  Ask the user a question 
		JOptionPane.showMessageDialog(null, "Welcome. The quiz today is on basic math");
		String answer =JOptionPane.showInputDialog("what is 12+13? ");
		if (answer.equals("25")) {
			JOptionPane.showMessageDialog(null, "Correct :) ");
			score+=5;
			
			
		}else {
			JOptionPane.showMessageDialog(null, "Wrong :( ");
			score-=5;
		
	}
		String answer0 =JOptionPane.showInputDialog("what is 245+80 ");
		if (answer0.equals("325")) {
			JOptionPane.showMessageDialog(null, "Correct :) ");
			score+=5;
			
			
		}else {
			JOptionPane.showMessageDialog(null, "Wrong :( ");
			score-=5;
		}
		String answer1 =JOptionPane.showInputDialog("what is 789+234? ");
		if (answer1.equals("1023")) {
			JOptionPane.showMessageDialog(null, "Correct :) ");
			score+=5;
			
			
		}else {
			JOptionPane.showMessageDialog(null, "Wrong :( ");
			score-=5;
		}
		String answer2 =JOptionPane.showInputDialog("what is 560+235 ");
		if (answer2.equals("795")) {
			JOptionPane.showMessageDialog(null, "Correct :) ");
			score+=5;
			
			
		}else {
			JOptionPane.showMessageDialog(null, "Wrong :( ");
			score-=5;
		}
		
		// 3.  Use an if statement to check if their answer is correct
		
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "your total score is"+score);
	}
}
