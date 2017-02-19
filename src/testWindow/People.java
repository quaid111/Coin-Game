package testWindow;
import javax.swing.JOptionPane;
public class People {
public String firstName;
People(String namePrompt) {
	firstName = JOptionPane.showInputDialog(namePrompt);
}
}
