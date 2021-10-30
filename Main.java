import javax.swing.JOptionPane;

public class Main {
	public static void main (String args[]){
		String input;
		int answer;
		boolean bool;
		
    \

		JOptionPane.showMessageDialog(null, "Welcome to our guessing Game!","Welcome!", JOptionPane.INFORMATION_MESSAGE);
		
		//Question 1
		input= JOptionPane.showInputDialog(null, "How many students are in HSN?\n 1450, 1600, 1780","Question #1",JOptionPane.INFORMATION_MESSAGE);
		answer= Integer.parseInt(input);
		
		bool= (answer==1600);
		JOptionPane.showMessageDialog(null, bool+" The answer is 1600","Question #1 Answer",JOptionPane.INFORMATION_MESSAGE);
		
		//Question 2
		input= JOptionPane.showInputDialog(null, "What is the name of the person sitting in front of me?","Question #2",JOptionPane.INFORMATION_MESSAGE);
		
		bool= input.equals("Arnav");
		JOptionPane.showMessageDialog(null, bool+" The answer is Arnav!","Question #2",JOptionPane.INFORMATION_MESSAGE);
		
		//Question 3
		input= JOptionPane.showInputDialog(null, "How old am I?\n13, 14, 15","Question #3",JOptionPane.INFORMATION_MESSAGE);
		answer= Integer.parseInt(input);
		
		bool= (answer==14);

		JOptionPane.showMessageDialog(null, bool+" The answer is 14","Question #3 Answer",JOptionPane.INFORMATION_MESSAGE);
		//Question 4
		input= JOptionPane.showInputDialog(null, "How many computers are there in room 117?\n30, 28, 24","Question #4",JOptionPane.INFORMATION_MESSAGE);
		answer= Integer.parseInt(input);
				
		bool= (answer==24);
		JOptionPane.showMessageDialog(null, bool+" The answer is 24","Question #4 Answer",JOptionPane.INFORMATION_MESSAGE);
		
		//Question 5
		input= JOptionPane.showInputDialog(null, "Who is the richest man alive?\n Jeff Bezos, Elon Musk, Bill Gates","Question #5",JOptionPane.INFORMATION_MESSAGE);
				
		bool= input.equals("Jeff Bezos");
		JOptionPane.showMessageDialog(null, bool+" The answer is Jeff Bezos!","Question #5",JOptionPane.INFORMATION_MESSAGE);
	}
}