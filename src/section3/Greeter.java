package section3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String name=JOptionPane.showInputDialog("what is your name?");
		JOptionPane.showMessageDialog(null, "Hello "+name+"."+" How are you?");
	
	}

}
