package Practice;

import javax.swing.JOptionPane;

public class SimpleGuiPro {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter your name");
		
		
		//converting string to integer
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		
		
		//converting string to double
		double hight = Double.parseDouble(JOptionPane.showInputDialog("Enter your hight"));
		
		JOptionPane.showMessageDialog(null, "Hello "+name);
		JOptionPane.showMessageDialog(null,"You are "+age+"years old");
		JOptionPane.showMessageDialog(null,"and your hight is"+hight+" feet");

	}

}
