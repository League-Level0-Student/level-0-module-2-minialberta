package _15_voting_booth;

import javax.swing.JOptionPane;

public class votingbooth {
public static void main(String[] args) {
	
	

String quantity=JOptionPane.showInputDialog("How old are you?");
int num=Integer.parseInt(quantity);

if(num>=18) {
JOptionPane.showInputDialog(null, "Who do you want to be President?");
}else {
JOptionPane.showMessageDialog(null, "No one cares what you think");
}


}

}

