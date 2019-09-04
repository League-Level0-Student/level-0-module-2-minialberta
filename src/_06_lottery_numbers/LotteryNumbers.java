package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

	public static void main(String[] args) {
		Random randomMaker = new Random();
		int random1=randomMaker.nextInt(100);
		int random2=randomMaker.nextInt(100);
		int random3=randomMaker.nextInt(100);
		int random4=randomMaker.nextInt(100);
		int random5=randomMaker.nextInt(100);
		
		JOptionPane.showMessageDialog(null, "Lottery Numbers: "+random1+" "+random2+" "+random3+" "+random4+" "+random5);
		
	}
}
