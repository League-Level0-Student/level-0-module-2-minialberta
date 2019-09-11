package _14_rollercoaster;

import javax.swing.JOptionPane;

public class rollercoaster {
	public static void main(String[] args) {
		
	

String quantity=JOptionPane.showInputDialog("How tall are you?(inches)");
int num=Integer.parseInt(quantity);

if(num>=48) {
	JOptionPane.showMessageDialog(null, "You can go on the ride");
}else {
	JOptionPane.showMessageDialog(null, "You're too short!");
}


}
}