package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class guru_register implements ActionListener{
	JFrame frame;
	JPanel p1,p2;
	JLabel l1;
	JButton b1;
	guru_register(){
		frame = new JFrame("Reg Start up");
		p1  = new JPanel();
		p2  = new JPanel();
		l1 = new JLabel("Welcome to the Registration");
		l1.setFont(new Font("Courier", Font.PLAIN, 32));
		b1 = new JButton("Register");
		b1.setSize(50,50);
		
		b1.addActionListener(this);
		
		p1.add(l1);
		p1.setSize(500,250);
		p2.setSize(500,50);
		p2.add(b1);
		frame.add(p1);
		frame.add(p2);
		frame.setSize(500,300);
		frame.setLayout(new GridLayout(2,1));
		frame.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			new Registration();
			
		}
		
	}
	public static void main(String args[]) {
		new guru_register();
	}
	
}