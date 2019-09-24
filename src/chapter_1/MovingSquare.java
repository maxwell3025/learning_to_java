package chapter_1;

import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseEvent;

public class MovingSquare extends JFrame {
	private JPanel panel;
    public MovingSquare() {
        panel = new MyPanel();    
        add(panel, BorderLayout.CENTER);
    }

	public static void main(String[] args) {
		MovingSquare frame = new MovingSquare();

        frame.setSize(600, 400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}
}
