package testWindow;


import javax.swing.JOptionPane;
import testWindow.People;
public class Coins {

	public static void main(String[] args) {
		
		
	//Game Begin
		
		People personA = new People("What is the name of your adventurer?");
		People personB = new People("What about his trusty sidekick?");
		String CoinsA = JOptionPane.showInputDialog("How many Coins did " + personA.firstName + " find?");
		String CoinsB = JOptionPane.showInputDialog("How many Coins did " + personB.firstName + " find?");
	
		int num1 = Integer.parseInt(CoinsA);
		int num2 = Integer.parseInt(CoinsB);
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null, personA.firstName + " combined his Coins with those collected by his trusty sidekick, " + personB.firstName + "...", "Combination", JOptionPane.PLAIN_MESSAGE);
		if (sum > 1 && sum < 10) {
		JOptionPane.showMessageDialog(null, "You guys worked hard, ending your search with " + sum + " Coins collectively!", "Coin Quantity", JOptionPane.PLAIN_MESSAGE);
		}
		else if (sum >= 10 && sum < 500) {
			JOptionPane.showMessageDialog(null, "Woah, awesome job! You guys collected " + sum + " Coins!", "Coin Quantity", JOptionPane.PLAIN_MESSAGE);	
			}
		else if (sum >= 500) {
			JOptionPane.showMessageDialog(null, "Somebody must have bought some Coins from the black market to come up with this amount!", "Coin Quantity", JOptionPane.PLAIN_MESSAGE);	
			}
		else if (sum < 0) {
		JOptionPane.showMessageDialog(null, "Somebody has unlocked the powers of the universe, bringing your total number of Coins to " + sum, "Coin Quantity", JOptionPane.PLAIN_MESSAGE);	
		}
		else {
		JOptionPane.showMessageDialog(null, "Someone either hasn't been pulling their weight, or got a little greedy", "Coin Quantity", JOptionPane.PLAIN_MESSAGE);
		} 
		
		JOptionPane.showMessageDialog(null, "Created by Quaid Rodgers, thanks for playing this wee little game!", "Thanks for playing!", JOptionPane.INFORMATION_MESSAGE);
		

	}

}
