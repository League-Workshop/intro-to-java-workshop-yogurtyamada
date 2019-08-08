package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		// 2.  Ask the user a question 
		String answer=JOptionPane.showInputDialog("what the max health you can have in fortnite");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equals("200")) {
		// 4.  if the user's answer was correct, add one to their score 
		score++;
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		 answer=JOptionPane.showInputDialog("how much damage does the heavysniper do to the head");
		if(answer.equals("392")) {
			score++;
			answer=JOptionPane.showInputDialog("how much damage does the trap do");
			if(answer.equals("150")) {
				score++;
				
			}

		}
		// 6.  After all the questions have been asked, print the user's score 
		System.out.println(score);
	}}

