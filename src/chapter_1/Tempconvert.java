package chapter_1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Tempconvert extends Frame implements ActionListener, WindowListener{
Button button;
Tempconvert(String s){
	
	super(s);
	setBackground(Color.white);
	int x = 1000;
	int y = 1000;
	setSize(x,y);
	setLayout(new GridLayout(1,1));
	button = new Button("");
	add(button);
	button.addActionListener(this);
	setVisible(true);
}
	public void actionPerformed(ActionEvent event) {
		
		int x=100;
		int y=100;
		
	if(event.getActionCommand().equals("")){
		System.out.println("hi");
	}
	}
public static void main(String[]args){
	int x = 10;
	int y = 10;
	Tempconvert buttonframe= new Tempconvert("hi");
}
public void windowOpened(WindowEvent e) {}
public void windowClosing(WindowEvent event) {
	System.exit(0);
}
public void windowClosed(WindowEvent e) {}
public void windowIconified(WindowEvent e) {}
public void windowDeiconified(WindowEvent e) {}
public void windowActivated(WindowEvent e) {}
public void windowDeactivated(WindowEvent e) {}
}
