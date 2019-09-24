package chapter_1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private static final long serialVersionUID = -7510237099461640737L;

	int x = 0;
	int y = 50;

	public MyPanel() {
		setBackground(Color.WHITE);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.setColor(new Color(255, 128, 0));
		int[] xpoly = { 0, 100, 200, 0 };
		int[] ypoly = { 0, 0, 300, 100 };
		Polygon poly = new Polygon(xpoly, ypoly, xpoly.length);
		xpoly[3] = x;
		ypoly[3] = y;
		poly = new Polygon(xpoly, ypoly, xpoly.length);
		g.clearRect(0, 0, 1000, 1000);
		g.fillPolygon(poly);
		
	}
    
	public void mouseDragged(MouseEvent e) {
		Point location = e.getPoint();
		double x = location.getX();
		double y = location.getY();
		System.out.println("X: " + x + ", Y: " + y);
	}
};
