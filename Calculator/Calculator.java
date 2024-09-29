import.javax.swing.*; // for the UI
import java.awt.*; // color, font and etc
import java.awt.event.*;


public class Calculator implements ActionListener{




	JFrame frame;
	JTextField textfield;
	JButton [] numberButtons = new JButton[10]; // 0 to 9 
	JButton[] functionButtons = new JButton[8]; 
	JButton addButton, subButton, mulButton, divButton; 
	JButton decButton, equButton, delButton, clrButton;
	JPanel panel; 


	Font myFont = new Font("Ink Free", Font.BOLD, 30);

	Calculator(){


	}


	public static void main(String[] args){

		Calculator calc = new Calculator();

	}


	public void actionPerformed( ActionEvent e){

	}
}